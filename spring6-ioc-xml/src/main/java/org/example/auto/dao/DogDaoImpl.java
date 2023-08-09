package org.example.auto.dao;

/**
 * @Author: Diao Rui
 * @className: DogDaoImpl
 * @Description: TODO
 * @DateTime: 2023/8/3 11:08
 * @version: 1.0
 **/
public class DogDaoImpl implements DogDao{
    @Override
    public void shout() {
        System.out.println("dao被调用了");
    }
}
