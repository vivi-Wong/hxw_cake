package com.ace.turtle.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ace.turtle.common.view.Msg;
import com.ace.turtle.common.view.StuAvgModel;
import com.ace.turtle.form.StudentsForm;
import com.ace.turtle.service.StudentsService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentsService studentsService;
	
	@GetMapping("/getAll")
	public Msg getAll() {
		
		return new Msg().success(this.studentsService.getAll());
	}
	
	@PostMapping("/add")
	public Msg add(HttpServletRequest request,@Valid @RequestBody StudentsForm form) {
		boolean flag=this.studentsService.add(form);
		
		return new Msg().success(flag);
	}
	
	@PostMapping("/detail")
	public Msg detail(HttpServletRequest request) {
		List<StuAvgModel> models=this.studentsService.detail();
		return new Msg().success(models);
	}
	
}
