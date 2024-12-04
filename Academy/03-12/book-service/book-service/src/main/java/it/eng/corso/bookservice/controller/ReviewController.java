package it.eng.corso.bookservice.controller;

import it.eng.corso.bookservice.dto.BookDTO;
import it.eng.corso.bookservice.dto.ReviewDTO;
import it.eng.corso.bookservice.service.BookService;
import it.eng.corso.bookservice.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
@CrossOrigin
public class ReviewController {

    @Autowired
    private ReviewService reviewService;


    @GetMapping("/avarage")
    public Double findByBook(@RequestParam String uuid){
        return reviewService.averageForBook(uuid);
    }
}
