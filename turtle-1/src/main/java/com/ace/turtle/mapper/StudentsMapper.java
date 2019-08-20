package com.ace.turtle.mapper;

import java.util.List;

import com.ace.turtle.common.view.StageScoreModel;
import com.ace.turtle.common.view.StuAvgModel;
import com.ace.turtle.model.StudentsModel;

public interface StudentsMapper {

	List<StudentsModel> getAll();

	int insert(StudentsModel model);

	List<StuAvgModel> getAvg();

	List<StageScoreModel> getByCourseNum(Integer course, String num);

	String getByNum(String num);

}
