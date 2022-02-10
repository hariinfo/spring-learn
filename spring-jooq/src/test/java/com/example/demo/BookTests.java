package com.example.demo;

import com.example.demo.model.Book;
import com.example.demo.services.BooksService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureJdbc;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
@AutoConfigureJdbc
public class BookTests {
    @Autowired
    BooksService booksService;

    @Test
    void exerciseRepositoryForSimpleEntity() {
        var books = booksService.addBook(new Book(new Long(1),"test","test","test",new BigDecimal(9.44)));
        assert (books != 0);
    }
}
