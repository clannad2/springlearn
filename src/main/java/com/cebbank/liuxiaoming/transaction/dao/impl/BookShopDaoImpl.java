package com.cebbank.liuxiaoming.transaction.dao.impl;

import com.cebbank.liuxiaoming.transaction.dao.BookShopDao;
import com.cebbank.liuxiaoming.transaction.exception.BalanceException;
import com.cebbank.liuxiaoming.transaction.exception.StockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookShopDaoImpl implements BookShopDao {
    @Autowired
    private JdbcTemplate jt;

    @Override
    public Integer findBookPriceByIsbn(String isbn) {
        String sql = "select price from book where isbn=?";
        Integer price = jt.queryForObject(sql, Integer.class, isbn);
        return price;
    }

    @Override
    public Integer updateBookStock(String isbn) {
        //查询库存是否充足
        String query = "select stock from  book_stock where isbn=?";
        Integer stockNum = jt.queryForObject(query, Integer.class, isbn);
        if (stockNum<=0){
            throw  new StockException("库存不足");
        }else{
            //减库存
            String update = "update book_stock set stock=stock-1 where isbn=?";
            int row = jt.update(update, isbn);
            return row;
        }
    }

    @Override
    public Integer updateAcount(String userName, Integer price) {
        //查询余额是否充足
        String query = "select balance from  account where username=?";
        Integer balance = jt.queryForObject(query, Integer.class, userName);
        if (balance<=price){
            throw  new BalanceException("余额不足");
        }else{
            //减库存
            String update = "update account set balance=balance-? where username=?";
            int row = jt.update(update, price,userName );
            return row;
        }
    }
}
