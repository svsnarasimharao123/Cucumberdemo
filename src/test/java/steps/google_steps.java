package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main_java.google_java;

public class google_steps {
	google_java google=new google_java();
	@Given("^launch an chrome browser$")
	public void launch_an_chrome_browser()  {
		google.url();
	    
	}

	@When("^the user opens google homepage$")
	public void the_user_opens_google_homepage()  {
	   
		google.google_homepage();
	}

	@Then("^verify textbox$")
	public void verify_textbox() throws InterruptedException  {
		
	    google.verify();
	}

	@Then("^Click the search button$")
	public void click_the_search_button() throws Throwable {
	   google.submit();
	}

}
