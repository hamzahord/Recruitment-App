package com.example.demo.Controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Candidate;
import com.example.demo.Models.Interview;
//import com.example.demo.Models.Role;
import com.example.demo.Models.User;
import com.example.demo.Repositories.CandidateRepository;
import com.example.demo.Repositories.InterviewRepository;
//import com.example.demo.Repositories.RoleRepository;
import com.example.demo.Repositories.UserRepository;
import com.example.demo.Service.PasswordEncoder;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LoginController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@GetMapping("/tst")
	public String pageTest( ) {
		List<User> users = userRepository.findAll();
		String tmpString = "";
		for (int i = 0; i< users.size(); i++) {
			tmpString+= users.get(i).toString()+ System.getProperty("line.separator" );

		}
		return tmpString;
	}
	
	@GetMapping("/users")
	public List<User> allUsers( ) {
		List<User> users = userRepository.findAll();
		return users;
	}
	
	@PutMapping("/login")
	public User LoginTest(@RequestBody LoginRequest loginRequest) throws Exception {
		String password = passwordEncoder.passwordEncryption(loginRequest.password);
		List<User> users = userRepository.findByUserEmail(loginRequest.email);
		if(users != null) {
			for(User user : users) {
				if (user.getIsHashed() == false) {
					passwordEncoder.UpdatePasswordNonEncoded(user.getUserPassword());
				}
				if (user.getUserPassword().equals(password)) {
					return user;
				}
			}
		}
		throw new Exception("False ID");
	}
	
	/*@Autowired
	private RoleRepository roleRepository;*/
	
	
	
	@PutMapping("/currentrole")
	public String UserRole(@RequestBody User user) { 
		/*List<Role> roles = roleRepository.findByRoleEnDate(null);
		String userRole = "";
		for(Role role : roles) {
			userRole += role.getRoleCode();
		}*/
		int i = user.getRoles().size();
		return "Hello "+ user.getUserFirstname() + " our dear " + user.getRoles().get(i-1).getRoleCode();	}
	
	@Autowired
	private CandidateRepository candidateRepository;
	
	@Autowired
	private InterviewRepository interviewRepository;
	
	
	@GetMapping("/interviews")
	public List<Interview> getInterviews(){
		List<Interview> interviews = interviewRepository.findAll();
		return interviews;
	}
	
	@PutMapping("/candinterviews")
	public String candInterviews(@RequestBody LoginRequest loginRequest) throws Exception{
		List<Candidate> candidates = candidateRepository.findByCandidateLastname(loginRequest.email);
		if (candidates != null) {
			for(Candidate candidate : candidates) {
				List<Interview> interviews = interviewRepository.findInterviewsByCandidate(candidate);
				return interviews.toString();
			}
		}
		throw new Exception("not found");
	}
	
	/*@PutMapping("/candinterviewsanduser")
	public String candInterviewsandUsers(@RequestBody LoginRequest loginRequest) throws Exception{
		List<Candidate> candidates = candidateRepository.findByCandidateLastname(loginRequest.email);
		String tmpString = "";
		List<User> users = userRepository.findAll();
		if (candidates != null) {
			for(Candidate candidate : candidates) {
				List<Interview> interviews = interviewRepository.findInterviewsByCandidate(candidate);
				for(User user : users) {
					if (user.getInterview()!= null) {
						for(int i =0; i<interviews.size();i++) {
							if(user.getInterview().getIntId() == interviews.get(i).getIntId()) {
								tmpString += interviews.get(i).toString() + "\n" +user.getUserFirstname() + " " + user.getUserLastname() + System.lineSeparator() ;
							}
						}	
					}
				}
			}
		}
		return tmpString;
	}*/
	
	/*@PutMapping("/interviews")
	public List<Interview> candidateInterviews(@RequestBody LoginRequest loginRequest) throws Exception{
		List<Interview> interviews = interviewRepository.findInterviewsByCandidate(loginRequest.email);
		if (interviews != null)
			return interviews;
		throw new Exception("This candidate has no interviews");
	}*/
	
	
	
	
	
}