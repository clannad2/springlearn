package com.cebbank.liuxiaoming.transaction.service;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface Cashier {
    //买多本书
    public void checkout(List<String> isbns,String username);
}
