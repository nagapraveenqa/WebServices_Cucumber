package restassuredtests;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PUT_Request {

	public static HashMap map=new HashMap();
	
	String empname=RestUtils.empName();
	String empage=RestUtils.empAge();
	String empsal=RestUtils.empSal();
	int empid=21562;
	
	@BeforeMethod
	public void putData(){
		map.put("name", empname);
		map.put("salary", empsal);
		map.put("age", empage);
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/employee/"+empid;
		
	}
	
	@Test
	public void testPut(){
		given()
			.contentType("application/json")
			.body(map)
			
		.when()
			.put()
			
		.then()
			.statusCode(200);
	}
	
}
