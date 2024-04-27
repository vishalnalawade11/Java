package com.app.cricketer;

import com.app.rating.Rating;

public class Cricketer {
	private String name;
	private int age;
	private String emailId;
	private String phone;
	private Rating rating;

	public Cricketer(String name, int age, String emailId, String phone, Rating rating) {
		super();
		this.name = name;
		this.age = age;
		this.emailId = emailId;
		this.phone = phone;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", age=" + age + ", emailId=" + emailId + ", phone=" + phone + ", rating="
				+ rating + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

}
