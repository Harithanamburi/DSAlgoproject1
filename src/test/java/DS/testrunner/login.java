package DS.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
<<<<<<< HEAD:src/test/java/DS/testrunner/runner.java
@CucumberOptions(
		features={"src/test/resources/featurefile"},
		glue ={"DS.stepdefination", "DS.hooks"},
		dryRun=false,
		monochrome=true,
		plugin = {"pretty","html:htmlreports/target.html"}
	)			
public class Runner {
=======
@CucumberOptions
		(features={"src/test/resources/featurefile/array.feature"},
		glue ={"DS.stepdefination", "DS.hooks"},
		dryRun=false,
		monochrome=true,
		plugin={"pretty"})




public class login {
>>>>>>> main:src/test/java/DS/testrunner/login.java

}
