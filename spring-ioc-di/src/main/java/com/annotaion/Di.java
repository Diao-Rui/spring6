package com.annotaion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: Diao Rui
 * @className: Di
 * @Description: TODO
 * @DateTime: 2023/8/4 10:57
 * @version: 1.0
 **/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Di {
}
