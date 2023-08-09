package com;

import org.springframework.core.io.UrlResource;

/**
 * @Author: Diao Rui
 * @className: UrlResourceDemo
 * @Description: TODO
 * @DateTime: 2023/8/9 14:44
 * @version: 1.0
 **/
public class UrlResourceDemo {
    public static void main(String[] args) {
        String url = "https://www.baidu.com";
        String path = "file:info.txt";
        loadUrlResource(url);
        loadUrlResource(path);
    }

    //访问前缀HTTP、file
    public static void loadUrlResource(String url){
        try {
            //创建Resource类的实现类URLResource
            UrlResource resource = new UrlResource(url);
            //获取资源名
            System.out.println(resource.getFilename());
            //获取资源IP地址
            System.out.println(resource.getURI());
            //获取资源描述
            System.out.println(resource.getDescription());
            //获取资源内容
            System.out.println(resource.getInputStream().read());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
