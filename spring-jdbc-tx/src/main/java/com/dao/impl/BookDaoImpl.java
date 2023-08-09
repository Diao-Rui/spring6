package com.dao.impl;

import com.dao.BookDao;
import com.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author: Diao Rui
 * @className: BookDaoImpl
 * @Description: TODO
 * @DateTime: 2023/8/8 16:51
 * @version: 1.0
 **/
@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int getBookPrice(Integer bookId) {
        String sql = "select * from book where book_Id = ?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Book.class), bookId);
        if (book != null) {
            return book.getPrice();
        }
        return 0;
    }

    @Override
    public void updateStock(Integer bookId, Integer count) {
        String sql = "update book set stock = book.stock - ? where book_id = ?";
        int update = jdbcTemplate.update(sql, count, bookId);
        if (update > 0) {
            System.out.println("库存更新成功");
        } else {
            System.out.println("库存不足");
        }
    }
}
