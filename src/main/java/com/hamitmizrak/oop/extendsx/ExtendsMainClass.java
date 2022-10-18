package com.hamitmizrak.oop.extendsx;

public class ExtendsMainClass {

    public static void main(String[] args) {
        Person person= new Person();
        person.setName("person adı");
        person.setSurname("person soyadı");
        System.out.println(person);

        System.out.println("**********************");

        Teacher teacher= new Teacher();
        teacher.setName("Hamit");
        teacher.setSurname("Mızrak");
        teacher.setTeacherHescode("hasdasdasda56a156d1as5d");
        System.out.println(teacher);
        teacher.personFullName(); //polymorhism

        System.out.println("**********************");

        Student student= new Student();
        student.setName("Hamit44");
        student.setSurname("Mızrak44");
        System.out.println(student);
        student.personFullName();//polymorhism
    }
}
