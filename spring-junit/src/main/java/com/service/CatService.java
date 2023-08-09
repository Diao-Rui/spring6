package com.service;

import com.entity.Cat;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @Author: Diao Rui
 * @className: CatService
 * @Description: TODO
 * @DateTime: 2023/8/8 14:25
 * @version: 1.0
 **/
@Service
public class CatService {
    //自动装配
    @Resource
    private Cat cat;

    public void show(){
        cat.setName("cat");
        cat.setAge(18);
        System.out.println(cat);
    }
}
