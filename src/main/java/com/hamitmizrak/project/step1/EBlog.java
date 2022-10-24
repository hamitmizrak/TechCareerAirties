package com.hamitmizrak.project.step1;

public enum EBlog {
    // admin herşey yapabilir
    // writer: sadece okuabilir ve yazabilir
    // user sadece okuyabilir
    ADMIN(1,"admin"),WRITER(2,"writer"),USER(3,"user");

    //private 1->parametreli constructora zorlar
    //private 2->sadece getter çağırır.
    private final int key;
    private final String value;
    //parametreli constructor

    EBlog(int key, String value) {
        this.key = key;
        this.value = value;
    }

    //getter and setter
    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
