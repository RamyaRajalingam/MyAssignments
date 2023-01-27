package assignments.jira.issues;

import org.testng.annotations.Test;

public class DeleteIssues extends BaseClass{
	@Test(dependsOnMethods="assignments.jira.issues.CreateIssues.createChaining")
	public void deleteIssues() {
		response=inputrequest.when().delete("/"+id);
		System.out.println("Delete Issues StatusCode " +response.statusCode());
		
	}

}
