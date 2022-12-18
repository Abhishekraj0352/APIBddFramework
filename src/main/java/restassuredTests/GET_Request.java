package restassuredTests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GET_Request {

	@Test
	public void getRequest() {
		given().
		when().get("https://httpbin.org/get")
		.then()
		.statusCode(200)
		.assertThat().body("url",equalTo("https://httpbin.org/get"))
		.header("Content-Type","application/json");
		
	}
	
}

//1.issue
//to import
//import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*; 
//make sure you have provided scope for src folder

//2. issue
//https://github.com/rest-assured/rest-assured/issues/1168
//due to above issue please make sure that all depedncies are upgraded to 5.3 atleast

