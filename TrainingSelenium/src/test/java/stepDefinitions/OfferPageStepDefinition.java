package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import utils.TestContextSetup;

import java.util.Iterator;
import java.util.Set;

public class OfferPageStepDefinition {

    public String offerPageProductName;
    TestContextSetup testContextSetup;
    public OfferPageStepDefinition(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
    }
    @Then("User searched for {string} shortname in offers page")
    public void user_searched_for_same_shortname_in_offers_page(String shortName) throws InterruptedException {

        switchToOffersPage();
        testContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
        Thread.sleep(2000);
        offerPageProductName = testContextSetup.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
    }
    public void switchToOffersPage(){ //Single Responsibility method
        testContextSetup.driver.findElement(By.linkText("Top Deals")).click();
        Set<String> s1 = testContextSetup.driver.getWindowHandles();
        //to open child window
        Iterator<String> i1 = s1.iterator();
        String parentWindow = i1.next();
        String childWindow = i1.next();
        testContextSetup.driver.switchTo().window(childWindow);
    }
    @Then("Validate product name in offers page matches with landing page")
    public void validate_product_name_in_offer_page() {
        Assert.assertEquals(offerPageProductName,testContextSetup.landingPageProductName);

    }
}
