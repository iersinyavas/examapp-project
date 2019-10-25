package com.artsoft.examapp.core.model.school;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Faculty {
	
	private Integer facultyId;
	private String facultyName; 
	private Map<String, Department> departments;

}
