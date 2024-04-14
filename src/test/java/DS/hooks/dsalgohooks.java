package DS.hooks;

	
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import DS.driverfactory.Driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.Configreader;

public class dsalgohooks {

	
	private Driverfactory driverFactory;
	private WebDriver driver;
	private Configreader configReader;
	Properties prop;
	@Before(order = 0)
	public void getProperty() {
		configReader = new Configreader();
		prop = configReader.init_prop();
	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
<<<<<<< HEAD
=======
		//String Url=prop.getProperty("url");
		//driver.navigate().to(Url);
>>>>>>> main
		driverFactory = new Driverfactory();
		driver = driverFactory.init_driver(browserName);
		System.out.println(driver);
	}

	@After(order = 0)
	public void quitBrowser() {
		//driver.quit();
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			// take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_");
	        byte[] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	        scenario.attach(sourcePath, "image/png", screenshotName);

			
		}
	}

}
