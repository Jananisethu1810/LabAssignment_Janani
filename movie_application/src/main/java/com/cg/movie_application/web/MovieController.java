package com.cg.movie_application.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.movie_application.exception.IDNotFoundException;
import com.cg.movie_application.model.Movie;
import com.cg.movie_application.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired  
	 private MovieService movieService;
  
    
    @PostMapping("/add")
    public ResponseEntity<Movie> SaveMovie(@RequestBody Movie movie){
   	 return new ResponseEntity<Movie>(movieService.addMovie(movie), HttpStatus.OK);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMovie(@PathVariable(value="id") Integer movieId) throws IDNotFoundException{
		movieService.deleteMovieById(movieId);
		String result= "Movie with Id : "+movieId+" Deleted Successfully!";
		return ResponseEntity.ok(result);
		   
	}  
    
    @GetMapping("/all")
    public Iterable<Movie> findAll(){
   	return  movieService.SearchAllMovies();
    }
    
    @GetMapping("/{genre}")
    public List<Movie>findByGenere(@PathVariable String genre){
   	 return movieService.serachByGenre(genre);
    }
    
    @PutMapping("/movie/update/{id}")
	public ResponseEntity<Movie> updateCompanyManager(@PathVariable(value="id") Integer movieId,
			@RequestBody Movie movie) throws IDNotFoundException{
		Movie movieFound= movieService.updateMovieById(movieId, movie);
		movieFound.setMovieId(movie.getMovieId());
		movieFound.setMovieName(movie.getMovieName());
		movieFound.setRating(movie.getRating());
		movieFound.setGenre(movie.getGenre());
		return ResponseEntity.ok(movieFound);
	}

}
