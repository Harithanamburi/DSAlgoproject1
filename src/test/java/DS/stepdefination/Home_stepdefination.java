package DS.stepdefination;

import org.openqa.selenium.WebDriver;

import DS.driverfactory.Driverfactory;
import DS.pages.DSHomepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Home_stepdefination {
	public class DsHome_stepdefination {
		private WebDriver driver = Driverfactory.getDriver();
		private DSHomepage home = new DSHomepage(driver);
		
		@Given("User is on homepage")
		public void user_is_on_homepage() {
			driver.get("https://dsportalapp.herokuapp.com/");
			String t=driver.getTitle();
			System.out.println("Page Title :" +t);
			home.welcomeMsg();
			System.out.println("You are at the right place");
		}
		@Then("user clikcs on getstarted button to redirect to home page")
		public void user_clikcs_on_getstarted_button_to_redirect_to_home_page() {
			home.GetStartedBtn();
			String t=driver.getTitle();
			System.out.println("Page Title :" +t);
		}
	}


}
