package com.ss.tester;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ss.beans.WishMessageGenerator;

@SuppressWarnings("deprecation")
public class ClientApp {

	public static void main(String[] args) {
		System.out.println("ClientApp :: main Method ");
		Object obj = null;
		WishMessageGenerator Generate = null;
		// locate Spring Bean Configuration File
		FileSystemResource res = new FileSystemResource("src/com/ss/cnfg/NewFile.xml");
		// Activating Bean File Container
		BeanFactory factory = new XmlBeanFactory(res);
		// get bean class object
//		obj=factory.getBean("wmg");
//		Generate=(WishMessageGenerator)obj;
//		System.out.println("Message  :::: "+Generator.class);
//		
		 WishMessageGenerator bean= factory.getBean("wmg",WishMessageGenerator.class);
		//WishMessageGenerator bean = (WishMessageGenerator) factory.getBean("wmg");
		// call business logic
		String result = bean.GenerateWishMessage();
		System.out.println(result);
	}// main
}// class
