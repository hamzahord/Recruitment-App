package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Candidate;
import com.example.demo.Repositories.CandidateRepository;

@Service
public class CandidateService {
	
	@Autowired
	private CandidateRepository candidates;
	
	public List<Candidate> getCandidates(){
		return candidates.findAll();
	}
	
	public List<Candidate> getRealCandidates(){
		return candidates.findByCandidateStatus();
	}
	
	public List<Candidate> getFirstCandidates() {
		return candidates.findByNullCandidateStatus();
	}
	
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
