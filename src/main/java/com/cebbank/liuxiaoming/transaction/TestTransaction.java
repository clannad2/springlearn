package com.cebbank.liuxiaoming.transaction;

import com.cebbank.liuxiaoming.transaction.service.Cashier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestTransaction {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springdb.xml");
//        BookShopService bookShopService = ctx.getBean(BookShopService.class);
//        bookShopService.purchase("1","大圣");
        Cashier ca = ctx.getBean(Cashier.class);
        List<String> isbns = new ArrayList<>();
        isbns.add("1");
        isbns.add("2");
        ca.checkout(isbns,"大圣");
    }
}
