package DS.stepdefination;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import DS.driverfactory.Driverfactory;
import DS.pages.CommonPage;
import DS.pages.DataStructurePage;
import DS.pages.registrationpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Datastructure_stepdefination {
	public WebDriver driver = Driverfactory.getDriver();


private  DataStructurePage dataStructurePage;
private CommonPage commonpage;
	public Datastructure_stepdefination() {
		  dataStructurePage = new DataStructurePage(Driverfactory.getDriver());
		  commonpage = new CommonPage(driver);
	}

	@When("user clicks on Get started button under Data structures")
	public void user_clicks_on_get_started_button_under_data_structures() {
		dataStructurePage.dataStructureButton();
	}

	@Then("user should navigate details page to click on Time Complexity link")
	public void user_should_navigate_details_page_of_datastures_page() {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		dataStructurePage.timeComplexityLink();
	}

	@Then("user should navigate details page to click on Time Complexity link in left panel")
	public void user_should_navigate_details_page_of_datastures_page_in_left_panel() {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		dataStructurePage.timeComplexityLinkLeftPanel();
	}
//	@Then("user clicks on signout button")
//	public void user_clicks_on_signout_button() {
//		dataStructurePage.signoutbutton();
//	}

//	@Then("user should navigate details page of Time Complexity to click on Tryhere editor")
//	public void user_should_navigate_details_page_of_time_complexity() throws InterruptedException {
//		Thread.sleep(2000);
//		dataStructurePage.tryEditor();
//	}
//
//	@Then("user should be able to enter {string}")
//	public void user_should_be_able_to_enter(String code) {
//
//		String data = dataStructurePage.pythoncCodeForPositive(code, null, code, 0, 0);
//		dataStructurePage.pythoncode(data);
//		System.out.println("Code Excuted!!");
//	}
//
//	@Then("user should be able to enter {string} for negative testing")
//	public void user_should_be_able_to_enter_for_negative_testing(String code) throws InterruptedException {
//		
//		String data = dataStructurePage.pythoncCodeFornegative(code, null, code, 0, 0);
//		driver.navigate().refresh();
//		dataStructurePage.pythoncode(data);
//		
//	}

//	@Then("user clicks on run button")
//	public void user_clicks_on_run_button() throws InterruptedException {
//		dataStructurePage.run();
//	}
}