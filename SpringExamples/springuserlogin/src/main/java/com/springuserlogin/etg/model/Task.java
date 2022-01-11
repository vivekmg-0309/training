package com.springuserlogin.etg.model;

import java.sql.Date;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class Task {
	
	private int taskId;
	private int ownerId;
	private int creatorId;
	private String taskName;
	private String description;
	private String know;
	private String status;
	private String priority;
	private String notes;
	private String bookmark;
	private Date createdOn;
	public String getKnow() {
		return know;
	}
	public void setKnow(String know) {
		this.know = know;
	}
	private Date statusChangedOn;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public int getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getStatusChangedOn() {
		return statusChangedOn;
	}
	public void setStatusChangedOn(Date statusChangedOn) {
		this.statusChangedOn = statusChangedOn;
	}
	public String getBookmark() {
		return bookmark;
	}
	public void setBookmark(String bookmark) {
		this.bookmark = bookmark;
	}

	
}

