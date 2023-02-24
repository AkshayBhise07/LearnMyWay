package project.code.SpringBoot_RestApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import project.code.SpringBoot_RestApp.entity.Student;

@SpringBootApplication
public class SpringBootRestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestAppApplication.class, args);
		
		
		Student s= new Student();
		
		System.out.println(s);
	}

}
