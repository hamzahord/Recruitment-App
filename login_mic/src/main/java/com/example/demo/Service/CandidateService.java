package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Candidate;
import com.example.demo.Repositories.CandidateRepository;

@Service

public class CandidateService {
	
	@Autowired
	private CandidateRepository candidates;
	
	public void addCandidate(Candidate candidate) {
		candidates.save(candidate);
	}
	
	public void updateCandidate(Candidate candidate) {
		candidates.save(candidate);
	}
	
	public void deleteCandidate(Long candId) {
		candidates.deleteById(candId);
	}
	
	
	
}
