package com.cg.trainee_management_system.repository;

import org.springframework.data.repository.CrudRepository;

import com.cg.trainee_management_system.domain.Trainee;

public interface TraineeRepository extends CrudRepository<Trainee, Integer>{
	
	public Trainee findByTraineeName(String traineeName);

}
