package DS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Treepage {
	public WebDriver driver;
	public Treepage (WebDriver driver)
	{
		this.driver=driver;
		
	}
	private By user_name = By.xpath("//*[@id='id_username']");
	private By pass_word = By.xpath("//*[@id='id_password']");
	private By sucessmsg= By.xpath("//div[@class='alert alert-primary']");
	private By getsatartbut = By.xpath("//div[6]/div/div/a");
	private By overviewlink = By.xpath("//a[text()='Overview of Trees'][1]");
	private By trybutton = By.linkText("Try here");
	
	public void loginusername(String loginname) {
		driver.findElement(user_name).sendKeys(loginname);
	}
	
	public void loginpassword(String passwd) {
		driver.findElement(pass_word).sendKeys(passwd);
	} 
	
	 
	public void urloggedinsucessmsg() {
	System.out.println(driver.findElement(sucessmsg).getText());
		
	}
	
	public void treegetstartbutton() {
		
		driver.findElement(getsatartbut).click();
		
	}
	public void overviewoftrees() {
		//WebElement clicklink=driver.findElement(overviewlink);
		//Actions a  = new Actions(driver);
      //a.moveToElement(clicklink).build().perform();
		WebElement link1 = driver.findElement(overviewlink);

		JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true);", link1);
	
		}
	public void clickontryhere() {
		//driver.findElement(trybutton).click();
	}
	
	
	
	
}
