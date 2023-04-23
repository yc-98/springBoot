package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.dao.StudentDAOImpl;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
//			createStudent(studentDAO);
//			readStudent(studentDAO);
			queryForStudents(studentDAO);
		};
	}

	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> theStudents =studentDAO.findAll();
		for(Student tempStud:theStudents){
			System.out.println(tempStud);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		//create the student object
		System.out.println("creting new student object ...");
		Student tempStudent=new Student("daffy", "Doe","daffy@xyz.com");
		//save the student obj
		System.out.println("Saving STudent ....");
		studentDAO.save(tempStudent);
		//display the id of the saved student
		int theId=tempStudent.getId();
		System.out.println("Saved student generated id"+ tempStudent.getId());
		//retrieve
		Student createdStudent = studentDAO.findById(theId);
		//display student
		System.out.println(createdStudent);
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
		//retrieve

	}
}
