package com.hamitmizrak.oop;

import java.util.Objects;

// Clean Code:
// Spagetti code
// KISS(keep It Simple Stupid)
// DRY(Dont Repeat Yourself)
// Dammy Code
// YAGNI:You Aint't Gonna Need It
// CCP:
// Monad:
// SOLID
// OOP : Object Oriented Programming
public class StudentDto {
    //nesne değişkenleri
    private String name;
    private String surname;

    //parametresiz constructor
    public StudentDto() {
        this.name="adı alanı boş geçildi";
        surname="soyadı alanı boş geçildi";
    }

    //parametreli constructor
    public StudentDto(String name) {
        this.name = name;
    }

    public StudentDto(String asd, String surname) {
        name = asd;
        this.surname = surname;
    }

    //toString
    @Override
    public String toString() {
        return "StudentDto{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    //equals hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDto that = (StudentDto) o;
        return Objects.equals(name, that.name) && Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
