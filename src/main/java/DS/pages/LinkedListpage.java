package DS.pages;

import java.io.File;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import DS.driverfactory.Driverfactory;

public class LinkedListpage {
	public WebDriver driver = Driverfactory.getDriver();

	public LinkedListpage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	private DataStructurePage dataStructurePage = new DataStructurePage(Driverfactory.getDriver());

	private By getStartedButton = By.xpath("//a[@href='linked-list']");
	private By introduction = By.xpath("//a[@href='introduction']");
	private By leftPanelSublinks = By.xpath("//div[@id='content']//li//a");
	private By atryeditor = By.xpath("//a[text()='Try here>>>']");
	private By apythoncode = By.xpath("//div[contains(@class,'CodeMirror')]//textarea");
	private By arun = By.xpath("//button[@type='button']");

	public void getStartedButton() {

		driver.findElement(getStartedButton).click();
	}

	public void introduction() {

		driver.findElement(introduction).click();
	}

	public void leftPanelSublinks() {

		driver.findElement(leftPanelSublinks).click();
	}

	public void linkedListValiddata() throws InterruptedException {
		List<WebElement> linkedlistLinks = driver.findElements(leftPanelSublinks);
		for (int i = 0; i < linkedlistLinks.size(); i++) {
			List<WebElement> linkedlistLinks1 = driver.findElements(leftPanelSublinks);
			String originalStyle = linkedlistLinks1.get(i).getAttribute("style");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", linkedlistLinks1.get(i), "style",
					originalStyle + "border: 2px solid red;");

			linkedlistLinks1.get(i).click();

			driver.findElement(atryeditor).click();
			Thread.sleep(1000);
				driver.findElement(apythoncode)
						.sendKeys(dataStructurePage.pythoncCodeForPositive(null, null, null, 1, 0));
			

				driver.findElement(arun).click();
			   driver.navigate().back();
		}
	}

	public void linkedListInValiddata() throws InterruptedException {
		List<WebElement> linkedlistLinks = driver.findElements(leftPanelSublinks);

		for (int i = 0; i < linkedlistLinks.size(); i++) {

			List<WebElement> linkedlistLinks2 = driver.findElements(leftPanelSublinks);
			String originalStyle = linkedlistLinks2.get(i).getAttribute("style");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", linkedlistLinks2.get(i), "style",
					originalStyle + "border: 2px solid red;");

			linkedlistLinks2.get(i).click();

			driver.findElement(atryeditor).click();
			Thread.sleep(1000);
			driver.findElement(apythoncode).sendKeys(dataStructurePage.pythoncCodeFornegative(null, null, null, 2, 0));

			driver.findElement(arun).click();
			driver.switchTo().alert().accept();
			driver.navigate().back();
		}
	}

}
