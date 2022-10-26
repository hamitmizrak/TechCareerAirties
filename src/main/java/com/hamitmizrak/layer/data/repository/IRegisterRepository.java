package com.hamitmizrak.layer.data.repository;

import com.hamitmizrak.layer.data.entity.RegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRegisterRepository extends JpaRepository<RegisterEntity,Long> {
    //Kendi Sorgumuzu yazdık
    RegisterEntity findByEmail(String email);
}
