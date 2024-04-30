package DS.stepdefination;

import org.openqa.selenium.WebDriver;
import DS.driverfactory.Driverfactory;
import DS.pages.DataStructurePage;
import DS.pages.Arrayspage;
import DS.pages.CommonPage;
import DS.pages.DSHomepage;
import DS.pages.registrationpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Arrays_stepdefination5 {
	private WebDriver driver = Driverfactory.getDriver();

	private Arrayspage array;
	private CommonPage commonpage;

	public Arrays_stepdefination5() {
		array = new Arrayspage(Driverfactory.getDriver());
		commonpage = new CommonPage(driver);
	}

	@Then("Click on Array Get started button")
	public void Click_on_Array_Get_started_button() throws InterruptedException {
		array.agetstartedarray();
	}

	@Then("user click on Arrays in Python button in Array module")
	public void user_click_on_Arrays_in_Python_button_in_Array_module() {

		array.arraysinPython();
	}

	@Then("user click on left panel links in Array module")
	public void user_click_on_left_panel_links_in_Array_module() throws InterruptedException {

		array.arraySubLinks();

	}

	@Then("user click on left panel links in Array module for Invalid data")
	public void user_click_on_left_panel_links_in_Array_module_for_Invalid_data() throws InterruptedException {
       
		array.arraySubLinksNegative();
	}
	@Then("user clicks on practice questions")
	public void user_clicks_on_practice_questions() throws InterruptedException {
		
		array.practiceQuestions();

	}

	@Then("user should be able to enter the code")
	public void user_should_be_able_to_enter_the_code() throws InterruptedException {
		
		array.practiceQuestionListValidData();
		

	}
	@Then("user should be able to enter the  Inavalid code")
	public void user_should_be_able_to_enter_the_inavalid_code() throws InterruptedException{
		
		array.practiceQuestionListInValidData();

	}
	


}