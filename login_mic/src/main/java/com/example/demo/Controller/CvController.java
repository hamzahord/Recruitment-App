package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Models.CV;
import com.example.demo.Service.CvService;

public class CvController {
	
	@Autowired
	private CvService cvs;
	
	@PostMapping("/addcv")
	public void addCV(@RequestBody CV cv) {
		cvs.addCV(cv);
	}
	
	
	public void updateCV(@RequestBody CV cv) {
		cvs.updateCV(cv);
	}
	
	
	public void deleteCV(@PathVariable Long cvId) {
		cvs.deleteCV(cvId);
	}
	
	

}
