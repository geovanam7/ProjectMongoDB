package com.mongodb.project.repository;

import com.mongodb.project.domain.Post;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String > {
}
