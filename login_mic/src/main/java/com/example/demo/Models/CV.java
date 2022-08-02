package com.example.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cv_table")
public class CV {

	
	@Id
	@Column(name = "cv_id")
	private Long CvID;
	@Lob
	@Column(name = "cv_file")
	private Byte[] CvFile;
	@Column(name = "cv_status")
	@Enumerated(EnumType.STRING)
	private EStatus CvStatus;
	@Column(name = "is_cv_assigned")
	private Boolean IsAssigned;
	@Column(name = "cv_ordre")
	private Integer CvOrdre;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cand_id")
	private Candidate candidate;


	public Byte[] getCvFile() {
		return CvFile;
	}


	public void setCvFile(Byte[] cvFile) {
		CvFile = cvFile;
	}


	public EStatus getCvStatus() {
		return CvStatus;
	}


	public void setCvStatus(EStatus cvStatus) {
		CvStatus = cvStatus;
	}


	public Boolean getIsAssigned() {
		return IsAssigned;
	}


	public void setIsAssigned(Boolean isAssigned) {
		IsAssigned = isAssigned;
	}


	public Integer getCvOrdre() {
		return CvOrdre;
	}


	public void setCvOrdre(Integer cvOrdre) {
		CvOrdre = cvOrdre;
	}

	
	public CV() {}

	public CV(Byte[] cvFile, EStatus cvStatus, Boolean isAssigned, Integer cvOrdre) {
		super();
		CvFile = cvFile;
		CvStatus = cvStatus;
		IsAssigned = isAssigned;
		CvOrdre = cvOrdre;
	}
	
	
	
	
}
