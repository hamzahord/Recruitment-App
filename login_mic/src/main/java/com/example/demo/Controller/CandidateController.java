package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Candidate;
import com.example.demo.Service.CandidateService;

@RestController
public class CandidateController {

	@Autowired
	private CandidateService candidate;
	
	@PostMapping("/addcand")
	public void addCandidate(@RequestBody Candidate candidate) {
		this.candidate.addCandidate(candidate);
	}
	
	@PutMapping("/updatecand")
	public void updateCandidate(@RequestBody Candidate candidate) {
		this.candidate.updateCandidate(candidate);
	}
	
	@DeleteMapping("/deletecand")
	public void deleteCandidate(@PathVariable Long candId) {
		this.candidate.deleteCandidate(candId);
	}
	
	
}
