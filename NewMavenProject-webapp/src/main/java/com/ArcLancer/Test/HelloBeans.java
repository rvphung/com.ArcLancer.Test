package com.ArcLancer.Test;

public class HelloBeans {

	private String message;

	public String getMessage() {

		return "你的訊息: " + message;
	}

	public void setMessage(String message) {

		this.message = message;
	}
}
