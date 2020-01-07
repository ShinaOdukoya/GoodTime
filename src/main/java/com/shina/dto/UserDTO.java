package com.shina.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Users")
public class UserDTO {
	
	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private Long id;
	
	@NotEmpty
	@Length(max = 50)
	@Column(name = "NAME")
	private String name;
	
//	@Column(name = "LAST_NAME")
//	private String lastName;
//	
	@NotEmpty
	@Length(max = 80)
	@Column(name = "EMAIL")
	private String email;
	
	@NotEmpty
	@Column(name = "PHONE_NUMBER")
	private int phoneNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getErrorMessage() {
		
		return null;
	}
	
	

}
