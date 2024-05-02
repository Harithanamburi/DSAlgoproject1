package DS.stepdefination;

import org.openqa.selenium.WebDriver;

import DS.driverfactory.Driverfactory;
import DS.pages.Arrayspage;
import DS.pages.CommonPage;
import DS.pages.DSHomepage;
import DS.pages.DataStructurePage;
import DS.pages.Treepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CommonStepDefination {

	public WebDriver driver = Driverfactory.getDriver();
	private DataStructurePage dataStructurePage;
	private Arrayspage arrayspage;
	private CommonPage commonpage;
	private Treepage treepage;

	public CommonStepDefination() {
		dataStructurePage = new DataStructurePage(Driverfactory.getDriver());
		arrayspage = new Arrayspage(Driverfactory.getDriver());
		commonpage = new CommonPage(driver);
	}

	@Given("User is on DSAlgoHome Page")
	public void User_is_on_DSAlgoHome_Page() throws InterruptedException {
		driver.get("https://dsportalapp.herokuapp.com/");
		String t = driver.getTitle();
		System.out.println("Page Title :" + t);
		System.out.println("You are at the right place");
		commonpage.homepage();
	}

	@Then("User clicks on Signinlink")
	public void user_clicks_on_signinlink() {
		driver.get("https://dsportalapp.herokuapp.com/home");
		commonpage.dosignin();
	}

	@Then("user should navigate details page of Time Complexity to click on Tryhere editor")
	public void user_should_navigate_details_page_of_time_complexity() throws InterruptedException {
	Thread.sleep(2000);
		dataStructurePage.tryEditor();
	}

	@Then("user should be able to enter {string}")
	public void user_should_be_able_to_enter(String code) {

		dataStructurePage.pythoncCodeForPositive(code, null, code, 0, 0);
	
	}

	@Then("user clicks on run button")
	public void user_clicks_on_run_button() throws InterruptedException {
		dataStructurePage.run();
	}

	@Then("user should be able to enter {string} for negative testing")
	public void user_should_be_able_to_enter_for_negative_testing(String code) throws InterruptedException {

		dataStructurePage.pythoncCodeFornegative(code, null, code, 0, 0);
		

	}
	@Then("user clicks on signout button")
	public void user_clicks_on_signout_button() {
		commonpage.signOut();
	}

}