package com.ilending.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="aas_user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	@Column(name = "username")
	private String userName;
	private String password;
	private String enabled;
	private String expired;
	@Column(name = "date_create")
	private Date dateCreated;
	@Column(name = "date_last_access")
	private Date dateLastAccessed;
	@Column(name = "failed_login_attempt")
	private int failedLoginAttempts;
	@Column(name = "date_password_expiry")
	private Date datePasswordExpiry;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "aas_user_role_map", joinColumns = @JoinColumn(name="userId"), inverseJoinColumns = @JoinColumn(name = "roleId"))
	private Set<Role> roles;

	public User() {
		
	}
	
	public User(int userId, String userName, String password, String enabled, String expired, Date dateCreated,
			Date dateLastAccessed, int failedLoginAttempts, Date datePasswordExpiry, Set<Role> roles) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.enabled = enabled;
		this.expired = expired;
		this.dateCreated = dateCreated;
		this.dateLastAccessed = dateLastAccessed;
		this.failedLoginAttempts = failedLoginAttempts;
		this.datePasswordExpiry = datePasswordExpiry;
		this.roles = roles;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getExpired() {
		return expired;
	}

	public void setExpired(String expired) {
		this.expired = expired;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateLastAccessed() {
		return dateLastAccessed;
	}

	public void setDateLastAccessed(Date dateLastAccessed) {
		this.dateLastAccessed = dateLastAccessed;
	}

	public int getFailedLoginAttempts() {
		return failedLoginAttempts;
	}

	public void setFailedLoginAttempts(int failedLoginAttempts) {
		this.failedLoginAttempts = failedLoginAttempts;
	}

	public Date getDatePasswordExpiry() {
		return datePasswordExpiry;
	}

	public void setDatePasswordExpiry(Date datePasswordExpiry) {
		this.datePasswordExpiry = datePasswordExpiry;
	}
	
	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
}
