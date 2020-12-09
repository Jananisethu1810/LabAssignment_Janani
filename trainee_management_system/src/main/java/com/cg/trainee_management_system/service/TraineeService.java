package com.cg.trainee_management_system.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.trainee_management_system.domain.Trainee;
import com.cg.trainee_management_system.exception.TraineeIDException;
import com.cg.trainee_management_system.repository.TraineeRepository;

@Service
public class TraineeService {

	@Autowired
	public TraineeRepository traineeRepository;

	public Trainee save(Trainee trainee) {
		try {
			trainee.setTraineeId(trainee.getTraineeId());
			return traineeRepository.save(trainee);
		} catch (Exception e) {
			throw new TraineeIDException("TraineeIdentifier already available");
		}
	}
	
	public List<Trainee> findAllTrainees(){
		return (List<Trainee>) traineeRepository.findAll();
		
	}
	public Optional<Trainee> getTraineeById(Integer traineeId) {
		return traineeRepository.findById(traineeId);
	}
	
	public Trainee getTraineeByName(String traineeName){
		Trainee trainee = traineeRepository.findByTraineeName(traineeName.toUpperCase());
		if (trainee== null) {
			throw new TraineeIDException("Trainee not available");
			
		}
		return trainee;	
	}
	
	public void deleteByTraineeId(Integer traineeId) {
		traineeRepository.deleteById(traineeId);
		
	}
}
