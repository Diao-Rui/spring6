package com.config;

import com.entity.Cat;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @Author: Diao Rui
 * @className: CatValidator
 * @Description: TODO
 * @DateTime: 2023/8/10 11:31
 * @version: 1.0
 **/
public class CatValidator implements Validator {
    //判断是否为检验的类
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(Cat.class);
    }

    //设置校验规则
    @Override
    public void validate(Object target, Errors errors) {
        //名称不能为空
        ValidationUtils.rejectIfEmpty(errors, "name",
                "name.empty", "name is required");

        //年龄符合规范
        Cat cat = (Cat) target;
        if (cat.getAge() < 0) {
            errors.rejectValue("age", "age.value.error"
                    , "Age must be greater than zero");
        } else if (cat.getAge() > 20) {
            errors.rejectValue("age", "age.value.error", "Age must be smaller than 20");
        }
    }
}
