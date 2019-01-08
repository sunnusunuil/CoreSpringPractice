package com.ss.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ss.controller.StudentController;

public class ClintApp {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	//create IOC container
	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/ss/cnfg/ApplicationContext.xml"));
	//get bean
	StudentController controller=factory.getBean("stController",StudentController.class);
	//call method
	System.out.println(controller.process("1013","raja","56","67","73"));
}
}
