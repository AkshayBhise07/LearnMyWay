package project.code.SpringBoot_RestApp.service;

import org.springframework.beans.factory.annotation.Autowired;

import project.code.SpringBoot_RestApp.dao.StudentDAO;

public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDAO studentDAO;
	
	

}
