package com.artsoft.examapp.core.model.school;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class University {
	
	private Integer universityId;
	private String universityName;
	private Map<String, Faculty> faculties;
	private String city;
	
	
	

}
