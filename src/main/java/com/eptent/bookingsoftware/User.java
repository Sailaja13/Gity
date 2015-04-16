package com.eptent.bookingsoftware;

import java.util.List;

import org.springframework.data.annotation.Id;

public class User {

	@Id private String id;

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private boolean active = true;
	//@DbRef 	
		List<String> roles;
	
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	
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
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void addRole(String roleID)
	{
		roles.add(roleID);
	}
	
	public List<String> getRoles()
	{
		return roles;
	}
	
	public void deleteRole(String roleID)
	{
		roles.remove(roleID);
	}

}
