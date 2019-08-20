package com.ace.turtle.form;

import java.io.Serializable;
import java.time.LocalDateTime;


public class StudentsForm implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	private String name;
	
	private Integer sex;
	
	private Integer age;
	
	private String school;
	
	private Integer score;
	
	private Integer course;
	
	private Integer stage;
	
	private LocalDateTime gmtCreate;



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getCourse() {
		return course;
	}

	public void setCourse(Integer course) {
		this.course = course;
	}

	public Integer getStage() {
		return stage;
	}

	public void setStage(Integer stage) {
		this.stage = stage;
	}

	public LocalDateTime getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(LocalDateTime gmtCreate) {
		this.gmtCreate = gmtCreate;
	}


}
