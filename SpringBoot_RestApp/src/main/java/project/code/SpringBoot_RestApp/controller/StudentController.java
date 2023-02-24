package project.code.SpringBoot_RestApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.code.SpringBoot_RestApp.entity.Student;
import project.code.SpringBoot_RestApp.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/student")
	public ResponseEntity<List<Student>> displayAll() {
	
		List<Student> slist=null;
		return ResponseEntity.ok(slist);
		
	
	}
	
	
	
	
	

}
