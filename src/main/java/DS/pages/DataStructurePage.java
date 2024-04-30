package DS.pages;

import java.io.File;
import java.time.Duration;

import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DS.driverfactory.Driverfactory;

public class DataStructurePage {

	public WebDriver driver = Driverfactory.getDriver();

	public DataStructurePage(WebDriver webDriver) {
		PageFactory.initElements(driver, this);
	}

	public void DataStructurePage1() {
		driver.get("https://dsportalapp.herokuapp.com/home");
	}

//Locators//
	By dataStructureButton = By.xpath("//a[@href='data-structures-introduction']");
	By timeComplexityLink = By.xpath("//a[@href='time-complexity']");
	By timeComplexityLinkLeftPanel = By.xpath("//a[@href='/data-structures-introduction/time-complexity/']");
	By tryEditor = By.xpath("//a[@href='/tryEditor']");
	By pythoncode = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By run = By.xpath("//button[@type='button']");
	By signOut = By.xpath("//a[text()='Sign out']");

//Element Actions//
	public void dataStructureButton() {
		driver.findElement(dataStructureButton).click();
	}

	public void timeComplexityLink() {
		driver.findElement(timeComplexityLink).click();
	}

	public void timeComplexityLinkLeftPanel() {
		driver.findElement(timeComplexityLinkLeftPanel).click();
	}

	public void tryEditor() {

		driver.findElement(tryEditor).click();
	}

	public void pythoncode(String cellData) {

		driver.findElement(pythoncode).sendKeys(cellData);
	}


	public String pythoncCodeForPositive(String filePath, WebElement pythoncode, String ExcelReader,
			int rowNum, int colNum) {

		String cellData = " ";
		try {
			Workbook workbook = new XSSFWorkbook(

					new File("/Users/muvva/Desktop/new/DSAlgoproject1/src/main/java/utilities/ExcelReader.xlsx"));

			Sheet sheet = workbook.getSheet("pythonCode");
			Row row = sheet.getRow(1);
			Cell cell = row.getCell(0);

			if (cell != null) {
				cellData = cell.getStringCellValue();
				System.out.println("cellData :" + cellData);
			}

			//workbook.close();

		} catch (Exception e) {

		}
		return cellData;
	}

	public String pythoncCodeFornegative(String filePath, WebElement pythoncode, String ExcelReader,
			int rowNum, int colNum) throws InterruptedException {

		String cellData = " ";
		try {

			Workbook workbook = new XSSFWorkbook(
					new File("/Users/muvva/Desktop/new/DSAlgoproject1/src/main/java/utilities/ExcelReader.xlsx"));

			Sheet sheet = workbook.getSheet("pythonCode");
			Row row = sheet.getRow(2);
			Cell cell = row.getCell(0);

			if (cell != null) {
				cellData = cell.getStringCellValue();
				System.out.println("cellData :" + cellData);
			}
			//workbook.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return cellData;

	}

	public void run() throws InterruptedException {

		driver.findElement(run).click();
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			if (wait.until(ExpectedConditions.alertIsPresent()) == null)
				System.out.println("alert was not present");
			else
				System.out.println("alert was present");
			driver.switchTo().alert().accept();
			

		} catch (Exception e) {

		}

	}

}
