package DS.pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.mongodb.assertions.Assertions;

public class Stackpage {
	
	
		public WebDriver driver;
		public Stackpage(WebDriver driver)
		{
			this.driver=driver;
			
		}
		
		private By getStrtStack = By.xpath("//div[4]/div/div/a");
		private By opInstack = By.xpath("//ul/a[contains(@href,'operations-in-stack')]");
		private By tryHere = By.xpath("//div[2]/div/div[2]/a");
		private By pythonCd =  By.xpath("//form[@id='answer_form']/div/div/div/textarea");
		//private By errPythonCd = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
		private By runbutton = By.xpath("//form[@id=\"answer_form\"]/button");
		private By outputPyCd = By.xpath("//pre[@id=\"output\"]");
		private By implebutton = By.xpath("//ul/a[contains(@href,'implementation')]");
		private By Appbutton = By.xpath("//ul/a[contains(@href,'stack-applications')]");
		

		
		private By impleButton = By.xpath("//a[contains(@href=\"implementation\")]");
		

	
		
		public void ScrollDown() {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,300);");
		}
		
	
		
		public void getStartedStack() throws InterruptedException {
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.findElement(getStrtStack).click();
							}

		
		public void tryHereButton() {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");		
			driver.findElement(tryHere).click();
			
		}
		
		public void operationInstack()  {
			
			driver.findElement(opInstack).click();
			
		}
		
		public void pythonCode() throws InterruptedException {
			
									    
			driver.findElement(pythonCd).sendKeys("print \"hello\"");
		}
		
		public void outputPyCode() {
			System.out.println(driver.findElement(outputPyCd).getText());
			
		}
		
		public void gobackbrw() {
			driver.navigate().back();
		}
		
		public void invalidCode() throws InterruptedException {
			
					
		     
				
			driver.findElement(pythonCd).sendKeys("error");
			
		}
		
		public void implementaionTab() {
			
			driver.findElement(impleButton).click();
		}

		public void runButton() {
			
			driver.findElement(runbutton).click();
		}
		
		public static boolean isDialogPresent(WebDriver driver) {
	        try {
	            driver.getTitle();
	            return false;
	        } catch (UnhandledAlertException e) {
	           
	            return true;
	        }
	    }

	    //this is method to accept browser alert.
//	    public static void acceptBrowserAlert(WebDriver driver) {
//	        Alert alert = driver.switchTo().alert();
//	        alert.accept();
//	        
//	        	        
//	        System.out.println("Got the error");
//	    }
//		
        public void implementation() {
			
			driver.findElement(implebutton).click();
		}
		
		public void alert() {
			
			String alertText = driver.switchTo().alert().getText();
			System.out.println(alertText);
			driver.switchTo().alert().accept();
		}
        
  public void Application() {
			
			driver.findElement(Appbutton).click();
		}
        
        
}
