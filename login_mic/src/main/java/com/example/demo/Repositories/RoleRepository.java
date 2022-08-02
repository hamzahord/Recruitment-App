package com.example.demo.Repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Models.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	@Query(value = "SELECT a FROM Role a WHERE a.roleEnDate IS NULL")
	List<Role> findByRoleEnDate(Date roleEnDate);
}
