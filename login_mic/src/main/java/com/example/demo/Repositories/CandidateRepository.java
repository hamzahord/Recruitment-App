package com.example.demo.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import com.example.demo.Models.Candidate;
//import com.example.demo.Models.Interview;

public interface CandidateRepository extends JpaRepository<Candidate, Long>{

	//@Query("SELECT int FROM Interview int, Candidate can WHERE can.CandidateLastname = ?1")
	List<Candidate> findByCandidateLastname(String cand_lastname);
}
