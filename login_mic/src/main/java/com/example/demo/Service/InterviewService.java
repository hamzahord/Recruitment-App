package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Interview;
import com.example.demo.Repositories.InterviewRepository;

@Service
public class InterviewService {
	
	@Autowired
	private InterviewRepository interviewRepository;
	
	public List<Interview> getInterviews(){
		return interviewRepository.findAll();
	}
	
	public void addInterviews(Interview interview) {
		interviewRepository.save(interview);
	}
	
	public void updateInterviews(Interview interview) {
		interviewRepository.save(interview);
	}
	
	public void deleteInterviews(Long intId) {
		interviewRepository.deleteById(intId);
	}
	
}
