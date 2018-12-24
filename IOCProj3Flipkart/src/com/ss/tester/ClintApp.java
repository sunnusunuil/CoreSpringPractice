package com.ss.tester;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ss.beans.Flipkart;
@SuppressWarnings("deprecation")
public class ClintApp {

	public static void main(String[] args) {
		//create bean factory IOC container
		FileSystemResource res= new FileSystemResource("src/com/ss/cnfg/ApplicationContainer.xml");
		//Activating BeanFactory Container
		BeanFactory factory= new XmlBeanFactory(res);
		Flipkart bean=factory.getBean("flk",Flipkart.class);
		String BillingMsg=bean.purchase(new String[]{"shirt","pant","coat","belt"});
		System.out.println(BillingMsg);
		

	}

}
