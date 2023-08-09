package com;

import com.pojo.Bird;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: Diao Rui
 * @className: RefectTest
 * @Description: TODO
 * @DateTime: 2023/8/3 16:28
 * @version: 1.0
 **/
public class RefectTest {
    public static void main(String[] args) throws Exception {
        testMethod();
    }

    public static void testClass() throws ClassNotFoundException {
        //获取Class的多种方式
        /*
         * 1.根据类.class
         * 2.根据对象.getClass
         * 3.根据Class.forName（全路径名）
         * 4.通过类加载器
         *   通过当前类.class.getClassLoader获取类加载器
         *   通过类加载器的loadClass(全路径名)方法加载类
         * */

        //1.根据类.class
        Class<Bird> birdClass = Bird.class;
        Bird bird = new Bird();
        //2.根据对象.getClass
        Class<? extends Bird> aClass = bird.getClass();
        //3.根据Class.forName
        Class<?> clazz = Class.forName("com.pojo.Bird");
        //4.通过类加载器
        ClassLoader classLoader = RefectTest.class.getClassLoader();
        Class<?> aClass1 = classLoader.loadClass("com.pojo.Bird");
    }

    public static void testConstructor() throws Exception {
        /*
         * 1.getConstructors获取构造器（只能获取公有构造器）
         * 2.getDeclaredConstructors获取所有构造器
         * */
        Class<?> clazz = Class.forName("com.pojo.Bird");
        //获取所有公有构造器
        Constructor<?>[] constructors = clazz.getConstructors();
        //获取所有构造器
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        System.out.println("使用getConstructors获取构造器");
        for (Constructor<?> constructor : constructors) {
            System.out.println("构造器名称：" + constructor.getName() +
                    " 构造器参数：" + constructor.getParameterCount());
        }
        System.out.println("使用getDeclaredConstructor获取构造器");
        for (Constructor<?> constructor : declaredConstructors) {
            System.out.println("构造器名称：" + constructor.getName() +
                    " 构造器参数：" + constructor.getParameterCount());
        }
        //创建对象
        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class, int.class);
        //设置可以访问
        declaredConstructor.setAccessible(true);
        //创建对象
        Object o = declaredConstructor.newInstance("喜鹊", 2, 150);
        Bird bird = (Bird) o;
        System.out.println(o);

    }

    public static void testMethod() throws Exception {
        /*
         * 1.getMethods获取所有公有方法
         * 2.getDeclaredMethods获取所有方法
         * */
        Class<?> clazz = Class.forName("com.pojo.Bird");
        //获取所有公有方法
        Method[] methods = clazz.getMethods();
        //获取所有方法
        Method[] declaredMethods = clazz.getDeclaredMethods();
        System.out.println("使用getMethods获取所有公有方法");
        for (Method method : methods) {
            System.out.println("方法名称：" + method.getName() +
                    " 方法参数：" + method.getParameterCount());
        }
        System.out.println("使用getDeclaredMethods获取所有方法");
        for (Method method : declaredMethods) {
            System.out.println("方法名称：" + method.getName() +
                    " 方法参数：" + method.getParameterCount());
        }
        //创建对象
        Object o = clazz.getDeclaredConstructor().newInstance();
        Bird bird = (Bird) o;
        Method work = clazz.getDeclaredMethod("work");
        work.setAccessible(true);
        //调用方法（对象，参数列表）
        work.invoke(bird);
        //声明方法（方法名，Class类型）
        Method run = clazz.getDeclaredMethod("run");
        run.setAccessible(true);
        //调用方法
        run.invoke(bird);
        //操作静态方法
        Method hava = clazz.getDeclaredMethod("hava");
        hava.setAccessible(true);
        //调用静态方法
        hava.invoke(null);
    }

    public static void testField() throws Exception {
        /*
         * 1.getFields获取所有公有字段
         * 2.getDeclaredFields获取所有字段
         * */
        Class<?> clazz = Class.forName("com.pojo.Bird");
        //获取所有公有字段
        Field[] fields = clazz.getFields();
        //获取所有字段
        Field[] declaredFields = clazz.getDeclaredFields();
        System.out.println("使用getFields获取所有公有字段");
        for (Field field : fields) {
            System.out.println("字段名称：" + field.getName() +
                    " 字段类型：" + field.getType());
        }
        System.out.println("使用getDeclaredFields获取所有字段");
        for (Field field : declaredFields) {
            System.out.println("字段名称：" + field.getName() +
                    " 字段类型：" + field.getType());
        }
        //给字段赋值
        Object o = clazz.getDeclaredConstructor().newInstance();
        Bird bird = (Bird) o;
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(bird, "黄丽");
        Field age = clazz.getDeclaredField("age");
        age.setAccessible(true);
        age.set(bird, 20);
        Field speed = clazz.getDeclaredField("speed");
        speed.setAccessible(true);
        speed.set(bird, 100);
        System.out.println(bird);
    }

}
