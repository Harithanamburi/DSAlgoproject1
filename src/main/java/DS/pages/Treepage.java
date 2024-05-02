package DS.pages;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.LogManager;
import org.apache.commons.math3.analysis.function.Constant;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import DS.driverfactory.Driverfactory;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Treepage {

	public WebDriver driver = Driverfactory.getDriver();

	public Treepage(WebDriver driver) {
		// this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private DataStructurePage dataStructurePage = new DataStructurePage(Driverfactory.getDriver());

	private By getsatartbutton = By.xpath("//a[@href='tree']");
	private By overviewLink = By.xpath("//a[@href='overview-of-trees']");
	private By treelinks = By.xpath("//div[@id='content']//li//a");
	private By output = By.xpath("//pre[@id='output']");
	private By atryeditor = By.xpath("//a[text()='Try here>>>']");
	private By editor = By.xpath("//div[contains(@class,'CodeMirror')]//textarea");
	private By runbutton = By.xpath("//button[@type='button' and contains(@onclick, 'runit')]");
	private By apythoncode = By.xpath("//div[contains(@class,'CodeMirror')]//textarea");

	public void overviewButtonClick() {
		driver.findElement(overviewLink).click();
	}

	public void consoleoutput() {
		System.out.println(driver.findElement(output).getText());
	}

	public void getsatartbutton() throws InterruptedException {
		Thread.sleep(500);
		driver.findElement(getsatartbutton).click();
	}

	public void treelinks() {
		driver.findElement(treelinks).click();
	}

	public void treehomelinksValid() throws InterruptedException {

		List<WebElement> treeLinks = driver.findElements(treelinks);
		for (int i = 0; i < treeLinks.size(); i++) {
			System.out.println("Treelinks Size:" + treeLinks.size());

			List<WebElement> treeLinks1 = driver.findElements(treelinks);
			String originalStyle = treeLinks1.get(i).getAttribute("style");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", treeLinks1.get(i), "style",
					originalStyle + "border: 2px solid red;");

			treeLinks1.get(i).click();
			driver.findElement(atryeditor).click();
			try {
				driver.findElement(apythoncode)
						.sendKeys(dataStructurePage.pythoncCodeForPositive(null, null, null, 1, 0));
			} catch (Exception e) {
				System.out.println("exception:" + e);

			}
			driver.navigate().back();
		}
	}

	public void treehomelinksinvalid() throws InterruptedException {
		List<WebElement> treeLinks = driver.findElements(treelinks);

		for (int i = 0; i < treeLinks.size(); i++) {
			System.out.println("Treelinks Size:" + treeLinks.size());

			treeLinks.get(i).click();
			driver.findElement(atryeditor).click();
			
			driver.findElement(apythoncode).sendKeys(dataStructurePage.pythoncCodeFornegative(null, null, null, 2, 0));
			Thread.sleep(100);
			driver.switchTo().alert().accept();
	
		driver.navigate().back();
	}
	}
}
