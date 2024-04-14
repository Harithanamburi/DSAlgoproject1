package DS.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {
		   
	public WebDriver driver;
	public login (WebDriver driver)
	{
		this.driver=driver;
		
	}
	private By msg =By.xpath("//div[@class='content']/p");
	private By getstart = By.xpath("//button[@class='btn']");
	private By getstart1 = By.xpath("//a[@class='align-self-end btn btn-lg btn-block btn-primary']");
	private By errormsg = By.xpath("//body/div[2]");
	private By register = By.linkText("Register");
	
	private By registbutton = By.xpath("//input[@type='submit']");
	
	
	
	
	public void  message() {
		WebElement messageElement = driver.findElement(msg);
	    String messageText = messageElement.getText();
	    System.out.println("Message: " + messageText);

	}
	public void  getstarted() {
		driver.findElement(getstart).click();
	}
	
	public void getstartedbutton() {
		driver.findElement(getstart1).click();
	}
	public void notloggedinerroemsg() {
		WebElement errormessage = driver.findElement(errormsg);
		String msg1= errormessage.getText();
		System.out.println("print error msg: "+msg1);
	}
	public void RegisterLink() {
		driver.findElement(register).click();
	}
	
	public void Registerbutton()  {
	 driver.findElement(registbutton).click();;
		
	}
	
	
	
	
}