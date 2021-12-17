package com.Entity;

import io.swagger.annotations.ApiModelProperty;

public class Student {

	@ApiModelProperty(notes = "Student ID", name ="id", required = true, value = "1")
	private int id;
	
	@ApiModelProperty(notes = "Student Name", name ="name", required = true, value = "test name")
	private String name;
	
	@ApiModelProperty(notes = "Student Class", name ="Sclass", required = true, value = "test class")
	private String Sclass;


	public Student(int id, String name, String Sclass) {
		super();
		this.id = id;
		this.name = name;
		this.Sclass = Sclass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSclass() {
		return Sclass;
	}

	public void setSclass(String Sclass) {
		this.Sclass = Sclass;
	}

	@Override
	public String toString() {
		return "Student {" +
				"id=" + id + 
				", name=" + name + 
				", Sclass=" + Sclass +
				"}";
	}

}
