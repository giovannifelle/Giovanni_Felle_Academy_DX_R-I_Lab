package it.eng.corso.bookweb.service;

import it.eng.corso.bookweb.model.Book;

import java.util.List;

public interface BookService {

    Book save(Book book);

    List<Book> findAll();

    List<Book> findByAuthor(String author);
    public String findNomeByAuthor(String nome);
}
