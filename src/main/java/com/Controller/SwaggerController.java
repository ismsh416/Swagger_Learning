package com.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.Student;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "User Rest Controller", description = "REST API for User")
@RequestMapping("/api")
@RestController
public class SwaggerController {
	List<Student> mySchool = new ArrayList<Student>();
	{

		mySchool.add(new Student(1, "Ismail", "I"));
		mySchool.add(new Student(2, "Jabi", "III"));
		mySchool.add(new Student(7, "Ram", "VI"));
		mySchool.add(new Student(4, "Sita", "II"));
		mySchool.add(new Student(3, "Gita", "II"));
		mySchool.add(new Student(5, "Bhim", "I"));
		mySchool.add(new Student(5, "Bhim", "I"));
	}
	@ApiOperation(value = "Get All Students",response = Iterable.class,tags = "Get All Students" )
	@RequestMapping(value = "/getStudents")
	public List<Student> getStudents() {
		return mySchool;
	}

	@ApiOperation(value = "Get Student by class", response = Student.class, tags ="Get Student by Class" )
	@RequestMapping(value = "/getcls/{cls}")
	public Student getStudentClass(@PathVariable(value = "cls") String scls) {

		return mySchool.stream().filter(x -> x.getSclass().equalsIgnoreCase(scls)).collect(Collectors.toList()).get(0);
	}

	@ApiOperation(value = "Get Student by name", response = Student.class, tags ="Get Student by Name" )
	@RequestMapping(value = "/getname/{name}")
	public Student getStudent(@PathVariable(value = "name") String name) {

		return mySchool.stream().filter(x -> x.getName().equalsIgnoreCase(name)).collect(Collectors.toList()).get(0);
	}

	@ApiOperation(value = "Get Student by ID", response = Student.class, tags ="Get Student by ID" )
	@RequestMapping(value = "/getid/{id}")
	public Student getStudentID(@PathVariable(value = "id") int id) {

		return mySchool.stream().filter(x -> x.getId() == id).collect(Collectors.toList()).get(0);

	}
}
