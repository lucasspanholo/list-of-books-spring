package br.com.bookslist.repository;

import br.com.bookslist.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
