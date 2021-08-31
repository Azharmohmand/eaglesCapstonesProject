package runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features ="classpath:features", //features tells cucumber options where feature files are located
glue = "stepDefinitions",   //gule tells cucumber options where all step definition classes are located
tags = {"@smokeTest"},
dryRun = false,  //dry run if sets to false checks if all steps in feauture files has steps in feature
monochrome = true, // if set to true, makes the console output readable.
strict = false,  //if set to false will fail if there are pending undefined
format = {"pretty",
       "html:target/cucumber-reports/cucumber-pretty",
       "json:target/cucumber-reports/CucumberTestReport.json",
       "rerun:target/cucumber-reports/rerun.txt"
}
)
public class TestRunner {

}




