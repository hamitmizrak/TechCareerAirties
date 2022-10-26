package com.hamitmizrak.layer.data.repository;

import com.hamitmizrak.layer.data.entity.WriterEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWriterRepository extends CrudRepository<WriterEntity,Long> {
}
