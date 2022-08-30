package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Models.Interview;
import com.example.demo.Models.User;
import com.example.demo.Service.InterviewService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/int")
public class InterviewController {

	@Autowired
	private InterviewService interviewService;
	
	@PutMapping("/get")
	public ResponseEntity<?> getuserInt(@RequestBody User user) {
		return ResponseEntity.ok(user.getInterviews());
	}
	
	@PutMapping("/add")
	public void addInterview(@RequestBody Interview interview) {
		interviewService.addInterviews(interview);
	}
	
	@PostMapping("/update")
	public void updateInterview(@RequestBody Interview interview) {
		interviewService.updateInterviews(interview);
	}
	
	@DeleteMapping("/delete")
	public void deleteInterview(@PathVariable Long intId) {
		interviewService.deleteInterviews(intId);
	}
	
}
