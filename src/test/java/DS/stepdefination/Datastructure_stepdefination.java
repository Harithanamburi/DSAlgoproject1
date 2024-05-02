package DS.stepdefination;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import DS.driverfactory.Driverfactory;
import DS.pages.CommonPage;
import DS.pages.DataStructurePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Datastructure_stepdefination {
	public WebDriver driver = Driverfactory.getDriver();

	private DataStructurePage dataStructurePage;
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

	@When("user enters {string} in editor")
	public void enters_text_in_editor(String text) {
		String code = dataStructurePage.pythoncCodeForPositive(null, null, null, 1, 0);
		dataStructurePage.pythoncode(code);

	}

	@When("user enters invalid {string} in editor")
	public void enters_invalid_text_in_editor(String text) throws InterruptedException {
		String code = dataStructurePage.pythoncCodeFornegative(null, null, null, 2, 0);
		
		dataStructurePage.pythoncode(code);

	}

}