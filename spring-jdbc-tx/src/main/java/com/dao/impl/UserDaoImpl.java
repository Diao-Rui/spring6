package com.dao.impl;

import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author: Diao Rui
 * @className: UserDaoImpl
 * @Description: TODO
 * @DateTime: 2023/8/8 16:51
 * @version: 1.0
 **/
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void updateBalance(Integer userId, Integer price) {
        String sql = "update user set balance = balance - ? where user_id = ?";
        int update = jdbcTemplate.update(sql, price, userId);
        if (update > 0) {
            System.out.println("余额更新成功");
        } else {
            System.out.println("余额更新失败");
        }
    }
}
