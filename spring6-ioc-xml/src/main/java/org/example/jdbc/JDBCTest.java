package org.example.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @Author: Diao Rui
 * @className: JDBCTest
 * @Description: TODO
 * @DateTime: 2023/8/2 16:33
 * @version: 1.0
 **/
public class JDBCTest {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-jdbc.xml");
        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource.getConnection());
    }
}
