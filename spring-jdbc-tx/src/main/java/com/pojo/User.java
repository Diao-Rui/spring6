package com.pojo;

/**
 * @Author: Diao Rui
 * @className: User
 * @Description: TODO
 * @DateTime: 2023/8/8 16:41
 * @version: 1.0
 **/
public class User {
    private Integer user_id;
    private String username;
    private Integer balance;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                ", balance=" + balance +
                '}';
    }
}
