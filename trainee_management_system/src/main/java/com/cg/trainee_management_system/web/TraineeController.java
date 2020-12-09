package com.cg.trainee_management_system.web;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.trainee_management_system.domain.Trainee;
import com.cg.trainee_management_system.service.TraineeService;

@RestController
@RequestMapping("/api/trainee")
public class TraineeController {

	@Autowired
	public TraineeService traineeService;
	
	@PostMapping("")
	public Trainee createTrainee(@Valid @RequestBody Trainee trainee) {
	 return traineeService.save(trainee);
	}
	
	@GetMapping("/all")
	public List<Trainee> getAllTrainees(){
		return traineeService.findAllTrainees();
	}
	
	@GetMapping
	@RequestMapping("/traineeId/{id}")
	public Optional<Trainee> get(@PathVariable Integer id) {
		return traineeService.getTraineeById(id);
	}
	
	@GetMapping("/name/{id}")
	public Optional<Trainee> getTraineeById(@PathVariable(value="id") String traineeName){
		return Optional.of(traineeService.getTraineeByName(traineeName));
	}
	
	@DeleteMapping("/traineeId/{id}")
	public String deleteByIdentifier(@PathVariable Integer id) {
		traineeService.deleteByTraineeId(id);
		return "Trainee with Id : "+id+" Deleted Successfully!";
	}
}
