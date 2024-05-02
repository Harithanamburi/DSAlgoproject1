package DS.testrunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"C:\\Users\\nambu\\eclipse-workspace\\DSAlgoproject1\\src\\test\\resources\\featurefile"},
		glue ={"DS.stepdefination", "DS.hooks","featurefile"},
		dryRun=false,
		monochrome=true,
		plugin = {"pretty","html:htmlreports/target.html"}
	)			
public class parallel extends AbstractTestNGCucumberTests {
	@DataProvider(parallel = true)
	public Object[][] scenarios() {

		return super.scenarios(); 

}}
