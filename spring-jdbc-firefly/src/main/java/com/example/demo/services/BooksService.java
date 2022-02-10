package com.example.demo.services;


import com.example.demo.model.Book;
import com.example.demo.model.rowmapper.BookRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BooksService {

    @Autowired
    JdbcTemplate jdbcTemplate;

        public List<Book> getAllBooks() {
            List<Book> bookList =  jdbcTemplate.query("select * from books", new BookRowMapper());
            return bookList;
        }

        public int addBook(Book book){
            return jdbcTemplate.update("insert into books (genre, title, author, price) values (?,?,?,?)"
                    ,book.getGenre(), book.getTitle(), book.getAuthor(), book.getPrice());
        }

        public Optional<Book> getByBookId(Long id){
            return jdbcTemplate.queryForObject(
                    "select * from books where book_id = ?",
                    new Object[]{id},
                    ((rs, rowNum) ->
                        Optional.of( new Book(
                                    rs.getLong("book_id"),
                                    rs.getString("genre"),
                                    rs.getString("title"),
                                    rs.getString("author"),
                                    rs.getBigDecimal("price")
                                ))
                        )
                    );
        }

        public Long getNextBookId(){
            return jdbcTemplate.queryForObject("", Long.class);
        }
}
