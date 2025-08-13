package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MainSteps {
   /* @Given("setup the entries in database")
    public void setup_the_entries_in_database() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("setup the entries in database");
        throw new io.cucumber.java.PendingException();
    }
   @When("launch the browser from config variables")
    public void launch_the_browser_from_config_variables() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("hit the home page url of banking site")
    public void hit_the_home_page_url_of_banking_site() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }*/
    @Given("User is on NetBanking landing page")
    public void user_is_on_net_banking_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on NetBanking landing page");
       // throw new io.cucumber.java.PendingException();
    }
    @When("User login into application with {string} and password {string}")
    public void user_login_into_application_with_and_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User login into application with "+ string+ " and password " +string2);
        //throw new io.cucumber.java.PendingException();
    }
    @Given("User is on Practice landing page")
    public void user_is_on_practice_landing_page() {
        System.out.println("User is on Practice landing page");
        //throw new io.cucumber.java.PendingException();
    }
    @When("User signup into application")
    public void user_signup_into_application(List<String> data) {
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));

        // driver.findElement(sendKeys(data.get(0)))
       // throw new io.cucumber.java.PendingException();
    }
    @Then("Home Page is displayed")
    public void home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Home Page is displayed");
        //throw new io.cucumber.java.PendingException();
    }
    @Then("Cards are displayed")
    public void cards_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cards are displayed");
       // throw new io.cucumber.java.PendingException();
    }

    @Given("set up database")
    public void set_up_database() {
        System.out.println("*****************************");
        System.out.println("Set up Data base");
        //throw new io.cucumber.java.PendingException();
    }
}
