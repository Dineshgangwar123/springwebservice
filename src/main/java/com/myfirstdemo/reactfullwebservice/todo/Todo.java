package com.myfirstdemo.reactfullwebservice.todo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity
public class Todo {
//	@Id
//	@GeneratedValue
	private long id;
	
	private String username;
	private String discription;
	private Date targetDate;
	private boolean isDone;


	public Todo()
	{
		
	}

	public Todo(long id, String username, String discription, Date targetDate, boolean isDone) {
		super();
		
		
		this.id = id;
		
		this.username = username;
		this.discription = discription;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}

	
	public boolean isDone() {
		return isDone;
	}


	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
}



