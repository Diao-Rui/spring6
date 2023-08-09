package com.controller;

import com.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author: Diao Rui
 * @className: CatController
 * @Description: TODO
 * @DateTime: 2023/8/3 14:32
 * @version: 1.0
 **/
@Controller
public class CatController {
    private CatService catService;

    //set方法注入
    @Autowired
    public void setCatService(CatService catService) {
        this.catService = catService;
    }

    public void add() {
        System.out.println("controller...");
        catService.add();
    }
}
