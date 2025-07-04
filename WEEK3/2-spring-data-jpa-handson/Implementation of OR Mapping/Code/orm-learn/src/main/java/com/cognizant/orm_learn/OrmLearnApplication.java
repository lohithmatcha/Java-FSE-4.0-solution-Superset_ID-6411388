package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Student;
import com.cognizant.orm_learn.model.Course;
import com.cognizant.orm_learn.model.Department;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import com.cognizant.orm_learn.repository.StudentRepository;
import com.cognizant.orm_learn.repository.CourseRepository;
import com.cognizant.orm_learn.repository.DepartmentRepository;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;

@SpringBootApplication
@EntityScan(basePackages = "com.cognizant.orm_learn.model")
@ComponentScan(basePackages = "com.cognizant.orm_learn")
@EnableJpaRepositories(basePackages = "com.cognizant.orm_learn.repository")
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

	}




	// 🔁 O/R Mapping Test for Hands-on 4
	@Bean
	public CommandLineRunner orMappingDemo(StudentRepository studentRepo,
										   CourseRepository courseRepo,
										   DepartmentRepository deptRepo) {
		return args -> {
			LOGGER.info("Start Hands-on 4: O/R Mapping Demo");

			// Create department
			Department dept = new Department();
			dept.setName("Computer Science");
			deptRepo.save(dept);

			// Create courses
			Course c1 = new Course();
			c1.setTitle("Spring Boot");

			Course c2 = new Course();
			c2.setTitle("Java");

			courseRepo.saveAll(Arrays.asList(c1, c2));

			// Create student
			Student student = new Student();
			student.setName("John Doe");
			student.setDepartment(dept);
			student.setCourses(Arrays.asList(c1, c2));
			studentRepo.save(student);

			LOGGER.info("Saved student: {}", student);
			LOGGER.info("End Hands-on 4");
		};
	}
}