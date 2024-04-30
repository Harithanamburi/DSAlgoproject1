package DS.stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import DS.driverfactory.Driverfactory;
import DS.pages.DSloginpage;
import DS.pages.registrationpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration_stepdefination11 {

	private WebDriver driver;
	private registrationpage register = new registrationpage(Driverfactory.getDriver());
//====Validation with valid data=====//
	@Then("user clicks the register link")
	public void user_clicks_the_reister_link() throws InterruptedException {
		
		register.registerLink();
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

	@Then("user clicks the register button")
	public void user_clicks_the_register_button() {
		register.registerButton();
	}

	@Then("sucess  msg should display {string}")
	public void sucess_msg_should_display(String string) {
		register.successMessage();
	}

	//====Validation with Invalid data=====//

	@When("user clicks the register button with all empty fields")
	public void user_clicks_the_register_button_with_all_empty_fields() {

	}

	@When("user click register button after entering the username {string}")
	public void user_click_register_button_after_entering_the_username(String newuname) {
		register.enterusername(newuname);
	}
	@Then("error {string} appears below password")
	public void error_appears_below_password(String string) {
		register.plesefilloutthisfield();

	}

	@Then("error {string} appears below username textbox")
	public void error_appears_below_username_textbox(String string) {
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
		register.entercnfirmpwd(confirmpwd);
	}

	@Then("error {string} appears below username")
	public void error_appears_below_username(String string) {
		register.plesefilloutthisfield();
	}

	



	// valid DSloginpage

}
