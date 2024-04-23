package DS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import DS.driverfactory.Driverfactory;

public class CommonPage {
	
	public WebDriver driver = Driverfactory.getDriver();
	private DSloginpage signin = new DSloginpage(driver);
	private DSHomepage home = new DSHomepage(driver);
	private DataStructurePage editor= new DataStructurePage(driver);
	private Treepage tree= new Treepage(driver);
	private By signOut=By.xpath("//a[text()='Sign out']");
	//private By loogedOutMsg=By.xpath("//div[@role='alert']");

	public CommonPage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void homepage() {
		System.out.println("DSAlgo Homepage");
		home.welcomeMsg();
		home.GetStartedBtn();
	}
	
	public void dosignin() {
		//System.out.println("DSloginpage with: " + username + " and " + password);
		signin.signInLink();
		signin.userName("Testers");
		signin.passWord("Numpy@123");
		signin.logInButton();
		signin.successMsg();
	}
	public void signOut() {
		driver.findElement(signOut).click();
	}
//	public void loogedOutMsg() {
//		driver.findElement(loogedOutMsg).getText();
//	}
	
	

}
