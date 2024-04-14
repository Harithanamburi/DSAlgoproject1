package DS.stepdefination;

import org.openqa.selenium.WebDriver;

import DS.driverfactory.Driverfactory;
import DS.pages.queuePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class queue_stepdefination {
	
	private WebDriver driver;
	private queuePage queue = new queuePage(Driverfactory.getDriver());
		
	@Given("user scrolls down for Queue option")
	public void user_scrolls_down_for_queue_option() {
		
		queue.ScrollDown();
	    
	}

	
	@Then("Click on Queue Get started button")
	public void click_on_queue_get_started_button() {
		queue.queuegetStarted();
		queue.pageScrolltoBottom();
	   
	}
	
	@Given("User select the option Implementation of Queue in Python")
	public void user_select_the_option_implementation_of_queue_in_python() {
	    
		queue.implementationQueue();
	}
	
	@Given("User select the option collections dequeue")
	public void user_select_the_option_collections_dequeue() {
	    queue.collectionDequeue();
	}
	
	@Given("User click on the option Implemen_tation Using Arrays")
	public void user_click_on_the_option_implemen_tation_using_arrays() {
	    queue.implemenUsingArray();
	}
	
	@Given("User click on the option Queue operations")
	public void user_click_on_the_option_queue_operations() {
	   queue.queueOperations();
	}
}
