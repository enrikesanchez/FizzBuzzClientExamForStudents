package mx.tec.exam.service;

import java.io.IOException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * For multiples of 3, instead of the number, return "Fizz", for multiples of 5
 * return "Buzz". For numbers which are multiples of both 3 and 5, return
 * "FizzBuzz".
 */
@Service
public class FizzBuzzService {
	public String getFizzBuzzValue(final int value) {
		String fizzBuzzValue = String.valueOf(value);

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<String> entity = new HttpEntity<String>(null, new HttpHeaders());
		ResponseEntity<String> response = restTemplate.exchange("https://bizzbuzz.herokuapp.com/fizzbuzz/" + value,
				HttpMethod.GET, entity, String.class);
		ObjectMapper mapper = new ObjectMapper();
		JsonNode root;
		try {
			root = mapper.readTree(response.getBody());
			fizzBuzzValue = root.path("response").asText();
		} catch (final IOException ioe) {
			ioe.printStackTrace();
		}

		return fizzBuzzValue;
	}
}
