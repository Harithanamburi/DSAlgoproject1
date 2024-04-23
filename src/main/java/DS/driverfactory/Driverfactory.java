package DS.driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


	public  class Driverfactory {
		
		public static  WebDriver driver;

		public static  ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();

		public WebDriver init_driver(String browser) {

			System.out.println("browser value is: " + browser);
			
			//browser = "chrome";

			if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions cr = new ChromeOptions();
			cr.addArguments("disable-dev-shm-usage");
				WebDriverManager.chromedriver().setup();
				tldriver.set(new ChromeDriver());
			}
			else if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				tldriver.set(new FirefoxDriver());
			} 
			else if (browser.equalsIgnoreCase("edge")) {
				tldriver.set(new EdgeDriver());
			} 
			else {
				System.out.println(" browser value: " + browser);
			}

			getDriver().manage().deleteAllCookies();
			getDriver().manage().window().maximize();
			return getDriver();
			
			//return tldriver;

		}

		public static synchronized WebDriver getDriver() {
			
				return tldriver.get();
			
			
		}
	   public static synchronized void setDriver(WebDriver driver) {
	       
				tldriver.set(driver);
			
	    }

		

	}
	
	

