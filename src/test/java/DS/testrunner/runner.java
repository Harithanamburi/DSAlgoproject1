package DS.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/featurefile"},
		glue ={"DS.stepdefination", "DS.hooks"},
		dryRun=false,
		monochrome=true,
		plugin = {"pretty","html:htmlreports/target.html"}
	)			
public class runner {

}
