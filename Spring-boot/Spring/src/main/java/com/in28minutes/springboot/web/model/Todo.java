package com.in28minutes.springboot.web.model;

import java.util.Date;

public class Todo {
    private int id;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String user;
    public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	private String desc;
    public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	private Date targetDate;
    public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	private boolean isDone;
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

} 