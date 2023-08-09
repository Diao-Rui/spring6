package org.example.auto.service;

import org.example.auto.dao.DogDao;

/**
 * @Author: Diao Rui
 * @className: DogServiceImpl
 * @Description: TODO
 * @DateTime: 2023/8/3 11:09
 * @version: 1.0
 **/
public class DogServiceImpl implements DogService {
    private DogDao dogDao;

    public void setDogDao(DogDao dogDao) {
        this.dogDao = dogDao;
    }

    @Override
    public void shout() {
        System.out.println("service被调用了");
        dogDao.shout();
    }
}
