package assignments.jira.issues;

import java.io.File;

import org.testng.annotations.Test;

public class CreateIssues extends BaseClass {
	@Test
	public void createChaining() {
		File inputFile=new File("./src/main/resources/jiracreateissues.json");
		
	 response=inputrequest.when().body(inputFile).post();
	 System.out.println(response.getStatusCode());
	 response.prettyPrint();
	 id=response.jsonPath().get("id");
	 System.out.println("Issue# " +id);
		
	}
	

}
