package skelton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefuser {
	@Given("the url of the login page >")
	public void the_url_of_the_login_page() {
	   
	}

	@When("admin user enters (word) as user name")
	public void admin_user_enters_ask_gmail_com_as_user_name(String username) {
	  System.out.println("username:"+username); 
	}

	@When("admin user enters {word} as password")
	public void admin_user_enters_as_password(String password) {
		System.out.println("passworde:"+password);  
	}

	@Then("admin user")
	public void admin_user(String result) {
		System.out.println("result:"+result); 
	}

}
