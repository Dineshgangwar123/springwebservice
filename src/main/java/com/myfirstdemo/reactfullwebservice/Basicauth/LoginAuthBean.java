package com.myfirstdemo.reactfullwebservice.Basicauth;

public class LoginAuthBean {

	private String message;
	public LoginAuthBean(String message) {
		this.message=message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

	

}
