package com.example.demo.Models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;



@Entity
@Table(name = "candidate")
public class Candidate {
	
	@Id
	@Column(name = "cand_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long candidateId;
	@Column(name = "cand_firstname")
	private String candidateFirstname;
	@Column(name = "cand_lastname" ) 
	private String candidateLastname;
	@Column(name = "cand_email")
	private String candidateEmail;
	@Column(name = "cand_phone")
	private String candidatePhone;
	@Column(name = "cand_adress")
	private String candidateAdress;
	@Column(name = "cand_status")
	@Enumerated(EnumType.STRING)
	private EStatus candidateStatus;
	@Column(name = "cand_file")
	@Type(type="org.hibernate.type.BinaryType")
	private byte[] candidateFile;
	@Column(name = "offer_status")
	private String offerStatus;
	@Column(name = "trial_period")
	private Date trialPeriod;
	@Column(name = "cand_startdate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date candidateStartDate;
	@Column(name = "cand_enddate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date candidateEndDate;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
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
		return candidateFirstname;
	}

	public void setCandidateFirstname(String candidateFirstname) {
		this.candidateFirstname = candidateFirstname;
	}

	public String getCandidateLastname() {
		return candidateLastname;
	}

	public void setCandidateLastname(String candidateLastname) {
		this.candidateLastname = candidateLastname;
	}

	public String getCandidateEmail() {
		return candidateEmail;
	}

	public void setCandidateEmail(String candidateEmail) {
		this.candidateEmail = candidateEmail;
	}

	public String getCandidatePhone() {
		return candidatePhone;
	}

	public void setCandidatePhone(String candidatePhone) {
		this.candidatePhone = candidatePhone;
	}

	public String getCandidateAdress() {
		return candidateAdress;
	}

	public void setCandidateAdress(String candidateAdress) {
		this.candidateAdress = candidateAdress;
	}

	public EStatus getCandidateStatus() {
		return candidateStatus;
	}

	public void setCandidateStatus(EStatus candidateStatus) {
		this.candidateStatus = candidateStatus;
	}

	public byte[] getCandidateFile() {
		return candidateFile;
	}

	public void setCandidateFile(byte[] candidateFile) {
		this.candidateFile = candidateFile;
	}

	public String getOfferStatus() {
		return offerStatus;
	}

	public void setOfferStatus(String offerStatus) {
		this.offerStatus = offerStatus;
	}

	public Date getTrialPeriod() {
		return trialPeriod;
	}

	public void setTrialPeriod(Date trialPeriod) {
		this.trialPeriod = trialPeriod;
	}

	public Date getCandidateStartDate() {
		return candidateStartDate;
	}

	public void setCandidateStartDate(Date candidateStartDate) {
		this.candidateStartDate = candidateStartDate;
	}

	public Date getCandidateEndDate() {
		return candidateEndDate;
	}

	public void setCandidateEndDate(Date candidateEndDate) {
		this.candidateEndDate = candidateEndDate;
	}


	@Override
	public String toString() {
		return "Candidate [CandidateFirstname=" + candidateFirstname + ", CandidateLastname=" + candidateLastname
				+ ", CandidateEmail=" + candidateEmail + ", CandidatePhone=" + candidatePhone + ", CandidateAdress="
				+ candidateAdress + ", CandidateStatus=" + candidateStatus + ", CandidateFile="
				+ ", OfferStatus=" + offerStatus + ", TrialPeriod=" + trialPeriod
				+ ", CandidateStartDate=" + candidateStartDate + ", candidateEndDate=" + candidateEndDate + ", cvs="
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
			String candidatePhone, String candidateAdress, EStatus candidateStatus, byte[] candidateFile,
			String offerStatus, Date trialPeriod, Date candidateStartDate, Date candidateEndDate) {
		super();
		this.candidateId = candidateID;
		this.candidateFirstname = candidateFirstname;
		this.candidateLastname = candidateLastname;
		this.candidateEmail = candidateEmail;
		this.candidatePhone = candidatePhone;
		this.candidateAdress = candidateAdress;
		this.candidateStatus = candidateStatus;
		this.candidateFile = candidateFile;
		this.offerStatus = offerStatus;
		this.trialPeriod = trialPeriod;
		this.candidateStartDate = candidateStartDate;
		this.candidateEndDate = candidateEndDate;
	}
	
	
	
	
}
