package com.cebbank.liuxiaoming;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.cebbank.liuxiaoming.bean.Student;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestDB {
    ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("springdb.xml");

    JdbcTemplate jt = ctx.getBean(JdbcTemplate.class);

    public static void main(String[] args) throws SQLException {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("springdb.xml");

        DruidDataSource dataSource = ctx.getBean("dataSource", DruidDataSource.class);
        DruidPooledConnection conn = dataSource.getConnection();
        System.out.println(conn.isClosed());
//        JdbcTemplate jt = ctx.getBean(JdbcTemplate.class);
//        String sql = "instert into student values(null,?,?)";
//        int row = jt.update(sql, "TOM", 20);
//        System.out.println(row);
        ctx.close();
    }

    @Test
    public void test1(){

        String sql = "insert into student values(null,?,?)";
        int row = jt.update(sql, "beke", 20);
        System.out.println(row);
        ctx.close();
    }

    /**
     * 查询一行一列
     */
    @Test
    public void test2(){
        String sql ="select name from student where id=?";
        String name = jt.queryForObject(sql, String.class, 1);
        System.out.println(name);
    }

    /**
     * 查询一行多列
     */
    @Test
    public void test3(){
        String sql ="select * from student where id=?";
        //orm
        RowMapper<Student> rowMapper = new BeanPropertyRowMapper<Student>(Student.class);
        Student student = jt.queryForObject(sql, rowMapper, 1);
        System.out.println(student);
    }


    /**
     * 查询多行多列
     */
    @Test
    public void test4(){
        String sql ="select * from student";
        //orm
        RowMapper<Student> rowMapper = new BeanPropertyRowMapper<Student>(Student.class);
        List<Student> students = jt.query(sql, rowMapper);
        System.out.println(students);
    }

    /**
     * 批量增删改
     *
     */
    @Test
    public void test5(){
        List<Object []> args = new ArrayList();
//        args.add(new Object[]{"李四",40});
//        args.add(new Object[]{"王五",20});
//        args.add(new Object[]{"张三",60});
        args.add(new Object[]{1});
        args.add(new Object[]{2});
        args.add(new Object[]{3});

      //  String sql = "insert into student values(null,?,?)";
        String sql = "delete from student where id=?";
        int[] resultNums = jt.batchUpdate(sql, args);

    }
}

