package it.eng.corso.bookservice.repository;

import it.eng.corso.bookservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

        List<Book> findByAuthor(String author);

    List<Book> findByAuthorAndTitle(String author, String title);

    List<Book> findByAuthorContainingIgnoreCaseAndTitleContainingIgnoreCase(String author, String title);
}
