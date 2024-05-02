package DS.stepdefination;
import org.openqa.selenium.WebDriver;

import DS.driverfactory.Driverfactory;
import DS.pages.Stackpage;
import DS.pages.registrationpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stack_stepdefination {
	
	private WebDriver driver;
	private Stackpage stack = new Stackpage(Driverfactory.getDriver());
		
	
	@Then("Click on Stack Get started button") 
	public void click_on_stack_get_started_button() throws InterruptedException{
		stack.ScrollDown() ;
		stack.getStartedStack();
	}
	
	
	@When("Click on operations in stack tab")
	public void click_on_operations_in_stack_tab() throws InterruptedException {
		
		stack.operationInstack();
	   
	}

	@Then("click on Try here tab")
	public void click_on_try_here_tab() throws InterruptedException {
		stack.tryHereButton();
		
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

	@Then("user enter the invalid python code {string}")
	public void user_enter_the_invalid_python_code(String string) throws InterruptedException {
	
	  stack.gobackbrw();
	  stack.tryHereButton();
	  stack.invalidCode(string);
	  stack.runButton();
	}

	@Then("User gets the error")
	public void user_gets_the_error(WebDriver driver) {
		
		stack.acceptAlert();
	}
	
	

	@Then("user should check if there is an alert")
	public void user_should_check_if_there_is_an_alert() throws InterruptedException {
		stack.acceptAlert();
	}
	
	@Given("User Click on the Implementation tab")
	public void user_click_on_the_implementation_tab() {
		stack.implementation();
	  
	}

	@Given("User Click on the Application tab")
	public void user_click_on_the_application_tab() {
	   stack.Application();
			
	}
	
	
}