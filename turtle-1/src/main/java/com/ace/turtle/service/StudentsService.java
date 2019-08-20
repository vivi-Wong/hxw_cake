package com.ace.turtle.service;

import java.util.List;

import com.ace.turtle.common.view.StuAvgModel;
import com.ace.turtle.form.StudentsForm;
import com.ace.turtle.model.StudentsModel;

public interface StudentsService {

	List<StudentsModel> getAll();

	boolean add(StudentsForm form);

	List<StuAvgModel> detail();

}
