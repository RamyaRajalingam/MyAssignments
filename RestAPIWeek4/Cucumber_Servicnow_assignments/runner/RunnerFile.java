package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/main/java/featurefile/incidentmgmt.feature",glue="steps",publish=true)
public class RunnerFile extends AbstractTestNGCucumberTests{

}
