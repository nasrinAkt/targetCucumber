package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/targetFeatures"},
plugin = {"json:target/cucumber.json"},
glue = "stepDefinition")//tags = {"@tag"})



public class runnerClass extends AbstractTestNGCucumberTests{

}
