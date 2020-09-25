package com.cebbank.liuxiaoming;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class TestDB {
    public static void main(String[] args) throws SQLException {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("springdb.xml");

        DruidDataSource dataSource = ctx.getBean("dataSource", DruidDataSource.class);
        DruidPooledConnection conn = dataSource.getConnection();
        System.out.println(conn.isClosed());
        ctx.close();
    }
}
