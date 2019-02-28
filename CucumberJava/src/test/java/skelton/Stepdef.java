package skelton;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Stepdef {
	person Sean;
	person Lucia;
	@Given("Sean is {int} meers \\{away} from Lucia")
	public void sean_is_meers_away_from_Lucia(int distance) {
	    // Write code here that turns the phrase above into concrete actions
	  Sean=new person();
	  Sean.setDistance(distance);
	  
	}

	@When("Sean shouts {string}")
	public void sean_shouts(String message) {
	    // Write code here that turns the phrase above into concrete actions
	Sean.setMessage(message); 
	}
	@Then("Lucia hears/(cannot hear) message")
	public void lucia_hears_message() {
	    // Write code here that turns the phrase above into concrete actions
	 String message =Sean.getMessage(); 
	 Assert.assertEquals("free coffee", message);
	}
	
	
	/*@Then("Lucia hears message")
	public void lucia_cannot_hears_message() {
	    // Write code here that turns the phrase above into concrete actions
	
	}*/
}
