package com.hamitmizrak.tutorials;

public class _022_Generics <T> {
  private T data;

    public _022_Generics() {

    }

    public _022_Generics(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void deneme(String name){}
    public <K> void deneme2(K surname){}


    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        _022_Generics generics=new _022_Generics();
        generics.setData(true);
        System.out.println(generics.getData());
    }
}
