package DS.pages;

import java.util.List;

import java.io.File;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import org.openqa.selenium.NoSuchElementException;
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
	private By practiceQuestions = By.xpath("//a[@href='/array/practice']");
//public List<WebElement> practiceQuestions1 = driver.findElements(By.xpath("//div[@class='list-group']"));
	public void agetstartedarray() {

		driver.findElement(agetstartedarray).click();
	}

	public void arraysinPython() {

		driver.findElement(arraysinPython).click();
	}

	public void arraySubLinks() throws InterruptedException {

		List<WebElement> arrayLinks = driver.findElements(arraySubLinks);
		for (int i = 0; i < arrayLinks.size(); i++) {

			List<WebElement> arraySubLinks1 = driver.findElements(arraySubLinks);
			String originalStyle = arraySubLinks1.get(i).getAttribute("style");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", arraySubLinks1.get(i), "style",
					originalStyle + "border: 2px solid red;");

			arraySubLinks1.get(i).click();

			driver.findElement(atryeditor).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.findElement(apythoncode).sendKeys(dataStructurePage.pythoncCodeForPositive(null, null, null, 1, 0));
			driver.navigate().back();
		}

	}

	public void arraySubLinksNegative() throws InterruptedException {
		List<WebElement> arrayLinks = driver.findElements(arraySubLinks);
		for (int i = 0; i < arrayLinks.size(); i++) {

			List<WebElement> arraySubLinks2 = driver.findElements(arraySubLinks);
			String originalStyle = arraySubLinks2.get(i).getAttribute("style");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", arraySubLinks2.get(i), "style",
					originalStyle + "border: 2px solid red;");

			arraySubLinks2.get(i).click();

			driver.findElement(atryeditor).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.findElement(apythoncode).sendKeys(dataStructurePage.pythoncCodeFornegative(null, null, null, 2, 0));
			driver.navigate().back();
		}

	}

	public void practiceQuestions() {
		driver.findElement(practiceQuestions).click();

	}
	public void practiceQuestionListValidData() throws InterruptedException {
		List<WebElement> practiceQuestions1 = driver.findElements(By.xpath("//div[@class='list-group']"));
		for (int l =0; l < practiceQuestions1.size(); l++) {
			Thread.sleep(500);
			practiceQuestions1.get(l).click();

			{
				String cellData = " ";
				try {
					Workbook workbook = new XSSFWorkbook(new File(
							"/Users/muvva/Desktop/new/DSAlgoproject1/src/main/java/utilities/ExcelReader.xlsx"));
					Sheet sheet = workbook.getSheet("pythonCode");

					Row row = sheet.getRow(3+l);

					Cell cell = row.getCell(0);

					if (cell != null) {
						cellData = cell.getStringCellValue();
						System.out.println("cellData:" +cellData);

					}
					workbook.close();

				} catch (Exception e) {
					System.out.println("exception:" + e);

				}

				WebElement arraylinkcodeForText = driver.findElement(By.xpath("//div[@class='CodeMirror-code']/div"));
				WebElement apythoncode = driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea"));
			while (!arraylinkcodeForText.getText().equals("1")) {
					Actions action = new Actions(driver); 
					action.moveToElement(apythoncode); 
					
					apythoncode.sendKeys(Keys.DELETE);
					//System.out.println("pythonecode");
					Thread.sleep(1);
				}
			
				String[] str1 = cellData.split("\n");
				for (int i = 0; i < str1.length; i++) {
					if (str1[i].equalsIgnoreCase("\\b")) {
						new Actions(driver).sendKeys(Keys.BACK_SPACE).perform();
					} else {
						apythoncode.sendKeys(str1[i].trim());
						new Actions(driver).sendKeys(Keys.RETURN).perform();
					}
				}
			}
			driver.findElement(arun).click();
			driver.navigate().back();

		}
	}

	public void practiceQuestionListInValidData() throws InterruptedException {
		List<WebElement> practiceQuestions1 = driver.findElements(By.xpath("//div[@class='list-group']"));
		for (int m = 0; m < practiceQuestions1.size(); m++) {
//			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver);
//			wait.wait(1000);
			//wait.until(ExpectedConditions.elementToBeClickable(practiceQuestions1));
			practiceQuestions1.get(m).click();

			{
				String cellData = " ";
				try {
					Workbook workbook = new XSSFWorkbook(new File(
							"/Users/muvva/Desktop/new/DSAlgoproject1/src/main/java/utilities/ExcelReader.xlsx"));
					Sheet sheet = workbook.getSheet("pythonCode");

					Row row = sheet.getRow(7 + m);

					Cell cell = row.getCell(0);

					if (cell != null) {
						cellData = cell.getStringCellValue();

					}
					workbook.close();

				} catch (Exception e) {
					System.out.println("exception:" + e);

				}

				WebElement arraylinkcodeForText = driver.findElement(By.xpath("//div[@class='CodeMirror-code']/div"));
				WebElement apythoncode = driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea"));

			while (!arraylinkcodeForText.getText().equals("1")) {
					Actions action = new Actions(driver); 
					action.moveToElement(apythoncode); 
					apythoncode.sendKeys(Keys.DELETE);
				}
				String[] str1 = cellData.split("\n");
				for (int i = 0; i < str1.length; i++) {
					if (str1[i].equalsIgnoreCase("\\b")) {
						new Actions(driver).sendKeys(Keys.BACK_SPACE).perform();
					} else {
						apythoncode.sendKeys(str1[i].trim());
						new Actions(driver).sendKeys(Keys.RETURN).perform();
					}
				}
			}
			driver.findElement(arun).click();
			driver.switchTo().alert().accept();
			driver.navigate().back();

		}
	}
		
	}
	
	
		

	
	

		
	
	


