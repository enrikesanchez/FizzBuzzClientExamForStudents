package mx.tec.exam.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FizzBuzzHtmlUnitTest {
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}	
	
	@Test
	public void shouldReturnFizzWhen3() throws Exception {
		fail("Not yet implemented");
		
		/*
		ObjectMapper mapper = new ObjectMapper();
		JsonNode root = mapper.readTree(response.getContentAsString());
		result = root.path("xxx").asText();
		*/
	}

	@Test
	public void shouldReturnBuzzWhen5() throws Exception {
		fail("Not yet implemented");
	}

	@Test
	public void shouldReturnFizzBuzzWhen15() throws Exception {
		fail("Not yet implemented");
	}

	@Test
	public void shouldReturn1When1() throws Exception {
		fail("Not yet implemented");
	}
}
