package com.capgemini.jobportal.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="jobportal")
public class JobPortal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_id ;

	private String user_name; 

	private String user_email ; 

	private String user_mobile;

	private String user_gender;

	private Date user_dob ;

	private int user_role; 

	private String user_password;

@Temporal(TemporalType.TIMESTAMP)
@Column(nullable=false)
private Date user_createddate;

@PrePersist
private void onCreate() {
	user_createddate=new Date();
}

	public JobPortal() {
		super();
	}

	public JobPortal(int user_id, String user_name, String user_email, String user_mobile, String user_gender,
			Date user_dob, int user_role, String user_password, Date user_createddate) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_mobile = user_mobile;
		this.user_gender = user_gender;
		this.user_dob = user_dob;
		this.user_role = user_role;
		this.user_password = user_password;
		this.user_createddate = user_createddate;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_mobile() {
		return user_mobile;
	}

	public void setUser_mobile(String user_mobile) {
		this.user_mobile = user_mobile;
	}

	public String getUser_gender() {
		return user_gender;
	}

	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}

	public Date getUser_dob() {
		return user_dob;
	}

	public void setUser_dob(Date user_dob) {
		this.user_dob = user_dob;
	}

	public int getUser_role() {
		return user_role;
	}

	public void setUser_role(int user_role) {
		this.user_role = user_role;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public Date getUser_createddate() {
		return user_createddate;
	}

	public void setUser_createddate(Date user_createddate) {
		this.user_createddate = user_createddate;
	}

	@Override
	public String toString() {
		return "UserModel [user_id=" + user_id + ", user_name=" + user_name + ", user_email=" + user_email
				+ ", user_mobile=" + user_mobile + ", user_gender=" + user_gender + ", user_dob=" + user_dob
				+ ", user_role=" + user_role + ", user_password=" + user_password + ", user_createddate="
				+ user_createddate + "]";
	}
	
	
	
}
