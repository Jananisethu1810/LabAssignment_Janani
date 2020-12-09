package com.cg.movie_application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.movie_application.exception.IDNotFoundException;
import com.cg.movie_application.model.Movie;
import com.cg.movie_application.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	public Movie addMovie(Movie movie) {
		return  movieRepository.save(movie);
	}
	
	public boolean deleteMovieById(@PathVariable Integer movieId) throws IDNotFoundException{
		Movie companyManager = movieRepository.findById(movieId)
					.orElseThrow(() -> new IDNotFoundException(
							"CompanyManagerIdentifier : " + movieId + " not available!!!"));
		movieRepository.delete(companyManager);
		return true;
	}
	
	public Iterable<Movie> SearchAllMovies(){
		return movieRepository.findAll();
	}
	
	public List<Movie> serachByGenre(String genre){
		return  movieRepository.findByGenre(genre);
	}
	
	public Movie updateMovieById(@PathVariable Integer movieId,
			@RequestBody Movie movie) throws IDNotFoundException{
		Movie movieFound = movieRepository.findById(movieId)
					.orElseThrow(() -> new IDNotFoundException(
							"Movie Identifier : " + movieId + " not available!!!"));
		return  movieRepository.save(movieFound);

		
	}
}
