package it.eng.corso.bookservice.controller;

import it.eng.corso.bookservice.model.Book;
import it.eng.corso.bookservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {


    @Autowired
    private BookService bookService;

    @GetMapping("/api/v1/books")
    public List<Book> findAll(){
        return bookService.findAll();
    }


    @GetMapping("/api/v1/books/{author}")
    public List<Book> findByAuthor(@PathVariable String author){
        if(bookService.findByAuthor(author).isEmpty()){
            System.out.println("Nessun libro da trovare");
        }
        return bookService.findByAuthor(author);
    }
}
