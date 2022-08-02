package com.example.demo.Models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})

@Entity
@Table(name = "user_table")
public class User {
	
	
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@Column(name = "user_firstname")
	private String userFirstname;
	@Column(name = "user_lastname")
	private String userLastname;
	@Column(name = "user_email")
	private String userEmail;
	@Column(name = "user_password")
	private String userPassword;
	@Column(name = "is_hashed")
	private Boolean IsHashed;
	
	

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Role> roles;
	
	/*@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Role> roles = new HashSet<>();*/
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Candidate> candidates;
	
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Interview> interviews;

	


	public User() {}
	
	
	public User(String userFirstname, String userLastname, String userEmail, String userPassword) {
		super();
		this.userFirstname = userFirstname;
		this.userLastname = userLastname;
		this.userEmail = userEmail;
		this.userPassword = userPassword;

	}


	public String getUserFirstname() {
		return userFirstname;
	}

	public void setUserFirstname(String userFirstname) {
		this.userFirstname = userFirstname;
	}

	public String getUserLastname() {
		return userLastname;
	}

	public void setUserLastname(String userLastname) {
		this.userLastname = userLastname;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public Boolean getIsHashed() {
		return IsHashed;
	}

	public void setIsHashed(Boolean Hashed) {
		this.IsHashed= Hashed;
	}


	public List<Role> getRoles() {
		return roles;
	}


	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}


	public List<Candidate> getCandidates() {
		return candidates;
	}


	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}


	public List<Interview> getInterviews() {
		return interviews;
	}


	public void setInterviews(List<Interview> interviews) {
		this.interviews = interviews;
	}


	@Override
	public String toString() {
		return "User [userFirstname=" + userFirstname + ", userLastname=" + userLastname + ", userEmail=" + userEmail
				+ ", userPassword=" + userPassword + ", IsHashed=" + IsHashed + ", roles=" + roles + ", candidates="
				+ candidates + ", interviews=" + interviews + "]";
	}


	

	
}
