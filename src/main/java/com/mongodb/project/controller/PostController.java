package com.mongodb.project.controller;


import com.mongodb.project.domain.Post;
import com.mongodb.project.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping("/posts")
    public class PostController {

        @Autowired
        private PostRepository postRepository;

        @GetMapping
        public List<Post> findAll() {
            return postRepository.findAll();
        }

        @GetMapping("/{id}")
        public Post findById(@PathVariable String id) {
            return postRepository.findById(id).orElse(null);
        }
    }


