package com;

import org.springframework.core.io.FileSystemResource;

import java.io.InputStream;

/**
 * @Author: Diao Rui
 * @className: FileSystemResourceDemo
 * @Description: TODO
 * @DateTime: 2023/8/9 15:14
 * @version: 1.0
 **/
public class FileSystemResourceDemo {
    public static void main(String[] args) {
        //相对路径
        loadFileSystemResources("info.txt");
    }

    public static void loadFileSystemResources(String path) {
        try {
            FileSystemResource resource = new FileSystemResource(path);
            System.out.println(resource.getFilename());
            System.out.println(resource.getDescription());
            InputStream inputStream = resource.getInputStream();
            byte[] bytes = new byte[1024];
            while (inputStream.read(bytes) != -1) {
                System.out.println(new String(bytes));
            }
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
