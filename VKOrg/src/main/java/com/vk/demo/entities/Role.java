package com.vk.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Role {

	@Id
	private int role_id;
	
	private String role;
	
	public int getRole_id() {
		return role_id;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	} 
	
	
}
