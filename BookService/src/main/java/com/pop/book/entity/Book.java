package com.pop.book.entity;
import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    private Integer id;
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "name")
    private String bookName;

    @Column(name = "author")
    private String author;
    @Column(name = "price")
    private String price;

    Book(){

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
