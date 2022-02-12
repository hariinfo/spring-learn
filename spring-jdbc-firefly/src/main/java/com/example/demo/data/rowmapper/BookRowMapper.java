package com.example.demo.data.rowmapper;

import com.example.demo.data.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookRowMapper implements RowMapper<Book> {

    @Override
    public Book mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Book bookDTO = new Book();


        bookDTO.setId(resultSet.getLong("book_id"));
        bookDTO.setAuthor(resultSet.getString("author"));
        bookDTO.setGenre(resultSet.getString("genre"));
        bookDTO.setTitle(resultSet.getString("title"));
        bookDTO.setPrice(resultSet.getBigDecimal("price"));
        return bookDTO;
    }
}
