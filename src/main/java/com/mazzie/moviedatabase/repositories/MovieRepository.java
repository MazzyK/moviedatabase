package com.mazzie.moviedatabase.repositories;

import com.mazzie.moviedatabase.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;



public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
