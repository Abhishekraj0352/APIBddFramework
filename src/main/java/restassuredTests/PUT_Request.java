package restassuredTests;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;

public class PUT_Request {

	public static HashMap map =new HashMap();
	int id= 21;
	
	@BeforeClass
	public void postdata() {
		map.put("employee_name",Utils.employee_name());
		map.put("employee_salary",Utils.employee_salary());
		map.put("employee_age",Utils.employee_age());
		
		RestAssured.baseURI ="https://dummy.restapiexample.com/api/v1/";
		RestAssured.basePath="/update/"+id;
	}
	
	@Test
	public void putTest(){
//		given,when,then,put all come from restassured package which is static
		given().contentType("application/json").body(map)	
		.when().put()
		.then().statusCode(200).log().all();
	}
	
}
