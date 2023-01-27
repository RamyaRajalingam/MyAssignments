package assignments.jira.issues;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	public static String id;
	public static RequestSpecification inputrequest;
	public static Response response;
	
	@BeforeMethod
	public void setup() {
		RestAssured.baseURI= "https://aadhirai2812.atlassian.net/rest/api/2/issue";
		RestAssured.authentication = RestAssured.preemptive().basic("ramyaajaykumar2010@gmail.com", "SMmCkqAerwRTJ3ytEmHED5F3");
		
		 //inputrequest= RestAssured.given();
		 inputrequest=RestAssured.given().contentType("application/json");
		
	}

}
