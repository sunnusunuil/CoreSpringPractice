package com.ss.service;

import com.ss.bo.StudentBO;
import com.ss.dao.StudentDAO;
import com.ss.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	private StudentDAO dao;

	public StudentServiceImpl(StudentDAO dao) {

		this.dao = dao;
	}

	@Override
	public String generateResult(StudentDTO dto) {
		// write business logic
		int total = dto.getM1() + dto.getM2() + dto.getM3();
		float avg = (float) total / 3.0f;
		String result = null;
		if (avg < 35)
			result = "fail";
		else
			result = "pass";
		// create bo object class
		StudentBO bo = new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		// use DAO
		int cnt = dao.insert(bo);
		if (cnt == 0)
			return "Result: " + bo.getResult() + " " + bo.getSno() + "Registration Failed";
		else
			return "Result: " + bo.getResult() + " " + bo.getSno() + "Registration Succedded";
	}

}
