package DS.stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import DS.driverfactory.Driverfactory;
import DS.pages.login;
import DS.pages.registrationpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration_stepdefination {
		
	int username;
	private WebDriver driver;
		private registrationpage register = new registrationpage(Driverfactory.getDriver());

	//validregistration
	@Given("user navigates to register page")
	public void user_navigates_to_register_page() {
	    
		Driverfactory.getDriver().get("https://dsportalapp.herokuapp.com/register");

	}

	@Then("user enters the username {string}")
	public void user_enters_the_username(String username) {
	register.enterusername(username);
	}

	@Then("user enters the password {string}")
	public void user_enters_the_password(String password) {
	  register.enterpassword(password);
	}
	
	@Then("user enters the confirmation password {string}")
	public void user_enters_the_confirmation_password(String cpwd) {
		   register.entercnfirmpwd(cpwd);
	}
	
	@Then("user clicks the reister button")
	public void user_clicks_the_reister_button() {
	   register.registerbutton();
	}
	
	@Then("sucess  msg should display {string}")
	public void sucess_msg_should_display(String string) {
	   register.newsucessmsg();
	}
	
	//invalidregistration
	
	@When("user click register button after entering the username {string}")
	public void user_click_register_button_after_entering_the_username(String newuname) {
	   register.enterusername(newuname);
	}

	@Then("error {string} appears below textbox")
	public void error_appears_below_textbox(String string) {
		WebElement activeElement = Driverfactory.getDriver().switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
	}

	
	@When("user click register button after entering the username {int}")
	public void user_click_register_button_after_entering_the_username(Integer username) {
	    this.username=username;
	}
	
	@Then("error {string} appears below password")
	public void error_appears_below_password(String string) {
		register.plesefilloutthisfield();

	}
	
	@Then("user click register button after entering the password {string}")
	public void user_click_register_button_after_entering_the_password(String passwrd) {
	    register.enterpassword(passwrd);
	}
	@Then("error {string} appears below confirmation confirmpassword")
	public void error_appears_below_confirmation_confirmpassword(String string) {
		register.plesefilloutthisfield();

	}
	
	@Then("user click register button after entering the confimpassword {string}")
	public void user_click_register_button_after_entering_the_confimpassword(String confirmpwd) {
	    register.givenconfirmpwd(confirmpwd);
	}
	
	@Then("error {string} appears below username")
	public void error_appears_below_username(String string) {
		register.plesefilloutthisfield();
	}
	
	//invalid login Button
	

	@Given("user click on signin link")
	public void user_click_on_signin_link() {
	    register.enterssignlink();
	}
	@When("user enters login button with all empty fields")
	
	public void user_enters_login_button_with_all_empty_fields() {
	   register.clickloginbutton();
	}

	//buttonlogin
	@Then("click on login button")
	public void click_on_login_button()  
	{
		register.clickloginbutton();
	}

	@Then("error message  {string} appears below username")
	public void error_message_appears_below_username(String string) {
	    register.plesefilloutthisfield();
	}

	@Then("user enters username {string}")
	public void user_enters_username(String username1) {
	    register.loginusername(username1);
	}

	@Then("error message {string} appears below password")
	public void error_message_appears_below_password(String string) {
	    register.plesefilloutthisfield();
	}

	@Then("user enters  password {string}")
	public void user_enters_password(String passwrd1) {
	    register.loginpassword(passwrd1);
	}
	
	@When("user enters invalid username {string}")
	public void user_enters_invalid_username(String username1) {
    register.loginusername(username1);
	
	}
	@When("user enters invalid password  {string}")
	public void user_enters_invalid_password(String passwrd1) {
	    register.loginpassword(passwrd1);
	}
	
	@Then("error message should display")
	public void error_message_should_display() {
		register.invalidusernameandpassword();
	}
	
	//valid login 
	
	




	}
	


	
	


	

	
