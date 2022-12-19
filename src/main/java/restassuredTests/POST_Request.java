package restassuredTests;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.*;

public class POST_Request {
	
//	created hashmap to store body for postrequest
	public static HashMap map=new HashMap();

	@BeforeClass
	public void postdata() {
		map.put("name",Utils.getName());
		map.put("job",Utils.getJob());
		
		RestAssured.baseURI ="https://reqres.in/";
		RestAssured.basePath="api/users";
	}

	@Test
	public void test(){
		given().
		contentType("application/json").body(map)
		.when()
		       .post()
		.then()
		.statusCode(201);
	}
	
}



















