package com.example.demo.Models;

import java.util.Date;

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
//import javax.persistence.NamedQuery;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "user_role")
//@NamedQuery(name = "Role.findByRoleEndDate", query = "SELECT usr FROM Role usr WHERE roleEndDate IS NULL")
public class Role {
	
	@Id
	@Column(name = "role_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long roleId;
	
	@Column(name = "role_order")
	private Integer roleOrder;
	@Column(name = "role_code")
	@Enumerated(EnumType.STRING)
	private ERole roleCode;
	@Column(name = "start_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date roleStartDate;
	@Column(name = "end_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date roleEnDate;
	
	/*@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;*/
	
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	
	public Role() {}
	
	public Role(Integer roleOrder, ERole roleCode, Date roleStartDate, Date roleEnDate) {
		super();
		this.roleOrder = roleOrder;
		this.roleCode = roleCode;
		this.roleStartDate = roleStartDate;
		this.roleEnDate = roleEnDate;
	}

	public Integer getRoleOrder() {
		return roleOrder;
	}

	public void setRoleOrder(Integer roleOrder) {
		this.roleOrder = roleOrder;
	}

	public ERole getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(ERole roleCode) {
		this.roleCode = roleCode;
	}

	public Date getRoleStartDate() {
		return roleStartDate;
	}

	public void setRoleStartDate(Date roleStartDate) {
		this.roleStartDate = roleStartDate;
	}

	public Date getRoleEnDate() {
		return roleEnDate;
	}

	public void setRoleEnDate(Date roleEnDate) {
		this.roleEnDate = roleEnDate;
	}

	@Override
	public String toString() {
		return "Role [roleOrder=" + roleOrder + ", roleCode=" + roleCode + ", roleStartDate=" + roleStartDate
				+ ", roleEnDate=" + roleEnDate + "]";
	}
	
	

}
