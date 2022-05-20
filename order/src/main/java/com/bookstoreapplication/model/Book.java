package com.bookstoreapplication.model;

import com.bookstoreapplication.dto.BookDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue
    private Integer bookId;
    private String  bookName;
    private Integer price;
    private Integer quantity;

    public Book(BookDTO bookDTO){
        this.price=bookDTO.getPrice();
        this.quantity=bookDTO.getQuantity();
        this.bookName=bookDTO.getBookName();
    }


    public Book(Integer bookId, BookDTO bookDTO){
        this.bookId=bookId;
        this.bookName=bookDTO.getBookName();
        this.quantity=bookDTO.getQuantity();
        this.price=bookDTO.getPrice();

    }
}