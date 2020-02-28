package com.example.demo;
import java.io.IOException;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		ObjectMapper mapper = new ObjectMapper();
		
	    RestTemplate plantilla = new RestTemplate();
	    String result = plantilla.getForObject("https://pw3vab73uc.execute-api.us-west-2.amazonaws.com/FirstTesting/pets/", String.class);
	
	   try {
	    	List<Pets> pets = mapper.readValue(result,
	    			mapper.getTypeFactory().constructCollectionType(List.class, Pets.class));
	    	System.out.println(pets);
	    }catch(IOException e) {
	    	e.printStackTrace();
	    }
	}

}
