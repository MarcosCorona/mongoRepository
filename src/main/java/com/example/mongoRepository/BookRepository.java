package com.example.mongoRepository;
// java Program to Illustrate BookRepo File


import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}