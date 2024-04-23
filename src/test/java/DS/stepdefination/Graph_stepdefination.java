package DS.stepdefination;

import org.openqa.selenium.WebDriver;
import DS.driverfactory.Driverfactory;
import DS.pages.LinkedListpage;
import DS.pages.CommonPage;
import DS.pages.GraphsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Graph_stepdefination {
	
		private WebDriver driver = Driverfactory.getDriver();

		private GraphsPage graphspage;
		private CommonPage commonpage;

		public Graph_stepdefination() {
			
			graphspage = new GraphsPage(Driverfactory.getDriver());
			commonpage = new CommonPage(driver);
		}
		
		@Then("Click on Graph Get started button")
		public void click_on_graph_get_started_button() {
			graphspage.getStartedButton();
		}

		@When("User click on Graph link")
		public void user_click_on_graph_link() {
			graphspage.graph();
		}
		@When("User enters valid python code for graph")
		public void user_enters_valid_python_code_for_graph() throws InterruptedException {
			
			graphspage.graphListValiddata();
		}
		
		@When("User enters Invalid python code for graph")
		public void user_enters_Invalid_python_code_for_graph() throws InterruptedException {
			
			graphspage.graphListInValiddata();
		
		}

}
