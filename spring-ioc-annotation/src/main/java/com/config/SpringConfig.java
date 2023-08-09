package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Diao Rui
 * @className: SpringConfig
 * @Description: spring配置类代替配置文件
 * @DateTime: 2023/8/3 15:38
 * @version: 1.0
 **/
@Configuration
//包扫描路径
@ComponentScan(basePackages = "com")
public class SpringConfig {
}
