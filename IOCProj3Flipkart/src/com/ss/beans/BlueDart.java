package com.ss.beans;

public class BlueDart implements Couriour {

	@Override
	public String deliver(int orderid) {

		return "BlueDart is ready to deliver product of id --->" + orderid;
	}

}
