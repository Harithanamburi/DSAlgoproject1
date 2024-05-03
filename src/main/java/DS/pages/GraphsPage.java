package DS.pages;

import java.io.File;
import java.time.Duration;
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

public class GraphsPage {
	public WebDriver driver = Driverfactory.getDriver();

	public GraphsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	
	}
	private DataStructurePage dataStructurePage = new DataStructurePage(Driverfactory.getDriver());

	private By getStartedButton = By.xpath("//a[@href='graph']");
	private By graph = By.xpath("//a[@class='list-group-item'][normalize-space()='Graph']");
	private By graphSubLinks = By.xpath("//div[@id='content']//li//a");
	private By atryeditor = By.xpath("//a[text()='Try here>>>']");
	private By apythoncode = By.xpath("//div[contains(@class,'CodeMirror')]//textarea");
	private By arun = By.xpath("//button[@type='button']");
	
	public void getStartedButton() {

		driver.findElement(getStartedButton).click();
	}
	public void graph() {

		driver.findElement(graph).click();
	}
	public void graphSubLinks() {

		driver.findElement(graphSubLinks).click();
	}
	public void graphListValiddata() throws InterruptedException {
		List<WebElement> graphlistLinks = driver.findElements(graphSubLinks);
		for (int i = 0; i < graphlistLinks.size(); i++) {
			
			List<WebElement> graphlistLinks1 = driver.findElements(graphSubLinks);
			String originalStyle = graphlistLinks1.get(i).getAttribute("style");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", graphlistLinks1.get(i), "style",
					originalStyle + "border: 2px solid red;");
			
			graphlistLinks1.get(i).click();
			
			driver.findElement(atryeditor).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
			driver.findElement(apythoncode).sendKeys(dataStructurePage.pythoncCodeForPositive(null, null, null, 1, 0));
			driver.findElement(arun).click();
			driver.navigate().back();
		}
	}
	public void graphListInValiddata() throws InterruptedException {
		List<WebElement> graphlistLinks = driver.findElements(graphSubLinks);
		for (int i = 0; i < graphlistLinks.size(); i++) {
			
			List<WebElement> graphlistLinks2 = driver.findElements(graphSubLinks);
			String originalStyle = graphlistLinks2.get(i).getAttribute("style");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", graphlistLinks2.get(i), "style",
					originalStyle + "border: 2px solid red;");
			
			graphlistLinks2.get(i).click();
			
			driver.findElement(atryeditor).click();
			Thread.sleep(2000);
			driver.findElement(apythoncode).sendKeys(dataStructurePage.pythoncCodeFornegative(null, null, null, 2, 0));

			driver.findElement(arun).click();
			driver.switchTo().alert().accept();
			driver.navigate().back();
		}
	}

}
