package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Candidate;
import com.example.demo.Models.User;
import com.example.demo.Service.CandidateService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CandidateController {

	@Autowired
	private CandidateService candidate;
		
	@GetMapping("/getcand")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> getCandidates(){
		return ResponseEntity.ok(candidate.getRealCandidates());
	}
	
	@GetMapping("/getnullstatus")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Candidate> getFirstCandidates() {
		return candidate.getFirstCandidates();
	}
	
	@GetMapping("/getusercands")
	public List<Candidate> getUserCandidates(@RequestBody User user){
		return user.getCandidates();
	}
	
	
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
