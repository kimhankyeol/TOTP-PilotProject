package com.totp.project.service;

import com.totp.project.model.entity.User;
import com.totp.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
   @Autowired
   private UserRepository userRepository;

   public List<User> findByName(String name){
       List<User> uList = userRepository.findByName(name);
       return uList;
   }

    public List<User> findAll(){
        List<User> uList = userRepository.findAll();
        return uList;
    }
    public User findByEmailAndPassword(String email,String password){
       User user =userRepository.findByEmailAndPassword(email,password);
       return user;
    }
}
