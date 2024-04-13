package DS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import DS.driverfactory.Driverfactory;

public class registrationpage {
	public WebDriver driver;
	
	public registrationpage (WebDriver driver)
	{
		this.driver=driver;
	}	
	private By registerLink = By.xpath("//a[@href='/register']");
	private By userName = By.xpath("//input[@id='id_username']");
	private By passWord = By.xpath("//input[@id='id_password1']");

	private By confirmPassword = By.xpath("//input[@id='id_password2']");
	private By registerButton=By.xpath("//input[@type='submit']");
	private By successMessage = By.xpath("//div[@class='alert alert-primary']");
	//private By mismatchMessage=By.xpath("//div[contains( text(),'password_mismatch:The two password fields didn’t match.')]");


	public void registerLink() {
		 driver.findElement(registerLink).click();
	 }
	
	public void enterusername(String username) {
			 driver.findElement(userName).sendKeys(username);
		 }

		 public void enterpassword(String password) {
			 driver.findElement(passWord).sendKeys(password);
		 }

		 public void entercnfirmpwd(String cpwd) {
			 driver.findElement(confirmPassword).sendKeys(cpwd);
		 }
		 public void registerButton() {
			 driver.findElement(registerButton).click();
		 }
		 
		 public void successMessage() {
			 driver.findElement(successMessage).getText();
		 }

		public void plesefilloutthisfield() {
			WebElement activeElement = Driverfactory.getDriver().switchTo().activeElement();
			String messageStr = activeElement.getAttribute("validationMessage");
			System.out.println("Actual message appeared on screen: " + messageStr);
			
		}
//		public void mismatchMessage(String uname, String pwd, String cpwd) {
//			 driver.findElement(mismatchMessage).sendKeys(uname,pwd,cpwd);
//		 }
		
		
		 
}
