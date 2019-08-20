package com.ace.turtle.common.view;

import java.io.Serializable;

import com.ace.turtle.common.enums.StageEnum;

public class StageScoreModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer stage;
	
	private Integer score;

//	public String getStageStr() {
//		return StageEnum.getEnum(this.score).getDesc();
//	}
	
	public Integer getStage() {
		return stage;
	}

	public void setStage(Integer stage) {
		this.stage = stage;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
}
