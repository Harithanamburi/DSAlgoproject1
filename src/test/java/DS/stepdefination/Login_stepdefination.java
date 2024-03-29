package DS.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import DS.driverfactory.Driverfactory;
import DS.pages.login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_stepdefination {
	WebDriver driver;
	  private login loginpage= new login(Driverfactory.getDriver());

	@Given("open the browser")
	public void open_the_browser() {
		//Driverfactory.getDriver();
		Driverfactory.getDriver().get("https://dsportalapp.herokuapp.com/");
		  }
	
	@Given("the message is {string}")
	public void the_message_is(String string) {
	    loginpage.message();
	}
	@When("user navigates to get started")
	public void user_navigates_to_get_started() {
	   loginpage.getstarted();
	}
	@Then("user navigates to data structure dropdown")
	public void user_navigates_to_data_structure_dropdown() {
	    
	}
	@Then("it should see {int} different entries")
	public void it_should_see_different_entries(Integer int1) {
	    
	}
	@When("user navigates to Data structures introduction")
	public void user_navigates_to_data_structures_introduction() {
	}
	@When("click the get started link")
	public void click_the_get_started_link() {
	    loginpage.getstartedbutton();
 
	}
	@Then("user gets alert message {string}")
	public void user_gets_alert_message(String string) {
	    loginpage.notloggedinerroemsg();
	}
	
	@When("user clicks registration link")
	public void user_clicks_registration_link() {
	   loginpage.RegisterLink();
	}
	
	
	@Then("user should redirectred to registration form")
	public void user_should_redirectred_to_registration_form() {
		String expectedTitle = "Registration";
        String actualTitle = Driverfactory.getDriver().getTitle();
        Assert.assertEquals("Page title doesn't match expected", expectedTitle, actualTitle);
   System.out.println(expectedTitle);
	}
	
	@Given("user clicks register button with all empty fields")
	public void user_clicks_register_button_with_all_empty_fields() {
	loginpage.Registerbutton();
	}
	
	

	
	
}
	
	

