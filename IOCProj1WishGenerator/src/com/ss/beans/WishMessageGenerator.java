package com.ss.beans;

import java.util.Date;

public class WishMessageGenerator {
	// bean Properties
	private Date date;
	private String name;

	public WishMessageGenerator() {
		System.out.println("Zero Param constructor");
	}
	// Setter method for setter injection

	public void setDate(Date date) {
		this.date = date;
	}

	public void setName(String name) {
		this.name = name;
	}

	// business logic
	public String GenerateWishMessage() {
		return "Good morning " + name + "----->" + date;
	}
}
