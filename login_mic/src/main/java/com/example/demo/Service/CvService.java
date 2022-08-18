package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Models.CV;
import com.example.demo.Repositories.CvRepository;

public class CvService {

	@Autowired
	private CvRepository cvRepository;
	
	
	public void addCV(CV cv) {
		cvRepository.save(cv);
	}
	
	public void updateCV(CV cv) {
		cvRepository.save(cv);
	}
	
	public void deleteCV(Long cvId) {
		cvRepository.deleteById(cvId);
	}
	
	
}