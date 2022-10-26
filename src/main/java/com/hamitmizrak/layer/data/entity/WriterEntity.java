package com.hamitmizrak.layer.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

//lombok
@Getter
@Setter

@Entity
@Table(name="writer")

//1
public class WriterEntity implements Serializable {
    public static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long writer_id;

    //relation
    @OneToMany(mappedBy ="writerEntity",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    List<BookEntity> bookEntityList;


    @Column(name = "writer_name")
    private String writerName;

    public WriterEntity() {
    }

    public WriterEntity(Long writer_id, String writerName) {
        this.writer_id = writer_id;
        this.writerName = writerName;
    }
}
