package DS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class queuePage {
	
	public WebDriver driver;
	public queuePage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	private By queueGetStr = By.xpath("//a[@href='queue']");
	private By implQueue = By.xpath("//a[contains(text(),'Implementation of Queue in Python')]");
	private By collecDequeue = By.xpath("//a[contains(text(),'Implementation using collections.deque')]");
	private By impleUsingArray = By.xpath("//a[contains(text(),'Implementation using array')]");
	private By queueOperation = By.xpath("//a[contains(text(),'Queue Operations')]");
	
	
	
	public void ScrollDown() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300);");
	}

	public void queuegetStarted() {
		
		driver.findElement(queueGetStr).click();
	}

	public void pageScrolltoBottom() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	public void implementationQueue() {
		
		driver.findElement(implQueue).click();
	}
	
	public void collectionDequeue() {
	driver.findElement(collecDequeue).click();
	}
	
	public void implemenUsingArray() {
	driver.findElement(impleUsingArray).click();
	}
	
	public void queueOperations() {
		driver.findElement(queueOperation).click();
		}
	
}
