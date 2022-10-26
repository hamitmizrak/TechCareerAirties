package com.hamitmizrak.layer.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

//lombok
@Getter @Setter

@Entity
@Table(name="book")

//N
public class BookEntity implements Serializable {
    public static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //relation
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name="writer_id",nullable = false)
    private WriterEntity writerEntity;

    @Column(name = "book_name")
    private String bookName;

    public BookEntity() {
    }

    public BookEntity(Long id, String bookName) {
        this.id = id;
        this.bookName = bookName;
    }
}
