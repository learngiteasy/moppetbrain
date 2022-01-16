package com.rajnish;

import org.springframework.beans.factory.annotation.Autowired;

public class User {

	private int userId;
	private String userName;
	private int income;
	
	@Autowired
	private Card card;
	
	public int getUserId() {
		return userId;
	}
	
	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public void setUserId(int userId) {
		
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", income=" + income + ", card=" + card + "]";
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub

		System.out.println("Constructing object 1::");
	}
	public User(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
		System.out.println("Constructing object 2::");
	}
	
	
}
