package com.artsoft.examapp.rest;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.artsoft.Animal;
import com.artsoft.examapp.core.interfaces.util.UnTestable;
import com.artsoft.examapp.core.model.subject.Biology;
import com.artsoft.examapp.core.model.subject.Chemistry;
import com.artsoft.examapp.core.model.subject.Geography;
import com.artsoft.examapp.core.model.subject.Geometry;
import com.artsoft.examapp.core.model.subject.Grammar;
import com.artsoft.examapp.core.model.subject.History;
import com.artsoft.examapp.core.model.subject.MathOne;
import com.artsoft.examapp.core.model.subject.Philosophy;
import com.artsoft.examapp.core.model.subject.Physics;
import com.artsoft.examapp.core.model.subject.ReligionCulture;
import com.artsoft.examapp.core.model.subject.TurkishOne;
import com.artsoft.examapp.core.model.util.Question;
import com.artsoft.examapp.core.model.util.TestCreater;
//import com.artsoft.examapp.kafka.producer.ProducerKafka;
import com.artsoft.examapp.kafka.producer.Sender;

@RestController
public class ExamCreateService {
	
	Map<Integer, Animal> animalMap = new HashMap<Integer, Animal>();
	
	@Autowired
	Environment environment;
	
	@Autowired
	Sender sender;
	
//	@Autowired
//	ProducerKafka producerKafka;
//	
//	@RequestMapping("/send")
//	public ResponseEntity<String> send(@PathParam("payload") String payload){
//		producerKafka.sendMessage(payload);
//		return new ResponseEntity<String>(payload, HttpStatus.OK);
//	}
	
	@RequestMapping("/send")
	public ResponseEntity<Animal> send(){
		sender.send(animalMap.get(1));
		return new ResponseEntity<Animal>(animalMap.get(1), HttpStatus.OK);
	}
	
	@PostConstruct
	public void init() {
		animalMap.put(1, new Animal(1, "At"));
		animalMap.put(2, new Animal(2, "Eşek"));
		animalMap.put(3, new Animal(3, "İnek"));
	}
	
	@RequestMapping("/getAll")
	public Collection<Animal> getAll() {
		return animalMap.values();
	}
	
	@RequestMapping(value = "/{id}")
	public Animal getAnimal(@PathVariable("id") Integer id) {
		return animalMap.get(id);
	}
	
//	@RequestMapping("/environment")
//	public String getEnvironment() {
//		return environment.getProperty("local.server.port");
//	}

	@GetMapping("/test")
	public ResponseEntity<Map<String, Map<String, Map<String, String>>>> createTest() {
		Map<String, Map<String, Map<String, String>>> tests = new HashMap<String, Map<String, Map<String, String>>>();
		
		TestCreater testCreater = new TestCreater();
		List<UnTestable> unTestableListT = Arrays.asList(new TurkishOne(), new Grammar());			
		List<UnTestable> unTestableListM = Arrays.asList(new MathOne(), new Geometry());
		List<UnTestable> unTestableListSc = Arrays.asList(new Physics(), new Chemistry(), new Biology());
		List<UnTestable> unTestableListSo = Arrays.asList(new History(), new Geography(), new Philosophy(), new ReligionCulture());

		Question question = new Question();
		tests.put("Türkçe", testCreater.createTest(unTestableListT, question));
		tests.put("Matematik", testCreater.createTest(unTestableListM, question));
		tests.put("Sosyal", testCreater.createTest(unTestableListSo, question));
		tests.put("Fen Bilgisi", testCreater.createTest(unTestableListSc, question));
		
		return new ResponseEntity<Map<String, Map<String, Map<String, String>>>>(tests, HttpStatus.OK);
	}
}
