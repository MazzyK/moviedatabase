package com.mazzie.moviedatabase.services;


import com.mazzie.moviedatabase.entities.Movie;
import com.mazzie.moviedatabase.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> listAllMovies() {
        return movieRepository.findAll();
    }
}


