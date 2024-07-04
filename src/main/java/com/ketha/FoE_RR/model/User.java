package com.ketha.FoE_RR.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Entity
@Data
@Builder
@AllArgsConstructor
//@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String email;
	private long phoneNo;
	private String userName;
	@Enumerated(EnumType.STRING)
	private UserType userType;
	
	public enum UserType {regular_user, admin, super_admin};
	
	
	
	public User() {
		
	}
	
	public User(String email, long phoneNo, String userName, UserType userType) {
		this.email = email;
		this.phoneNo = phoneNo;
		this.userName = userName;
		this.userType = userType;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public String getEmail() {
		return email;
	}
	
	public long getPhoneNo() {
		return phoneNo;
	}

	public String getUserName() {
		return userName;
	}

	public UserType getUserType() {
		return userType;
	}
	
}
