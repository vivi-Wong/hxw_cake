package com.ace.turtle.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.ace.turtle.common.enums.CourseEnum;
import com.ace.turtle.common.enums.SexEnum;
import com.ace.turtle.common.enums.StageEnum;


public class StudentsModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String stuName;
	
	private Integer sex;
	
	private Integer age;
	
	private String school;
	
	private Integer score;
	
	private Integer course;
	
	private Integer stage;
	
	private LocalDateTime gmtCreate;
	
	public String getCourseStr() {
		return CourseEnum.getEnum(this.course).getDesc();
	}

	public String getSexStr() {
		return SexEnum.getEnum(this.sex).getDesc();
	}
	
	public String getStageStr() {
		return StageEnum.getEnum(this.stage).getDesc();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}


}
