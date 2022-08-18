package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Models.CV;
import com.example.demo.Service.CvService;


@RequestMapping("/cv")
public class CvController {
	
	@Autowired
	private CvService cvs;
	
	@PostMapping("/get")
	public List<CV> getCV() {
		return cvs.getCV();
	}
	
	@PostMapping("/add")
	public void addCV(@RequestBody CV cv) {
		cvs.addCV(cv);
	}
	
	@PostMapping("/update")
	public void updateCV(@RequestBody CV cv) {
		cvs.updateCV(cv);
	}
	
	
	public void deleteCV(@PathVariable Long cvId) {
		cvs.deleteCV(cvId);
	}
	
	

}
