package restassuredTests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DELETE_Request {
	
	int id = 719;
	
	@BeforeTest
	public void deleteEmployeeRecord(){
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/delete/719";
	}
	
	@Test
	public void deleteOperationTest(){
//		storing response in variable in response
		Response response =
		given()
		.when().delete()
		.then().statusCode(200).log().all().extract().response();
		
		
//		converting json to string 
		String jsonAsString = response.asString();
//		Comparing
		Assert.assertEquals(jsonAsString.contains("Successfully! Record has been deleted"), true);
		
	}
	
	

}
