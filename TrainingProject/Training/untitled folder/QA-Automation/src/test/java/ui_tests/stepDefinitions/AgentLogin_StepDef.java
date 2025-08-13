package ui_tests.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import utilities.BaseClass;

import static utilities.ConfigReader.getProperty;

@RunWith(Cucumber.class)
public class AgentLogin_StepDef extends BaseClass {

    @Given("User launch the URL {string} successfully")
    public void user_launch_the_url_successfully(String url) throws InterruptedException {

        visit(getProperty(url));
        log.info("url is launched");
        Thread.sleep(5000);
    }

    @Given("user enter username {string} and password {string}")
    public void user_enter_username_and_password(String userid, String pass) throws InterruptedException {

        Agent_pageObject.login(getProperty(userid),getProperty(pass));

    }

    @Given("click on login button")
    public void click_on_login_button() {
        Agent_pageObject.signInMethod();
    }

    @Given("user choose one organization {string}")
    public void userSelectOrganization(String ORG) throws InterruptedException {
        Agent_pageObject.orgSelection(getProperty(ORG));
    }

    @Then("see {int} validations messages")
    public void seeValidationsMessages(int quantity) {
        validateRedText(quantity);
    }

    @And("confirm login")
    public void confirmLogin() {
        Agent_pageObject.confirmLogin();
    }
}