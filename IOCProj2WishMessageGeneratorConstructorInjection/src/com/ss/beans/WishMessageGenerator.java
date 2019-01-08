package com.ss.beans;

import java.util.Date;

public class WishMessageGenerator {
	//bean property
private Date date;
private String name;
//constructor injection
public WishMessageGenerator(Date date, String name) {
	super();
	this.date = date;
	this.name = name;
}
public String GetMessage() {
	return "Good Morning "+ name+" ------->"+date;
}





}
