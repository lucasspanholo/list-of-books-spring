package br.com.bookslist.controller;


import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class bookController {

    @GetMapping("/books")
    public ModelAndView getList(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

}
