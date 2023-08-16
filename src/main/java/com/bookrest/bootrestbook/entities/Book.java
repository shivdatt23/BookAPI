package com.bookrest.bootrestbook.entities;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bookId")
    private int id;

    private String bookName;
    private String bookPrice;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    private Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Book(int id, String bookName, String bookPrice, Author author) {
        this.id = id;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.author = author;
    }

    public Book() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id=").append(id);
        sb.append(", bookName='").append(bookName).append('\'');
        sb.append(", bookPrice='").append(bookPrice).append('\'');
        sb.append(", author=").append(author);
        sb.append('}');
        return sb.toString();
    }
}
