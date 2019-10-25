import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	String name;
	int age;
	Map<String, List<String>> map;
//	void test(FunctionalInterface functionalInterface) {
//		
//	}

	public static void main(String[] args) {
		Map<String, List<String>> map = new HashMap<>();
		map.put("programing", Arrays.asList("Java", "Python"));
		map.put("language", Arrays.asList("English", "Turkish"));
		Map<String, List<String>> map1 = new HashMap<>();
		map1.put("programing", Arrays.asList("C#", "Scala"));
		map1.put("language", Arrays.asList("German", "Turkish"));
		Map<String, List<String>> map2 = new HashMap<>();
		map2.put("programing", Arrays.asList("C++", "Swift"));
		map2.put("language", Arrays.asList("Spanish", "Russian"));
		Map<String, List<String>> map3 = new HashMap<>();
		map3.put("programing", Arrays.asList("C++", "Swift"));
		map3.put("language", Arrays.asList("Spanish", "Russian"));
		Map<String, List<String>> map4 = new HashMap<>();
		map4.put("programing", Arrays.asList("C++", "Swift"));
		map4.put("language", Arrays.asList("Spanish", "Russian"));
		
		List<Student> studentList = Arrays.asList(
				new Student("Ali", 15, map), 
				new Student("Mehmet", 20, map1), 
				new Student("Ayþe", 22, map2), 
				new Student("Gürkan", 18, map3), 
				new Student("Venessa", 25, map4));
		
		studentList.stream()
			.flatMap(student -> 
				student.getMap().entrySet().stream().map(key -> key.getValue())).forEach(action -> System.out.println(action));
				
				
	}
				

}

interface FunctionalInterface<T extends Student> {
	void metot();
}