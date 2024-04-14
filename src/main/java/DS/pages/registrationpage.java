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
<<<<<<< HEAD
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
=======
	
	private By uname = By.xpath("//input[@id='id_username']");
	private By pword = By.xpath("//input[@id='id_password']");
	private By confirmpwd = By.xpath("//input[@id='id_password2']");
	private By reg = By.xpath("//input[@type='submit']");
	private By msg = By.xpath("//div[@class='alert alert-primary']");
	private By sign_in= By.xpath("//a[text()='Sign in']");
	private By log_in = By.xpath("//input[@value='Login']");
	private By user_name = By.xpath("//*[@id='id_username']");
	private By pass_word = By.xpath("//*[@id='id_password']");
	//private By errormsg = By.xpath("//div[contains(text(),'Invalid Username and Password')]");
	
	public void enterusername(String username) {
			 driver.findElement(uname).sendKeys(username);
		 }

		 public void enterpassword(String password) {
			 driver.findElement(pword).sendKeys(password);
			 
		 }

		 public void entercnfirmpwd(String cpwd) {
			 driver.findElement(confirmpwd).sendKeys(cpwd);
		 }
		 public void registerbutton() {
			 driver.findElement(reg).click();
		 }
		 public void newsucessmsg() {
			 driver.findElement(msg).getText();
		 }
		 public void newusername(String newname) {
			 driver.findElement(uname).sendKeys(newname);
		 }
		 public void givenpassword(String passwd) {
			 driver.findElement(pword).sendKeys(passwd);
		 }
		 public void givenconfirmpwd(String confimpwd) {
			 driver.findElement(confirmpwd).sendKeys(confimpwd);
		 }
		 
		 public void plesefilloutthisfield() {
			 WebElement activeElement = Driverfactory.getDriver().switchTo().activeElement();
				String messageStr = activeElement.getAttribute("validationMessage");
				System.out.println("Actual message appeared on screen: " + messageStr);
		 }
		 //login error msg for invalid username and password
		 public void invalidusernameandpassword() {
			 WebElement activeElement = Driverfactory.getDriver().switchTo().activeElement();
				String loginerrormsg = activeElement.getAttribute("class");
				System.out.println("message appeared on screen: " + loginerrormsg);
		 }
		 
		 
		 public void enterssignlink() {
			  driver.findElement(sign_in).click();
			 
		 }
		 
		 public void clickloginbutton() {
			 driver.findElement(log_in).click();
		 }
		 public void loginusername(String username1) {
			 driver.findElement(user_name).sendKeys(username1);
		 }
		 public void loginpassword(String passwrd1) {
			 driver.findElement(pass_word).sendKeys(passwrd1);
		 }
//         //valid user credentials
//		 
		 public void validUserName(String username){		 
	 
		driver.findElement(uname).sendKeys(username);
	}
	
	public void validPassword(String password) {
		
	driver.findElement(pword).sendKeys(password);
		
	}
	
	public void dologin(String un, String pwd){
		System.out.println("login with: " + un + " and " + pwd);
		driver.findElement(uname).sendKeys(un);
		driver.findElement(pword).sendKeys(pwd);
		driver.findElement(log_in).click();
		
	}
	private By agetstartedarray = By.xpath("//a[@href='array']");
	//Bhavana code
	public void dosignin(String un, String pwd) {
		
		System.out.println("login with: " + un + " and " + pwd);
		driver.findElement(uname).sendKeys(un);
		driver.findElement(pword).sendKeys(pwd);
		driver.findElement(log_in).click();
		driver.findElement(agetstartedarray).click();
}
	
	
	
	}
	
	

>>>>>>> main
