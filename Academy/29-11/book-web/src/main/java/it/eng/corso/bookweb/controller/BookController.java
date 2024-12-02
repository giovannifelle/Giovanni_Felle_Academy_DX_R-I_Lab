package it.eng.corso.bookweb.controller;

import it.eng.corso.bookweb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import it.eng.corso.bookweb.model.Book;
import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;



    public List<Book> getAllBooks() {
        return bookService.findAll();
    }

    @GetMapping("/")
    public String listBook(Model model){

        model.addAttribute("books",getAllBooks());
        return "home";
    }
}
