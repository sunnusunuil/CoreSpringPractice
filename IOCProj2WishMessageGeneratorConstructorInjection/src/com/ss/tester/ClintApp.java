package com.ss.tester;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ss.beans.WishMessageGenerator;

public class ClintApp {
	public static void main(String[] args) {
		// locate Spring bean configuration file
		FileSystemResource res = new FileSystemResource("src/com/ss/cnfg/ApplicationContext.xml");
//Activating Bean Factory
		BeanFactory factory = new XmlBeanFactory(res);
//get bean class
		WishMessageGenerator bean = factory.getBean("wmg", WishMessageGenerator.class);
//call business logic
		String result = bean.GetMessage();
		System.out.println(result);
	}
}
