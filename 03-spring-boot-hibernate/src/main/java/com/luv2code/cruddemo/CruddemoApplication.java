package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.dao.StudentDAOImpl;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		//create the student object
		System.out.println("creting new student object ...");
		Student tempStudent=new Student("paul", "Doe","paul@xyz.com");
		//save the student obj
		System.out.println("Saving STudent ....");
		studentDAO.save(tempStudent);
		//display the id of the saved student
		System.out.println("Saved student generated id"+ tempStudent.getId());
	}
}
