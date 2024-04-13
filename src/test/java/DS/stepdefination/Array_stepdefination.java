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

public class Array_stepdefination {
	private WebDriver driver = Driverfactory.getDriver();
	

	private Arrayspage array;
	private CommonPage commonpage;
	public Array_stepdefination() {
		array	= new Arrayspage(Driverfactory.getDriver());
		commonpage = new CommonPage(driver);
	}
	
	@Then("Click on Array Get started button")
	public void Click_on_Array_Get_started_button() throws InterruptedException  {
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


//	@Then("user should navigate details page to click on Practice Questions")
//	public void user_should_navigate_details_page_to_click_on_practice_questions() {
//		array.practiceQuestionsArray();
//	}
//	@When("user cliks on Search The Array")
//	public void user_cliks_on_search_the_array() {
//		array.searchTheArray();
//	}
}