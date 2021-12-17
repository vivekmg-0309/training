package com.sonata.JobTracker.Model;

import java.sql.Date;

public class Task {
	private int taskId;
	private int ownerId;
	private int  creatorId;
	private String name;
	private String description;
	private String status;
	private String priority;
	private String isBookmarked;
	private Date createdOn;
	private Date satusChangeOn;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public String getIsBookmarked() {
		return isBookmarked;
	}
	public void setIsBookmarked(String isBookmarked) {
		this.isBookmarked = isBookmarked;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getSatusChangeOn() {
		return satusChangeOn;
	}
	public void setSatusChangeOn(Date satusChangeOn) {
		this.satusChangeOn = satusChangeOn;
	}
	
	
	

}
