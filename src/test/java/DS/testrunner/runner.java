package DS.testrunner;

//import org.junit.runner.RunWith;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ConfigReader;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/featurefile/arrays.feature"},
		//tags="@Arrays",
		glue ={"DS.stepdefination", "DS.hooks","featurefile"},
		dryRun=false,
		monochrome=true,
		plugin = {"pretty","html:htmlreports/target.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
	)			
public class runner extends AbstractTestNGCucumberTests {
	@BeforeTest
	@Parameters({"browser"})
	public void defineBrowser(@Optional ("chrome")String  browser) throws Exception {
		ConfigReader.setBrowserType(browser);
		System.out.println("browser: " +browser);
	
}
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}