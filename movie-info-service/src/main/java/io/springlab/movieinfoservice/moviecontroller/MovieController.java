package io.springlab.movieinfoservice.moviecontroller;

import io.springlab.movieinfoservice.model.Movie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private static Logger log= LoggerFactory.getLogger(MovieController.class);

    @RequestMapping("/info/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId){
        log.info("getMovieInfo() called....");
        return new Movie("101_ABCD","ABCD");
    }
}
