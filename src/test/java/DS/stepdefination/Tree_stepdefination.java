package DS.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import DS.driverfactory.Driverfactory;
import DS.pages.Treepage;
import DS.pages.registrationpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tree_stepdefination {
	public WebDriver driver = Driverfactory.getDriver();
	private Treepage tree = new Treepage(Driverfactory.getDriver());

	@Then("Click on Tree Get started button")
	public void click_on_tree_get_started_button() {
		tree.getsatartbut();
	}

	@When("user click on Overview button  in Tree module")
	public void user_click_on_overview_button_in_tree_module() {
		tree.overviewButtonClick();
	}

	@Then("user click on left panel links in Tree module Invalid")
	public void user_click_on_left_panel_links_in_tree_module_Invalid() throws InterruptedException {
		//tree.treelinks();
		//tree.treehomelinksValid();
		tree.treehomelinksinvalid();

	}
	@Then("user click on left panel links in Tree module")
	public void user_click_on_left_panel_links_in_tree_module() throws InterruptedException {
		//tree.treelinks();
		tree.treehomelinksValid();
}
}
