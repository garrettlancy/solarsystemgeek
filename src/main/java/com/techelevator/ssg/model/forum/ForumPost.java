package com.techelevator.ssg.model.forum;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class ForumPost {
	private Long id;
	private String username;
	private String subject;
	private String message;
	private LocalDateTime datePosted;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDatePosted() {
		Date out = Date.from(datePosted.atZone(ZoneId.systemDefault()).toInstant());
		return out;	
	}
	public void setDatePosted(LocalDateTime datePosted) {
		this.datePosted = datePosted;
	}
}
