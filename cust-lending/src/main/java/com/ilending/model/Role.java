package com.ilending.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aas_role")
public class Role {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int roleId;
	@Column(name="role_name")
	private String roleName;
	@Column(name="role_description")
	private String roleDescription;
	@Column(name="access_level")
	private String accessLevel;
	
	public Role() {
		
	}

	public Role(int roleId, String roleName, String roleDescription, String accessLevel) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleDescription = roleDescription;
		this.accessLevel = accessLevel;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public String getAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}
			
}
