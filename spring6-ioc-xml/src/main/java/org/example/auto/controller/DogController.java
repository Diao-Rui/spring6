package org.example.auto.controller;

import org.example.auto.service.DogService;

/**
 * @Author: Diao Rui
 * @className: DogController
 * @Description: TODO
 * @DateTime: 2023/8/3 11:06
 * @version: 1.0
 **/
public class DogController {
    private DogService dogService;

    public void setDogService(DogService dogService) {
        this.dogService = dogService;
    }

    public void shout() {
        System.out.println("DogController被调用了");
        dogService.shout();
    }
}
