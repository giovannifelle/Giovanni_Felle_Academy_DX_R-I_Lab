package it.eng.corso.bookservice.repository;

import it.eng.corso.bookservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

    //Prima modalità
        List<Book> findByAuthor(String author);

    List<Book> findByAuthorAndTitle(String author, String title);

    List<Book> findByAuthorContainingIgnoreCaseAndTitleContainingIgnoreCase(String author, String title);

    //Seconda modalità (Query leggermente più complessa rispetto la prima)
    @Query("select b from Book b where b.author= ?1")
    List<Book> findMiaQuery(String param);


    //In caso di più parametri la seconda diventa complicata
    //Terza modalità, si aggiunge l'annotation, diventa più "complessa", ma è più facile in lettura
    @Query("select b from Book b where b.author= :author and b.title= :title ")
    List<Book> findMiaQueryDue(@Param("author") String author, @Param("title") String tit);
}
