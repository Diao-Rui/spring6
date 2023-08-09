package com.service;

import com.dao.CatDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Diao Rui
 * @className: CatServiceImpl
 * @Description: TODO
 * @DateTime: 2023/8/3 14:22
 * @version: 1.0
 **/
@Service
public class CatServiceImpl implements CatService {
    /*
     * 注入dao
     * 第一种方法 属性注入
     * 根据类型找到对应的对象，完成注入
     * */
    private CatDao catDao;

    //构造器注入
    @Autowired
    public CatServiceImpl(CatDao catDao) {
        this.catDao = catDao;
    }

    @Override
    public void add() {
        System.out.println("service...");
        catDao.add();
    }
}
