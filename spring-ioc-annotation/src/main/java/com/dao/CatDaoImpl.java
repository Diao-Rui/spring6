package com.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author: Diao Rui
 * @className: CatDaoImpl
 * @Description: TODO
 * @DateTime: 2023/8/3 14:21
 * @version: 1.0
 **/
@Repository
public class CatDaoImpl implements CatDao{
    @Override
    public void add() {
        System.out.println("dao...");
    }
}
