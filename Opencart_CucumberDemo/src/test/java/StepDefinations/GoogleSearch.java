package StepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.*;

public class GoogleSearch {

	@Given("browser is open")
	public void browser_is_open() {
	   
		System.out.println("inside step- browser is open");
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
	    System.out.println("inside step= user is on google search page");
	}

	@When("user enter a search box")
	public void user_enter_a_search_box() {
	    System.out.println("inside step-user enter a search box");
	}

	@When("hit enter")
	public void hit_enter() {
		  System.out.println("inside step-hit enter");
	}

	@Then("user is navigated to search result")
	public void user_is_navigated_to_search_result() {
		  System.out.println("inside step-user is navigated to search result");
	}



	
}
