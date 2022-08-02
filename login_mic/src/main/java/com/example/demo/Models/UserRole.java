package com.example.demo.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
public class UserRole {

	private Long userId;
	private String userFirstname;
	private String userLastname;
	private String userEmail;
	private String userPassword;
	private Boolean IsHashed;
	private String roleId;
	private Integer roleOrder;
	private String roleCode;
	private Date roleStartDate;
	private Date roleEnDate;

}
