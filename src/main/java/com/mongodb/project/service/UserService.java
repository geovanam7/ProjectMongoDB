package com.mongodb.project.service;

import com.mongodb.project.domain.User;
import com.mongodb.project.repository.UserRepository;
import com.mongodb.project.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;
    public List<User> findAll(){
        return repo.findAll();
    }

      public User findById(String id){
          User user = repo.findById(id).orElseThrow(() ->
                  new ObjectNotFoundException("usuario nao encontrado"));


    return user;
    }
 }
