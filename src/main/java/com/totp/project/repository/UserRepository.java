package com.totp.project.repository;


import com.totp.project.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    public List<User> findAll();
    //이름검색
    public List<User> findByName(String name);
}