package DS.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(features="src/test/resources/featurefile",
		glue ="DS.stepdefination",
		dryRun=false,
		monochrome=true,
		plugin={"pretty"})




public class runner {

}
