package DS.stepdefination;


import org.openqa.selenium.WebDriver;
import DS.driverfactory.Driverfactory;
import DS.pages.LinkedListpage;
import DS.pages.CommonPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Linkedlist_stepdefination {

	private WebDriver driver = Driverfactory.getDriver();

	private LinkedListpage linkedlist;
	private CommonPage commonpage;

	public Linkedlist_stepdefination() {
		
		linkedlist = new LinkedListpage(Driverfactory.getDriver());
		commonpage = new CommonPage(driver);
	}


	@Then("Click on Linkedlist Get started button")
	public void click_on_linkedlist_get_started_button() {
		linkedlist.getStartedButton();
	}

	@When("User click on Introduction link")
	public void user_click_on_introduction_link() {
		
		linkedlist.introduction();
	}

	@When("User enters valid python code")
	public void user_enters_valid_python_code() throws InterruptedException {
		
		linkedlist.linkedListValiddata();
	}
	
	@When("User enters Invalid python code")
	public void user_enters_Invalid_python_code() throws InterruptedException {
		
		linkedlist.linkedListInValiddata();
	}
	
}
