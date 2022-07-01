package com.Expenses.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "user_table")
public class User {
	

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ersUsersId;
	
	@Column(name = "username", nullable = false, unique = true)
	private String ersUsername;
	
	@Column(name = "password", nullable = false)
	private String ersPassword;
	
	@Column(name = "first_name", nullable = false)
	private String ersFirstName;
	
	@Column(name = "last_name", nullable = false)
	private String ersLastName;
	
	@Column(name = "email_address", nullable = false, unique = true)
	private String ersEmail;
	
	@ManyToOne
	@JoinColumn(name = "role_id")
	private UserRole user_role;
	
	
	public User(String string, String string2, String string3, String string4, String string5, UserRole optional) {
		this.ersUsername = string;
		this.ersPassword = string2;
		this.ersFirstName = string3;
		this.ersLastName = string4;
		this.ersEmail = string5;
		this.user_role = optional;
	}
}

