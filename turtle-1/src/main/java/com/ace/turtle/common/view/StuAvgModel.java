package com.ace.turtle.common.view;

import java.io.Serializable;
import java.util.List;

import com.ace.turtle.common.enums.CourseEnum;

public class StuAvgModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String num;
	
	private String name;
	
	private Integer course;
	
	private Double avgScore;
	
	private List<StageScoreModel> stageScore;

	public String getCourseStr() {
		return CourseEnum.getEnum(this.course).getDesc();
	}

	public Integer getCourse() {
		return course;
	}

	public void setCourse(Integer course) {
		this.course = course;
	}

	public Double getAvgScore() {
		return avgScore;
	}

	public void setAvgScore(Double avgScore) {
		this.avgScore = avgScore;
	}

	public List<StageScoreModel> getStageScore() {
		return stageScore;
	}

	public void setStageScore(List<StageScoreModel> stageScore) {
		this.stageScore = stageScore;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
