package stepDefinitions;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
public class stepDefinition {
	
	@Given("^User is on netBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("Navigate to landing page using URL");
    }

//    @When("^User login into application with username and password$")
//    public void user_login_into_application_with_username_and_password() throws Throwable {
//        System.out.println("Input uname and pass, and click login");
//    }

	@When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
		System.out.println("input username :"+ strArg1);
		System.out.println("input password :"+ strArg2);
    }
	
    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("Expecting user can view homepage");
    }

//    @And("^Cards are displayed$")
//    public void cards_are_displayed() throws Throwable {
//    	System.out.println("Expecting user can view cards");
//    }
    
    @And("^Cards displayed \"([^\"]*)\"$")
    public void cards_displayed_something(String strArg1) throws Throwable {
    	System.out.println("Cards status diplayed?"+ strArg1);
    }
    
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
        List<List<String>> obj=data.asLists();
        System.out.println("Sign up with following details:");
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
        System.out.println(obj.get(0).get(4));
    }

    @When("^User login in to application with (.+) and (.+)$")
    public void user_login_into_application_with_and(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }
    
    @Given("^validate browser$")
    public void validate_browser() throws Throwable {
        System.out.println("Deciding the browser to open");
    }
    
    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("Browser is triggered");
    }
    
    @Then("^Check if browser is displayed$")
    public void check_if_browser_is_displayed() throws Throwable {
    	System.out.println("Browser is displayed");
    }
    
}
