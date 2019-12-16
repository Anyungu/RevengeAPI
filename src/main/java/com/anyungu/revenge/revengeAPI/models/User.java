package com.anyungu.revenge.revengeAPI.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

	@Id
	private String id;

	@NotNull
	@Email
	@UniqueElements
	private String email;

	@NotNull
	@Email
	private String name;

	@NotNull
	@Email
	private String password;

	@NotNull
	private Integer yob;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getYob() {
		return yob;
	}

	public void setYob(Integer yob) {
		this.yob = yob;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", name=" + name + ", password=" + password + ", yob=" + yob
				+ "]";
	}

}
