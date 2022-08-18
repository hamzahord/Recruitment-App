package com.example.demo.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import com.example.demo.Models.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	//@Query(value = "SELECT a FROM Role a, User b WHERE b.userLastname = ?1 AND a.roleEnDate IS NULL")
	List<Role> findByRoleEnDate(String userLastname);
}
