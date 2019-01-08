package com.ss.beans;

public class DTDC implements Couriour {

	@Override
	public String deliver(int orderid) {
		return "DTDC is ready to deliver the item of id --->" + orderid;
	}

}
