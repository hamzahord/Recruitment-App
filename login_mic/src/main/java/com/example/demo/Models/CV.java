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
	private Long cvID;
	@Lob
	@Column(name = "cv_file")
	private Byte[] cvFile;
	@Column(name = "cv_status")
	@Enumerated(EnumType.STRING)
	private EStatus cvStatus;
	@Column(name = "is_cv_assigned")
	private Boolean isAssigned;
	@Column(name = "cv_ordre")
	private Integer cvOrdre;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cand_id")
	private Candidate candidate;


	public Byte[] getCvFile() {
		return cvFile;
	}


	public void setCvFile(Byte[] cvFile) {
		this.cvFile = cvFile;
	}


	public EStatus getCvStatus() {
		return cvStatus;
	}


	public void setCvStatus(EStatus cvStatus) {
		this.cvStatus = cvStatus;
	}


	public Boolean getIsAssigned() {
		return isAssigned;
	}


	public void setIsAssigned(Boolean isAssigned) {
		this.isAssigned = isAssigned;
	}


	public Integer getCvOrdre() {
		return cvOrdre;
	}


	public void setCvOrdre(Integer cvOrdre) {
		this.cvOrdre = cvOrdre;
	}

	
	public CV() {}

	public CV(Byte[] cvFile, EStatus cvStatus, Boolean isAssigned, Integer cvOrdre) {
		super();
		this.cvFile = cvFile;
		this.cvStatus = cvStatus;
		this.isAssigned = isAssigned;
		this.cvOrdre = cvOrdre;
	}
	
	
	
	
}
