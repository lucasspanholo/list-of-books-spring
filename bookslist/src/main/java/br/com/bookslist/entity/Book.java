package br.com.bookslist.entity;

import jakarta.persistence.*;

@Table(name = "book")
@Entity(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    public Book(String name, Author author){
        this.name = name;
        this.author = author;
    }
}
