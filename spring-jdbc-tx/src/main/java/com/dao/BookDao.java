package com.dao;

/**
 * @Author: Diao Rui
 * @className: BookDao
 * @Description: TODO
 * @DateTime: 2023/8/8 16:51
 * @version: 1.0
 **/
public interface BookDao {
    public int getBookPrice(Integer bookId);

    public void updateStock(Integer bookId, Integer count);
}
