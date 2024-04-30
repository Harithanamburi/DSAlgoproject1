package DS.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import DS.driverfactory.Driverfactory;
import DS.pages.Arrayspage;
import DS.pages.DSloginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_stepdefination2 {
	private WebDriver driver = Driverfactory.getDriver();

	private DSloginpage dsloginpage = new DSloginpage(driver);

	@Given("User is on the browser")
	public void User_is_on_the_browser() {
		driver.get("https://dsportalapp.herokuapp.com");
	}

	@Then("User able to see welcome message {string}")
	public void User_able_to_see_welcome_message(String string) {
		dsloginpage.welcomeMsg();
		System.out.println("You are at the right place");
	}

	@When("User clicks on Get Started button")
	public void User_clicks_on_get_started_button() {
		dsloginpage.getStartedButton();
	}

	@Then("User navigates to home page to clicks on Get Started button under Data Structures-Introduction")
	public void User_navigates_to_home_page_to_clicks_on_Get_Started_button_under_Data_Structures_Introduction() {
		dsloginpage.getStartedButtonDS();
	}

	@Then("User will get error message {string}")
	public void User_will_get_error_message(String string) {
		dsloginpage.errorMsgLogIn();
		System.out.println("You are not logged in");
	}

	@Given("User clicks on Sign link")
	public void User_clicks_on_sign_link() {

		dsloginpage.signInLink();
	}

	@When("User enters Username {string}")
	public void User_enters_username(String username) {
		dsloginpage.userName(username);
	}

	@When("User enters Password {string}")
	public void User_enters_password(String password) {
		dsloginpage.passWord(password);
	}



	@Then("User clicks on Login button")
	public void user_clicks_on_login_button() {
		dsloginpage.logInButton();
	}

	@Then("User will get Success message {string}")
	public void user_will_get_success_message(String string) {
		dsloginpage.successMsg();
		System.out.println("You are logged in" );
	}
	
	@When("User enters Username “test1”")
	public void user_enters_username_test1() {
	}

	@When("User enters Password “”")
	public void user_enters_password() {
	    
	}

	@When("User enters Username “”")
	public void user_enters_username() {
	    
	}

	@When("User enters Password “@#$%”")
	public void user_enters_password_$() {
	    
	}
}
