package com;

import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;

/**
 * @Author: Diao Rui
 * @className: ClassPathResourceDemo
 * @Description: TODO
 * @DateTime: 2023/8/9 14:58
 * @version: 1.0
 **/
public class ClassPathResourceDemo {
    public static void main(String[] args) {
        loadClassPathResources("info.txt");
    }

    //读取类路径下的资源
    public static void loadClassPathResources(String path) {
        try {
            ClassPathResource res = new ClassPathResource(path);
            System.out.println("文件名：" + res.getFilename());
            System.out.println("文件描述:" + res.getDescription());
            System.out.println("获取文件内容：");
            InputStream inputStream = res.getInputStream();
            //获取文件内容
            InputStream in = res.getInputStream();
            byte[] b = new byte[1024];
            //用来记录当前获取的字符数量
            int len = 0;
            while ((len = in.read(b)) != -1) {
                System.out.println(new String(b, 0, len));
            }
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
