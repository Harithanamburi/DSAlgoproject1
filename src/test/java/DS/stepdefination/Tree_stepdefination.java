package DS.stepdefination;

import org.openqa.selenium.WebDriver;

import DS.driverfactory.Driverfactory;
import DS.pages.Treepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tree_stepdefination {
	WebDriver driver;
	private Treepage tree = new Treepage(Driverfactory.getDriver());

	@Given("open login page")
	public void open_login_page() {
		
		Driverfactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		}
	
	@When("user enter valid {string}, {string}")
	public void user_enter_valid(String username, String passwrd) {
	    tree.loginusername(username);
	    tree.loginpassword(passwrd);
		
	}

	@Then("user shows sucess message")
	public void user_shows_sucess_message() {
	   tree.urloggedinsucessmsg();
	}

	@Then("user click on Get Started button  in Tree module")
	public void user_click_on_get_started_button_in_tree_module() throws InterruptedException  {
		tree.treegetstartbutton();
		
	}
	
	@Given("user click on overview of trees link")
	public void user_click_on_overview_of_trees_link() throws InterruptedException   {
		tree.overviewoftrees();
	}

	/*@When("user click on Try here button")
	public void user_click_on_try_here_button() {
	   tree.clickontryhere();
	}

	@When("user should be directed to the url {string}")
	public void user_should_be_directed_to_the_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user  writes valid python code with in editor box {string}")
	public void user_writes_valid_python_code_with_in_editor_box(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user clicks run button")
	public void user_clicks_run_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should able to see the output")
	public void user_should_able_to_see_the_output() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/



	
}
