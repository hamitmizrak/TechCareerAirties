package com.hamitmizrak.layer.data.repository;

import com.hamitmizrak.layer.data.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends CrudRepository<BookEntity,Long> {
}
