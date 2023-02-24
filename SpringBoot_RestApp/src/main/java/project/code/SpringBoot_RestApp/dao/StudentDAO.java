package project.code.SpringBoot_RestApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import project.code.SpringBoot_RestApp.entity.Student;

public interface StudentDAO extends JpaRepository<Student,Integer> {
	
	

}
