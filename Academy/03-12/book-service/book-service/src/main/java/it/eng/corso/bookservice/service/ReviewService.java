package it.eng.corso.bookservice.service;

import it.eng.corso.bookservice.dto.BookDTO;
import it.eng.corso.bookservice.dto.ReviewDTO;

import java.util.List;

public interface ReviewService {

    ReviewDTO save(ReviewDTO review);

    List<ReviewDTO> findAll();

    List<ReviewDTO> findByBook(String bookUuid );
    Double averageForBook(String bookUuid);

}
