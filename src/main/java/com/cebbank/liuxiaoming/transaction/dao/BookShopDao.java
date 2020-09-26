package com.cebbank.liuxiaoming.transaction.dao;

public interface BookShopDao {
    //查询图书单价
    public Integer findBookPriceByIsbn(String isbn);
    //更新库存
    public Integer updateBookStock(String isbn);
    //更新账户信息
    public Integer updateAcount(String userName,Integer price);
}
