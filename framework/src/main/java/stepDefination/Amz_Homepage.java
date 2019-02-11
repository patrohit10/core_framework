package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Base;

public class Amz_Homepage {
	
	Base baseclass=new Base();
	
	@Given("^user enters valid url$")
	public void user_enters_valid_url() throws Throwable {
		
		baseclass.launchAmazonWeb();
	   
	}

	@When("^user navigates to amazon web portal successfully$")
	public void user_navigates_to_amazon_web_portal_successfully() throws Throwable {
	    System.out.println("Action will be executed");
	}

	@Then("^user gets amazon logo$")
	public void user_gets_amazon_logo() throws Throwable {
	    System.out.println("Validation to be performed");
	}
	
	@Then("^user gets signin button$")
	public void user_gets_signin_button() throws Throwable {
	    
	}

}
