package com.cebbank.liuxiaoming.transaction.service.impl;

import com.cebbank.liuxiaoming.transaction.service.BookShopService;
import com.cebbank.liuxiaoming.transaction.service.Cashier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CashierImpl implements Cashier {
    @Autowired
    private BookShopService bss;

    @Override
    @Transactional
    public void checkout(List<String> isbns, String username) {
        for (String isbn : isbns) {
            bss.purchase(isbn,username);
        }
    }
}
