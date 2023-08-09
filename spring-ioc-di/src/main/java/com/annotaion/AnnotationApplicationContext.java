package com.annotaion;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Diao Rui
 * @className: AnnotationApplicationContext
 * @Description: TODO
 * @DateTime: 2023/8/4 11:04
 * @version: 1.0
 **/
public class AnnotationApplicationContext implements ApplicationContext {
    //存放bean的容器
    private Map<Class, Object> beanFactory = new HashMap<>();
    //根路径去除包名之外的绝对路径
    private static String rootPath;

    //获取bean通过类
    @Override
    public Object getBean(Class clazz) {
        return beanFactory.get(clazz);
    }

    //创建有参数构造，传递包路径，设置包扫描规则
    //当前包及其子包，那个类有@Bean注解，把这个类通过反射实例化
    public AnnotationApplicationContext(String basePackage) {
        try {
            String packageDirName = basePackage.replaceAll("\\.", "\\\\");
            System.out.println("packageDirName" + packageDirName);
            Enumeration<URL> dirs = Thread.currentThread().getContextClassLoader()
                    .getResources(packageDirName);
            while (dirs.hasMoreElements()) {
                URL url = dirs.nextElement();
                String filePath = URLDecoder.decode(url.getFile(), StandardCharsets.UTF_8);
                rootPath = filePath.substring(0, filePath.length() - packageDirName.length());
                loadBean(new File(filePath));
            }
            loadDi();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //依赖注入
    private void loadDi() {
        //实例化对象在beanFactory的map集合里面
        //遍历BeanFactory的map集合
        Set<Map.Entry<Class, Object>> entries = beanFactory.entrySet();
        //获取map集合的每个对象，
        for (Map.Entry<Class, Object> entry : entries) {
            Object value = entry.getValue();
            //获取每个对象的所有属性
            Class<?> clazz = value.getClass();
            Field[] declaredFields = clazz.getDeclaredFields();
            for (Field field : declaredFields) {
                //判断属性上面是否有Di注解
                Di annotation = field.getAnnotation(Di.class);
                //如果有Di注解
                if (annotation != null) {
                    field.setAccessible(true);
                    try {
                        //field.getType()属性的类型大的Class
                        field.set(value, beanFactory.get(field.getType()));
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }


        //获取Di注解的value值

        //把value值当做参数传进去

        //通过反射实例化对象

        //把对象放到map集合中
    }

    private void loadBean(File fileParent) {
        if (fileParent.isDirectory()) {
            File[] childrenFiles = fileParent.listFiles();
            if (childrenFiles == null || childrenFiles.length == 0) {
                return;
            }
            for (File child : childrenFiles) {
                if (child.isDirectory()) {
                    //如果是个文件夹就继续调用该方法,使用了递归
                    loadBean(child);
                } else {
                    //通过文件路径转变成全类名,第一步把绝对路径部分去掉
                    String pathWithClass = child.getAbsolutePath().substring(rootPath.length() - 1);
                    //选中class文件
                    if (pathWithClass.contains(".class")) {
                        //    com.xinzhi.dao.UserDao
                        //去掉.class后缀，并且把 \ 替换成 .
                        String fullName = pathWithClass.replaceAll("\\\\", ".").replace(".class", "");
                        try {
                            Class<?> aClass = Class.forName(fullName);
                            //把非接口的类实例化放在map中
                            if (!aClass.isInterface()) {
                                Bean annotation = aClass.getAnnotation(Bean.class);
                                if (annotation != null) {
                                    //创建对象
                                    Object instance = aClass.getDeclaredConstructor().newInstance();
                                    //判断一下有没有接口
                                    if (aClass.getInterfaces().length > 0) {
                                        //如果有接口把接口的class当成key，实例对象当成value
                                        System.out.println("正在加载【" + aClass.getInterfaces()[0] + "】,实例对象是：" + instance.getClass().getName());
                                        beanFactory.put(aClass.getInterfaces()[0], instance);
                                    } else {
                                        //如果没有接口把自己的class当成key，实例对象当成value
                                        System.out.println("正在加载【" + aClass.getName() + "】,实例对象是：" + instance.getClass().getName());
                                        beanFactory.put(aClass, instance);
                                    }
                                }
                            }
                        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException | NoSuchMethodException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }

}
