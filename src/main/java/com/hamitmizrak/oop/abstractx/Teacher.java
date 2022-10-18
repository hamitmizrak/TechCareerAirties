package com.hamitmizrak.oop.abstractx;

import lombok.Getter;
import lombok.Setter;

public class Teacher extends Person {
    @Getter @Setter
    private String teacherHescode;

    public Teacher(){}

    public Teacher(String name, String surname, String teacherHescode) {
        //üst atadan gelen özellikler
        super(name, surname);
        //yeni özellikler
        this.teacherHescode = teacherHescode;
    }


    @Override
    public void govdesizMetod() {
        System.out.println("Teacher govdesiz metot");
    }

    @Override
    public void personFullName() {
        System.out.println("Teacher Method");
    }
}
