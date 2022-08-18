package com.example.demo.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.CV;

public interface CvRepository extends JpaRepository<CV, Long>{
	

}
