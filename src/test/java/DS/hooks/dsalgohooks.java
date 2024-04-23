package DS.hooks;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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
import utilities.ConfigReader;

public class dsalgohooks {

	private Driverfactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	
	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}

	
	@Before(order = 1)
	public void launchBrowser() {
		String browserName = ConfigReader.getBrowser();
		driverFactory = new Driverfactory();
		driver = driverFactory.init_driver(browserName);

	}

	
	@After(order = 0)
	public void quitBrowser() {
		// Driverfactory.getDriver().quit();
		if (driver != null) {
			driver.quit();
		} else {
			System.out.println("WebDriver object is null. Cannot quit browser.");
		}
	}

	
	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			// take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			if (driver != null) {
				byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(sourcePath, "image/png", screenshotName);

			}

		}
	}

}
