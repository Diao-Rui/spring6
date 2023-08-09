package com.pojo;

import org.springframework.stereotype.Component;

/**
 * @Author: Diao Rui
 * @className: Cat
 * @Description: TODO
 * @DateTime: 2023/8/3 14:23
 * @version: 1.0
 **/
//<bean id="cat" class ="com.pojo.Cat"  />
//使用注解配置bean
@Component(value = "cat")
public class Cat {
}
