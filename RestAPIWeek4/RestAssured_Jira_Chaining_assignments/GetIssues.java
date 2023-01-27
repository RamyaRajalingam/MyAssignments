package assignments.jira.issues;

import org.testng.annotations.Test;

public class GetIssues extends BaseClass {
	@Test(dependsOnMethods="assignments.jira.issues.CreateIssues.createChaining")
	public void getChaining() {
		response=inputrequest.when().get("/"+id);
		response.prettyPrint();
		
		
	}

}
