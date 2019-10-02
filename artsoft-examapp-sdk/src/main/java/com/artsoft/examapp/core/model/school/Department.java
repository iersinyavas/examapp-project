package com.artsoft.examapp.core.model.school;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Department {

	private Integer departmentId;
	private String departmentName;
	private Integer quota;
	private Float lowestScore;
}
