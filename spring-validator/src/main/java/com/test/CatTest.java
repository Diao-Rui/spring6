package com.test;

import com.config.CatValidator;
import com.entity.Cat;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

/**
 * @Author: Diao Rui
 * @className: CatTest
 * @Description: TODO
 * @DateTime: 2023/8/10 11:41
 * @version: 1.0
 **/
public class CatTest {
    public static void main(String[] args) {
        //创建对象
        Cat cat = new Cat();
        //设置属性
        cat.setAge(21);
        //创建校验器
        DataBinder dataBinder = new DataBinder(cat);
        //设置校验器
        dataBinder.setValidator(new CatValidator());
        //执行校验
        dataBinder.validate();

        //查看校验结果
        BindingResult bindingResult = dataBinder.getBindingResult();
        System.out.println(bindingResult);
    }
}
