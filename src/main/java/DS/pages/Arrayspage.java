package DS.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import DS.driverfactory.Driverfactory;

public class Arrayspage {
	public WebDriver driver = Driverfactory.getDriver();

	public Arrayspage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private DataStructurePage dataStructurePage = new DataStructurePage(Driverfactory.getDriver());
	private By agetstartedarray = By.xpath("//a[@href='array']");
	private By arraysinPython = By.xpath("//a[@href='arrays-in-python']");
	private By arraySubLinks = By.xpath("//div[@id='content']//li//a");
	private By atryeditor = By.xpath("//a[text()='Try here>>>']");
	private By apythoncode = By.xpath("//div[contains(@class,'CodeMirror')]//textarea");
	private By arun = By.xpath("//button[@type='button']");
	private By practiceQuestionsArray = By.xpath("//a[@class='list-group-item list-group-item-light text-info']");
	private By ssuccess = By.xpath("//input[@value='Submit']");
	private By searchTheArray = By.xpath("//a[normalize-space()='Search the array']");

	public void agetstartedarray() throws InterruptedException {
		// Thread.sleep(1000);
		driver.findElement(agetstartedarray).click();
	}

	public void arraysinPython() {
		driver.findElement(arraysinPython).click();
	}

	public void arraySubLinks() throws InterruptedException {
		List<WebElement> arrayLinks = driver.findElements(arraySubLinks);
		for (int i = 0; i < arrayLinks.size(); i++) {
			System.out.println("ArrayLinks Size:" + arrayLinks.size());
			List<WebElement> arraySubLinks1 = driver.findElements(arraySubLinks);
			String originalStyle = arraySubLinks1.get(i).getAttribute("style");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", arraySubLinks1.get(i), "style",
					originalStyle + "border: 2px solid red;");
			arraySubLinks1.get(i).click();
			driver.findElement(atryeditor).click();
			// Thread.sleep(1000);
			driver.findElement(apythoncode).sendKeys(dataStructurePage.pythoncCodeForPositive(null, null, null, 1, 0));
			driver.findElement(arun).click();

			driver.navigate().back();
		}
	}

	public void arraySubLinksNegative() throws InterruptedException {
		List<WebElement> arrayLinks = driver.findElements(arraySubLinks);
		for (int i = 0; i < arrayLinks.size(); i++) {
			System.out.println("ArrayLinks Size:"+ arrayLinks.size());
			List<WebElement> arraySubLinks2 = driver.findElements(arraySubLinks);
			String originalStyle = arraySubLinks2.get(i).getAttribute("style");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", arraySubLinks2.get(i), "style",originalStyle + "border: 2px solid red;");

			arraySubLinks2.get(i).click();
			driver.findElement(atryeditor).click();
			driver.findElement(apythoncode).sendKeys(dataStructurePage.pythoncCodeFornegative(null, null, null, 2, 0));
			driver.findElement(arun).click();
			driver.switchTo().alert().accept();
			driver.navigate().back();
		}

	}
}
