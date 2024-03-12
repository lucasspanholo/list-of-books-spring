package br.com.bookslist.controller;


import br.com.bookslist.entity.Book;
import br.com.bookslist.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private BookService bookService;

    @GetMapping("/lista")
    public ModelAndView getList(){
        List<Book> bookList = this.bookService.findAll();
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

}
