package DS.testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			features={"src/test/resources/featurefile/graph.feature"},
			glue ={"DS.stepdefination", "DS.hooks","featurefile"},
			dryRun=false,
			monochrome=true,
			plugin = {"pretty","html:htmlreports/target.html"}
)			

	public class runnerPractice {	

}
