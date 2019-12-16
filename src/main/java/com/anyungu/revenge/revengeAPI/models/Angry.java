package com.anyungu.revenge.revengeAPI.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "angrys")
public class Angry {

	@Id
	private String id;

	@NotNull
	@Email
	private String me;

	@NotNull
	private String cause;

	@NotNull
	private String causeId;

	@NotNull
	private String provoker;

	@NotNull
	private Boolean cleared;

	@NotNull
	private Boolean forgiven;

	@NotNull
	private Integer level;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMe() {
		return me;
	}

	public void setMe(String me) {
		this.me = me;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public String getCauseId() {
		return causeId;
	}

	public void setCauseId(String causeId) {
		this.causeId = causeId;
	}

	public String getProvoker() {
		return provoker;
	}

	public void setProvoker(String provoker) {
		this.provoker = provoker;
	}

	public Boolean getCleared() {
		return cleared;
	}

	public void setCleared(Boolean cleared) {
		this.cleared = cleared;
	}

	public Boolean getForgiven() {
		return forgiven;
	}

	public void setForgiven(Boolean forgiven) {
		this.forgiven = forgiven;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Angry [id=" + id + ", me=" + me + ", cause=" + cause + ", causeId=" + causeId + ", provoker=" + provoker
				+ ", cleared=" + cleared + ", forgiven=" + forgiven + ", level=" + level + "]";
	}

}
