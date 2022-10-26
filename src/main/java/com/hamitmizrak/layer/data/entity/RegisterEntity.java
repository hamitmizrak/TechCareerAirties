package com.hamitmizrak.layer.data.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "register")
public class RegisterEntity extends BaseEntity implements Serializable {

    private String name;
    private String surname;

    @Column(name = "email",length = 125,nullable = false,unique = true)
    private String email;
    private String password;

    //javada olsun ancak database bu attribute eklemesin
    @Transient
    private String justJava;

    //büyük datalar icin kullanalım.
    @Lob
    private Object bigData;
}
