package com.ss.beans;

import java.util.Random;

public class Flipkart {
	private Couriour couriour;
	Random ran = null;

	// setter injection
	public void setCouriour(Couriour couriour) {
		this.couriour = couriour;
	}

	public String purchase(String items[]) {
		// generate a random id
		ran = new Random();
		int orderid = ran.nextInt(700000);
		// deliver order
		String status = couriour.deliver(orderid);

		return status + "\nBill amount for order id -->" + orderid + " is 2500";
	}// method

}// class
