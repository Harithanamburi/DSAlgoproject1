package DS.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DS.driverfactory.Driverfactory;

public class DSloginpage {

	public WebDriver driver = Driverfactory.getDriver();

	public DSloginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private By welcomeMsg = By.xpath("//p[normalize-space()='You are at the right place']");
	private By getStartedButton = By.xpath("//button[@class='btn']");
	private By getStartedButtonDS = By.xpath("//a[@href='data-structures-introduction']");
	private By errorMsgLogIn = By.xpath("//div[@class='alert alert-primary']");
	private By signInLink = By.xpath("//a[@href='/login']");
	private By userName = By.xpath("//input[@id='id_username']");
	private By passWord = By.xpath("//input[@id='id_password']");
	private By logInButton = By.xpath("//input[@value='Login']");
	private By successMsg = By.xpath("//div[@class='alert alert-primary']");

	public void welcomeMsg() {
		driver.findElement(welcomeMsg).click();
	}

	public void getStartedButton() {
		driver.findElement(getStartedButton).click();

	}

	public void getStartedButtonDS() {
		driver.findElement(getStartedButtonDS).click();

	}

	public void errorMsgLogIn() {
		driver.findElement(errorMsgLogIn).click();

	}

	public void signInLink() {

		driver.findElement(signInLink).click();

	}

	public void userName(String Testers) {
		driver.findElement(userName).sendKeys(Testers);

	}

	public void passWord(String password) {
		driver.findElement(passWord).sendKeys(password);

	}

	public void logInButton() {
		driver.findElement(logInButton).click();

	}

	public void successMsg() {
		driver.findElement(successMsg).click();

	}

}