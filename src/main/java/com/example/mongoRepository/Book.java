package com.example.mongoRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// Annotations
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Book")
// Class
public class Book {

  // Attributes
  @Id
  private String id;
  private String bookName;
  private String authorName;
}