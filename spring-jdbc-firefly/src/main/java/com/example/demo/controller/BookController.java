package com.example.demo.controller;

import com.example.demo.data.Book;
import com.example.demo.services.BooksService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("books")
@Slf4j
public class BookController {

    @Autowired
    BooksService booksService;

    //Get all books
    @GetMapping
    public List<Book> getBooks(){
        log.info("inside the controller");
        return booksService.getAllBooks();
    }

    //Add a book
    @PostMapping
    public int addBook(@RequestBody Book book){
        log.info("Adding books");
        return booksService.addBook(book);
    }

    //Get a specific book by id
    @GetMapping("/{bookId}")
    public Optional<Book> getById(@PathVariable Long bookId){
        return booksService.getByBookId(bookId);
    }

    //Delete a specific book by id
    @DeleteMapping("/{bookId}")
    public void deleteBook(@PathVariable Long bookId){

    }

}
