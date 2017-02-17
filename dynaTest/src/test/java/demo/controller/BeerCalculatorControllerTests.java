package demo.controller;

import demo.UiApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = UiApplication.class)
@WebAppConfiguration
@IntegrationTest("server.port:0")
public class BeerCalculatorControllerTests {

	@Value("${local.server.port}")
	private int port;

	@Test
	public void beerFor2() {
		Integer peopleQuantity = 2;
		ResponseEntity<String> response = new TestRestTemplate().getForEntity("http://localhost:" + port + "/beerCalculator/for/"+peopleQuantity, String.class);
		assertEquals(6, Integer.parseInt(response.getBody()));

	}

}
