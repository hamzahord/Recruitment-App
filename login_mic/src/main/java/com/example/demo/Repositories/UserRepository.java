package com.example.demo.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Models.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	@Query("SELECT ust FROM User ust, Role usr WHERE ust.userEmail = ?1 AND usr.roleEnDate IS NULL ")
	List<User> findByUserEmail(String user_email);
	//List<User> findByRoles(Role roles);
	List<User> findByUserPassword(String user_password);
	/*@Query("SELECT ust FROM User ust, Role usr WHERE ust.userId = usr.userId AND usr.RoleEndDate IS NULL AND ust.userId = ?1")
	UserRole findUserRoleByUserId(Long user_id);*/
	
}