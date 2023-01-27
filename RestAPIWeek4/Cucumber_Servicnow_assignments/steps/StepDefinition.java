package steps;

import java.io.File;

import org.hamcrest.Matchers;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepDefinition {
	
	public static RequestSpecification inputRequest;
	public static Response response;
	public static String sys_id;
	@Given("Setup BaseURI")
	public void enterUri() {
		RestAssured.baseURI="https://dev46755.service-now.com/api/now/table/incident";
	}
	@And("Validate Credential")
	public void auth() {
		RestAssured.authentication=RestAssured.basic("admin", "Zj3k^2Kk%yRB");
	}
	
	@When("Create Incident with requestbody {string}")
	public void postWithrequestbody(String body) {
		
		inputRequest = RestAssured.given().contentType("application/json");
		response = inputRequest.when().body(body).post();
	}
	@When("Create Incident with file{string}")
	public void postWithinputFile(String filename) {
		File inputFile=new File("./src/main/resources/"+filename);
		inputRequest = RestAssured.given().contentType("application/json");
		response = inputRequest.when().body(inputFile).post();
		sys_id=response.jsonPath().get("result.sys_id");
	}
	@Then ("StatusCode is {int}")
	public void statuscodecheck(int statuscode) {
			response=response.then().assertThat().statusCode(statuscode).extract().response();
	}
	@When("Update Incident with file{string}")
	public void putWithbody(String filename) {
		File inputFile=new File("./src/main/resources/"+filename);
		inputRequest = RestAssured.given().contentType("application/json");
		response = inputRequest.when().body(inputFile).put("/"+sys_id);
		response= response.then().assertThat().body("result.description", Matchers.containsString("filebody")).extract().response();
		String afterupdate=response.jsonPath().get("result.description");
		System.out.println(afterupdate);
	}
	
	@When("Update Incident With requestbody {string}")
	public void putWithFileBody(String body) {
		inputRequest = RestAssured.given().contentType("application/json");
		response = inputRequest.when().body(body).put("/"+sys_id);
		response= response.then().assertThat().body("result.short_description", Matchers.containsString("cucumber")).extract().response();
		String afterupdate=response.jsonPath().get("result.short_description");
		System.out.println(afterupdate);
	}
	@When("Get the incident by sysid")
	public void getIncidentDetails() {
		response=inputRequest.when().get("/"+sys_id);
		System.out.println("GetIncident StatusCode " +response.statusCode());
		
	}
	@When("Delete an Incident")
	public void deleteIncident() {
		response=inputRequest.when().delete("/"+sys_id);
	}
	}


