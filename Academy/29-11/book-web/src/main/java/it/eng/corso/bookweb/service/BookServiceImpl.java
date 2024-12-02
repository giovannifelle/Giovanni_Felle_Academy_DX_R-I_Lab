package it.eng.corso.bookweb.service;

import it.eng.corso.bookweb.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.eng.corso.bookweb.model.Book;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> findByAuthor(String nome){
        return  bookRepository.findByAuthor(nome);
    }

    public String findNomeByAuthor(String nome){
        String str="";
        List<Book> listaLibri=findByAuthor(nome);
        for(Book book : listaLibri){
            str+=book.getTitle();
        }
        return str;
    }
}

