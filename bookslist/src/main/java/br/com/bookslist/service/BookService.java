package br.com.bookslist.service;

import br.com.bookslist.entity.Book;
import br.com.bookslist.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public void save(Book book){
        this.bookRepository.save(book);
    }
    public List<Book> findAll(){
        return this.bookRepository.findAll();
    }

}
