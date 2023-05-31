package hibernate.assignment.one.controller;

import hibernate.assignment.one.entity.Movie;
import hibernate.assignment.one.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @RequestMapping("/")
    public List<Movie> movieList() {
        return movieService.movieList();
    }
}
