package it.eng.corso.bookservice.service;

import it.eng.corso.bookservice.dto.ReviewDTO;
import it.eng.corso.bookservice.model.Review;
import it.eng.corso.bookservice.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private ReviewService reviewService;

    @Override
    public ReviewDTO save(ReviewDTO review) {
        review.setUuid( String.valueOf(UUID.randomUUID()) );
        return modelToDTO( reviewRepository.save( dtoToModel( review ) ) );
    }

    @Override
    public List<ReviewDTO> findAll() {
        return reviewRepository.findAll()
                .stream()
                .map(this::modelToDTO)
                .toList();
    }
    @Override
    public  List<ReviewDTO> findByBook(String bookUuid){
        return reviewRepository
                .findByBookUuid(bookUuid)
                .stream()
                .map(this::modelToDTO)
                .toList();
    }

    @Override
    public Double averageForBook(String bookUuid){
        return reviewRepository.findByBookUuid(bookUuid)
                .stream()
                .map(Review::getStar)
                .mapToDouble(Double::valueOf)
                .average()
                .orElse(0D);
    }


    private Review dtoToModel( ReviewDTO review ){
        return Review.builder()
                .uuid(review.getUuid()).bookUuid(review.getBookUuid()).star(review.getStar()).build();
    }

    private ReviewDTO modelToDTO( Review review ){
        return ReviewDTO.builder()
                .uuid(review.getUuid()).bookUuid(review.getBookUuid()).star(review.getStar()).build();
    }

}
