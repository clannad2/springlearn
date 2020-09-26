package com.cebbank.liuxiaoming.transaction.service.impl;

import com.cebbank.liuxiaoming.transaction.dao.BookShopDao;
import com.cebbank.liuxiaoming.transaction.service.BookShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookShopServiceImpl implements BookShopService {
    @Autowired
    BookShopDao bds;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void purchase(String isbn, String userName) {
        Integer price = bds.findBookPriceByIsbn(isbn);
        Integer row = bds.updateBookStock(isbn);
        bds.updateAcount(userName,price);
    }
}
