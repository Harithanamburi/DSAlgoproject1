package DS.stepdefination;

import org.openqa.selenium.WebDriver;

import DS.driverfactory.Driverfactory;
import DS.pages.Stackpage;
import DS.pages.registrationpage;
import DS.testrunner.register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stack_stepdefination {
	
	private WebDriver driver;
	private Stackpage stack = new Stackpage(Driverfactory.getDriver());
	private registrationpage loginpage = new registrationpage(Driverfactory.getDriver());
	
	
	
	@Given("User is on login page {string} and {string}")
	public void user_is_on_login_page_and(String un, String pwd) {
	
		Driverfactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		loginpage.dologin(un, pwd);
		
		
	}
	
	
	@And ("user scrolls down for stack option")
	public void user_scrolls_down_for_stack_option() {
		stack.ScrollDown() ;
	}
	
	
	@Then("Click on Stack Get started button") 
	public void click_on_stack_get_started_button() throws InterruptedException{
		stack.getStartedStack();
	}
	
	
	@When("Click on operations in stack tab")
	public void click_on_operations_in_stack_tab() throws InterruptedException {
		
		stack.operationInstack();
	   
	}

	@Then("click on Try here tab")
	public void click_on_try_here_tab() throws InterruptedException {
		stack.tryHereButton();
		//Thread.sleep(3000);
	}
	@Then("user enter the valid python code \"print \"hello\"\"")
	public void user_enter_the_valid_python_code_print_hello() throws InterruptedException {
	    stack.pythonCode();
	    stack.runButton();
	}

	@Then("user able to see the output")
	public void user_able_to_see_the_output() {
	    stack.outputPyCode();
	    
	    
	}

	@Then("user enter the invalid python code error")
	public void user_enter_the_invalid_python_code_error() throws InterruptedException {
	  stack.gobackbrw();
	  stack.tryHereButton();
	  stack.invalidCode();
	  stack.runButton();
	}

	@Then("User gets the error")
	public void user_gets_the_error(WebDriver driver) {
		//Stackpage.isDialogPresent(driver);
//		Stackpage.acceptBrowserAlert(driver);
//		stack.implementation();
		stack.alert();
	}
	
	@Given("User Click on the Implementation tab")
	public void user_click_on_the_implementation_tab() {
		stack.implementation();
	  
	}

	@Given("User Click on the Application tab")
	public void user_click_on_the_application_tab() {
	   stack.Application();
			
	}
	
	@Given("User click on the otion Implemen_tation Using Arrays")
	public void user_click_on_the_otion_implemen_tation_using_arrays() {
	    
	}


	

}
