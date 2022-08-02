package com.example.demo.Models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "interview")
public class Interview {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "int_id")
	private Long intId;
	@Column(name = "int_order")
	private Integer intOrder;
	@Column(name = "int_status")
	private String intStatus;
	@Column(name = "int_date")
	private Date intDate;
	@Column(name = "int_enddate")
	private Date intEndDate;
	
	
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "cand_id", nullable = false)
	private Candidate candidate;

	public Integer getIntOrder() {
		return intOrder;
	}

	public void setIntOrder(Integer intOrder) {
		this.intOrder = intOrder;
	}

	public String getIntStatus() {
		return intStatus;
	}

	public void setIntStatus(String intStatus) {
		this.intStatus = intStatus;
	}

	public Date getIntDate() {
		return intDate;
	}

	public void setIntDate(Date intDate) {
		this.intDate = intDate;
	}

	public Date getIntEndDate() {
		return intEndDate;
	}

	public void setIntEndDate(Date intEndDate) {
		this.intEndDate = intEndDate;
	}
	/*
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}*/

	@Override
	public String toString() {
		return "Interview [intOrder=" + intOrder + ", intStatus=" + intStatus + ", intDate=" + intDate + ", intEndDate="
				+ intEndDate + ", with " + user.getUserLastname() + " " +user.getUserFirstname() +  "]\n";
	}
	
	

	public Long getIntId() {
		return intId;
	}

	/*@Override
	public String toString() {
		return "Interview [ intOrder=" + intOrder + ", intStatus=" + intStatus + ", intDate="
				+ intDate + ", intEndDate=" + intEndDate + "]";
	}*/

	public void setIntId(Long intId) {
		this.intId = intId;
	}

	
}
