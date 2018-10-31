package com.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role_tourist 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	private String roleName;
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String role) {
		this.roleName = role;
	}
	

}