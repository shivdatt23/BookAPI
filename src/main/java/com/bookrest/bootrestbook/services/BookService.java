package com.bookrest.bootrestbook.services;

import com.bookrest.bootrestbook.dao.BookDao;
import com.bookrest.bootrestbook.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookService {
    @Autowired
    private BookDao bookDao;

        //get all books
    public List<Book> getAllBooks(){
       List<Book> list=(List<Book>) bookDao.findAll();
            return list;
    }

    //get single book by id
    public Book getBookById(int id){

            Book book=null;
            try {
                book=bookDao.findBookById(id);
            }catch (Exception e){
                e.printStackTrace();
            }

            return book;

    }

    //adding the book to list
    public Book addBook(Book book){

         return bookDao.save(book);

    }

    //deleting books by id
    public void deleteBookById(int id){
//
//            list=list.stream().filter(book -> book.getId()!=id).collect(Collectors.toList());
        bookDao.deleteById(id);

    }


    public void updatBook(Book book, int id) {
//            list=list.stream().map(b->
//            {
//                if (b.getId() ==id) {
//                    b.setBookName(book.getBookName());
//                    b.setBookPrice(book.getBookPrice());
//                }
//                return b;
//            }).collect(Collectors.toList());

        book.setId(id);
        bookDao.save(book);
    }
}
