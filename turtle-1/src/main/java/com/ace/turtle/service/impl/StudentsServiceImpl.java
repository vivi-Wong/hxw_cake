package com.ace.turtle.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ace.turtle.common.view.StageScoreModel;
import com.ace.turtle.common.view.StuAvgModel;
import com.ace.turtle.form.StudentsForm;
import com.ace.turtle.mapper.StudentsMapper;
import com.ace.turtle.model.StudentsModel;
import com.ace.turtle.service.StudentsService;
@Service
public class StudentsServiceImpl implements StudentsService{

	@Autowired
	private StudentsMapper studentsMapper;

	@Override
	public List<StudentsModel> getAll() {
		// TODO Auto-generated method stub
		return this.studentsMapper.getAll();
	}

	@Override
	public boolean add(StudentsForm form) {
		StudentsModel model=new StudentsModel();
		model.setAge(form.getAge());
		model.setCourse(model.getCourse());
		model.setGmtCreate(LocalDateTime.now());
		model.setStuName(form.getName());
		model.setSchool(form.getSchool());
		model.setSex(form.getSex());
		model.setStage(form.getStage());
		int a = this.studentsMapper.insert(model);
		return a>0;
	}
	@Override
	public List<StuAvgModel> detail() {
		List<StuAvgModel> models=this.studentsMapper.getAvg();
		models.forEach(model->{
			String stu=this.studentsMapper.getByNum(model.getNum());
			model.setName(stu);
			List<StageScoreModel> stages=this.studentsMapper.getByCourseNum(model.getCourse(),model.getNum());
			model.setStageScore(stages);
		});
		return models;
	}
	
}
