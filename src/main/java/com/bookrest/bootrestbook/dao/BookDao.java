package com.bookrest.bootrestbook.dao;

import com.bookrest.bootrestbook.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookDao extends CrudRepository<Book,Integer> {
    public Book findBookById(int id);
}
