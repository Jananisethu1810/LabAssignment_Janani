package com.cg.movie_application.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cg.movie_application.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer>{
	
	List<Movie> findByGenre(String genre);

}
