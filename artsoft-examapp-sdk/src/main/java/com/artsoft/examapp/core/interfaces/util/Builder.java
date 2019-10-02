package com.artsoft.examapp.core.interfaces.util;

import java.util.Map;

public interface Builder {

	@SuppressWarnings("unchecked")
	<T extends UnTestable> Map<String, Map<String, String>> createTest(T... unTestables);
}
