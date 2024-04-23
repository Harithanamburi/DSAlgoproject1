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
		plugin = {"pretty","html:htmlreports/target.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		
		}
	)			
public class runner {

}
