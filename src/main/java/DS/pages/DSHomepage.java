package DS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import DS.driverfactory.Driverfactory;

public class DSHomepage {

	public WebDriver driver = Driverfactory.getDriver();

	public DSHomepage(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}

	By welcomeMsg = By.xpath("//div[@class='content']/p");
	By GetStartedBtn = By.xpath("//button[@class='btn']");

	public void welcomeMsg() {
		driver.findElement(welcomeMsg).click();
		
	}

	public void GetStartedBtn() {
		driver.findElement(GetStartedBtn).click();
	}

}
