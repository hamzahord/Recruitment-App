package com.example.demo.Models;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "candidate")
public class Candidate {
	
	@Id
	@Column(name = "cand_id")
	private Long CandidateID;
	@Column(name = "cand_firstname")
	private String CandidateFirstname;
	@Column(name = "cand_lastname" ) 
	private String candidateLastname;
	@Column(name = "cand_email")
	private String CandidateEmail;
	@Column(name = "cand_phone")
	private String CandidatePhone;
	@Column(name = "cand_adress")
	private String CandidateAdress;
	@Column(name = "cand_status")
	@Enumerated(EnumType.STRING)
	private EStatus CandidateStatus;
	@Column(name = "cand_file")
	@Lob
	private Byte[] CandidateFile;
	@Column(name = "offer_status")
	private String OfferStatus;
	@Column(name = "trial_period")
	private Date TrialPeriod;
	@Column(name = "cand_startdate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date CandidateStartDate;
	@Column(name = "cand_enddate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date candidateEndDate;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	
	@OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CV> cvs;
	
	@OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Interview> interviews;

	public List<Interview> getInterviews() {
		return interviews;
	}

	public void setInterviews(List<Interview> interviews) {
		this.interviews = interviews;
	}

	public String getCandidateFirstname() {
		return CandidateFirstname;
	}

	public void setCandidateFirstname(String candidateFirstname) {
		CandidateFirstname = candidateFirstname;
	}

	public String getCandidateLastname() {
		return candidateLastname;
	}

	public void setCandidateLastname(String candidateLastname) {
		this.candidateLastname = candidateLastname;
	}

	public String getCandidateEmail() {
		return CandidateEmail;
	}

	public void setCandidateEmail(String candidateEmail) {
		CandidateEmail = candidateEmail;
	}

	public String getCandidatePhone() {
		return CandidatePhone;
	}

	public void setCandidatePhone(String candidatePhone) {
		CandidatePhone = candidatePhone;
	}

	public String getCandidateAdress() {
		return CandidateAdress;
	}

	public void setCandidateAdress(String candidateAdress) {
		CandidateAdress = candidateAdress;
	}

	public EStatus getCandidateStatus() {
		return CandidateStatus;
	}

	public void setCandidateStatus(EStatus candidateStatus) {
		CandidateStatus = candidateStatus;
	}

	public Byte[] getCandidateFile() {
		return CandidateFile;
	}

	public void setCandidateFile(Byte[] candidateFile) {
		CandidateFile = candidateFile;
	}

	public String getOfferStatus() {
		return OfferStatus;
	}

	public void setOfferStatus(String offerStatus) {
		OfferStatus = offerStatus;
	}

	public Date getTrialPeriod() {
		return TrialPeriod;
	}

	public void setTrialPeriod(Date trialPeriod) {
		TrialPeriod = trialPeriod;
	}

	public Date getCandidateStartDate() {
		return CandidateStartDate;
	}

	public void setCandidateStartDate(Date candidateStartDate) {
		CandidateStartDate = candidateStartDate;
	}

	public Date getCandidateEndDate() {
		return candidateEndDate;
	}

	public void setCandidateEndDate(Date candidateEndDate) {
		this.candidateEndDate = candidateEndDate;
	}


	@Override
	public String toString() {
		return "Candidate [CandidateFirstname=" + CandidateFirstname + ", CandidateLastname=" + candidateLastname
				+ ", CandidateEmail=" + CandidateEmail + ", CandidatePhone=" + CandidatePhone + ", CandidateAdress="
				+ CandidateAdress + ", CandidateStatus=" + CandidateStatus + ", CandidateFile="
				+ Arrays.toString(CandidateFile) + ", OfferStatus=" + OfferStatus + ", TrialPeriod=" + TrialPeriod
				+ ", CandidateStartDate=" + CandidateStartDate + ", candidateEndDate=" + candidateEndDate + ", cvs="
				+ cvs + ", interviews=" + interviews + "]";
	}

	public List<CV> getCvs() {
		return cvs;
	}

	public void setCvs(List<CV> cvs) {
		this.cvs = cvs;
	}

	public Candidate() {}
	
	public Candidate(Long candidateID, String candidateFirstname, String candidateLastname, String candidateEmail,
			String candidatePhone, String candidateAdress, EStatus candidateStatus, Byte[] candidateFile,
			String offerStatus, Date trialPeriod, Date candidateStartDate, Date candidateEndDate) {
		super();
		CandidateID = candidateID;
		CandidateFirstname = candidateFirstname;
		this.candidateLastname = candidateLastname;
		CandidateEmail = candidateEmail;
		CandidatePhone = candidatePhone;
		CandidateAdress = candidateAdress;
		CandidateStatus = candidateStatus;
		CandidateFile = candidateFile;
		OfferStatus = offerStatus;
		TrialPeriod = trialPeriod;
		CandidateStartDate = candidateStartDate;
		this.candidateEndDate = candidateEndDate;
	}
	
	
	
	
}
