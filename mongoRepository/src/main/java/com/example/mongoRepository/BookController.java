package com.example.mongoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
  
import java.util.List;

@RestController
public class BookController {
  
    @Autowired
    private BookRepository repo;
  
    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book){
        repo.save(book);
        
        return "Added Successfully";
    }
  
    @GetMapping("/findAllBooks")
    public List<Book> getBooks() {
        
        return repo.findAll();
    }
  
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable String id){
        repo.deleteById(id);
        
        return "Deleted Successfully";
    }
  
}