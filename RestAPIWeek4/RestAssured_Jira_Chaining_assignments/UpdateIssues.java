package assignments.jira.issues;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class UpdateIssues extends BaseClass {
	@Test(dependsOnMethods="assignments.jira.issues.CreateIssues.createChaining")
	public void updateIssues() {
		File inputFile= new File("./src/main/resources/jiraupdateissues.json");
		System.out.println("beforeupdate issue# " +id);
		response=inputrequest.when().body(inputFile).put("/"+id);
		response.prettyPrint();
		response.statusCode();
		
	}
}
