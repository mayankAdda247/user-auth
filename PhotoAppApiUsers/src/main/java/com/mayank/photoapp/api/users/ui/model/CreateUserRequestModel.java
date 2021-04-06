package com.mayank.photoapp.api.users.ui.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateUserRequestModel {
	@NotNull(message = " First name cannot be null")
	@Size(min=2, message= "firstname should be more than 2")
	private String firstName;
	
	@NotNull(message =" Last name cannot be null")
	@Size(min=2, message= " lastname should be more than 2")
	private String lastName;
	
	@NotNull(message = " password cannot be null")
	@Size(min=8,max=16, message= "password should be more than 8 less than 16")
	private String password;
	
	@NotNull(message = "email cannot be null")
	@Email
	private String email;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
