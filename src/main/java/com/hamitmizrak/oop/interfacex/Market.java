package com.hamitmizrak.oop.interfacex;

import java.io.Serializable;

public class Market extends MarketCode implements ICustomer, Serializable {
    public static final long serialVersionUID=1L;

    @Override
    public void paraAl() {
        System.out.println("para aldım 500TL");
    }

    @Override
    public String marketeGit() {
        System.out.println("Market gittim");
        return null;
    }

    @Override
    public double alisVeris(String urunAdi) {
        System.out.println("data: "+urunAdi);
        return 55;
    }
}
