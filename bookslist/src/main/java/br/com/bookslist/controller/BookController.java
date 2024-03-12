package br.com.bookslist.controller;

import br.com.bookslist.entity.Author;
import br.com.bookslist.entity.Book;
import br.com.bookslist.repository.AuthorRepository;
import br.com.bookslist.service.AuthorService;
import br.com.bookslist.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private  AuthorService authorService;
    @Autowired
    private BookService bookService;

    @GetMapping("/book/form/add")
    public ModelAndView getFormAdd(){

        ModelAndView mv = new ModelAndView("bookform");
        List<Author> authors = this.authorService.getAuthorList();
        mv.addObject("authors", authors);
        return mv;
    }

    @PostMapping("/book/form/save")
    public String saveBook(Book book, BindingResult result, RedirectAttributes redirectAttributes){

        if (result.hasErrors()){
            redirectAttributes.addFlashAttribute("mensagem", "verifique os campos obrigatorios");
            return "redirect: /book/form/add";
        }
        this.bookService.save(book);

        return "redirect:/lista";

    }

}
