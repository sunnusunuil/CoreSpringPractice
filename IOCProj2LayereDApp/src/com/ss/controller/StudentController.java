package com.ss.controller;

import com.ss.dto.StudentDTO;
import com.ss.service.StudentService;
import com.ss.vo.StudentVO;

public class StudentController {
private StudentService services;

public StudentController(StudentService services) {
	this.services = services;
}
public String process(String sno,String sname,String m1,String m2,String m3) {
	//prepare VO obj
	StudentVO vo= new StudentVO();
	vo.setSno(sno);
	vo.setSname(sname);
	vo.setM1(m1);
	vo.setM2(m2);
	vo.setM3(m3);
	//convert VO to DTO
	StudentDTO dto= new StudentDTO();
	dto.setSno(	Integer.parseInt(vo.getSno()));
	dto.setSname(vo.getSname());
	dto.setM1(Integer.parseInt(vo.getM1()));
	dto.setM2(Integer.parseInt(vo.getM2()));
	dto.setM3(Integer.parseInt(vo.getM3()));
	//use service class
	String result=services.generateResult(dto);
	return result;
}//method
}
