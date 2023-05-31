package hibernate.assignment.one.services.impl;

import hibernate.assignment.one.entity.Movie;
import hibernate.assignment.one.repository.MovieRepo;
import hibernate.assignment.one.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepo movieRepo;

    @Override
    public List<Movie> movieList() {
        return movieRepo.findAll();
    }
}
