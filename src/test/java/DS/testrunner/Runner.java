package DS.testrunner;

//import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
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
		features={"src/test/resources/featurefile"},
		glue ={"DS.stepdefination", "DS.hooks","featurefile"},
		dryRun=false,
		monochrome=true,
		plugin = {"pretty","html:htmlreports/target.html"}
	)			
public class Runner extends AbstractTestNGCucumberTests {
	@BeforeTest
	@Parameters("browser")
	public void defineBrowser(@Optional ("chrome")String  browser) throws Exception {
		ConfigReader.setBrowserType(browser);
		System.out.println("browser: " +browser);
	
}
	@Override
	@DataProvider(parallel=false)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}