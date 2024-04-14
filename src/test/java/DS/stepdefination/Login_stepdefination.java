package DS.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
<<<<<<< HEAD
import org.openqa.selenium.support.PageFactory;

import DS.driverfactory.Driverfactory;
import DS.pages.Arrayspage;
import DS.pages.DSloginpage;
import io.cucumber.java.en.And;
=======

import DS.driverfactory.Driverfactory;
import DS.pages.login;
>>>>>>> main
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_stepdefination {
<<<<<<< HEAD
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
=======
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
	
	

	
	
>>>>>>> main
}
	
	

