package com.mongodb.project.service;

import com.mongodb.project.domain.Post;
import com.mongodb.project.domain.User;
import com.mongodb.project.repository.PostRepository;
import com.mongodb.project.repository.UserRepository;
import com.mongodb.project.service.exception.ObjectNotFoundException;
import jakarta.websocket.server.ServerEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Post user = repo.findById(id).orElseThrow(() ->
                new ObjectNotFoundException("usuario nao encontrado"));


        return user;
    }
}

