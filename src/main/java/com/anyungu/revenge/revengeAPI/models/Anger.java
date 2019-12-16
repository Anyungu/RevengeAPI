package com.anyungu.revenge.revengeAPI.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "angers")
public class Anger {

	@Id
	private String id;

	@NotNull
	@Email
	private String definer;

	@NotNull
	private String cause;

	@NotNull
	private String description;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDefiner() {
		return definer;
	}

	public void setDefiner(String definer) {
		this.definer = definer;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Anger [id=" + id + ", definer=" + definer + ", cause=" + cause + ", description=" + description + "]";
	}

}
