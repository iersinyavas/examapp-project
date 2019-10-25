package com.artsoft.examapp.core.model.util;

import java.util.HashMap;
import java.util.Map;

public class Option {

	public static Map<String, String> options = new HashMap<String, String>();

	public static Map<String, String> getOptions() {
		options.put("A", "A");
		options.put("B", "B");
		options.put("C", "C");
		options.put("D", "D");
		options.put("E", "E");
		return options;
	}

}
