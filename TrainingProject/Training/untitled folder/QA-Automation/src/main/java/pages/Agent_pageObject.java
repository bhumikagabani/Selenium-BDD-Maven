package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import utilities.BaseClass;

import java.util.List;

public class Agent_pageObject extends BaseClass {


    public static Logger log = LogManager.getLogger(Agent_pageObject.class);

    @FindBy(xpath = "(//div[@class='modal-body']//input[@id='signInFormUsername'])[2]")
    public WebElement username;

    @FindBy(xpath = "(//*[@id='signInFormPassword'])[2]" )
    public WebElement userPassword;

    @FindBy(xpath = "(//*[@name='signInSubmitButton'])[2] ")
    public WebElement singInButton;

    @FindBy(xpath = "//div[contains(text(),'bhumi')]")
    public WebElement org;

    @FindBy(xpath = "(//button)[2]")
    public WebElement confirmLogin;



    public Agent_pageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



    public void login(String userid, String password) {

        try {

            waitForVisibility(username,10);
            username.sendKeys(userid);
            log.info("entering user id ....");
            userPassword.sendKeys(password);
            log.info("Entering password ....");


        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }


    }

    public void signInMethod() {

        try {
            waitForVisibility(singInButton,5);
            singInButton.click();
            log.info("Clicking on signing button ....");


        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }


    }


    public void orgSelection(String desiredOrg) {
        try{
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            Thread.sleep(18000);
            By xpathOrge = By.xpath("//span[contains(text(),'"+desiredOrg+"')]");
            WebElement selectedSOrg = driver.findElement(xpathOrge);
            executor.executeScript("arguments[0].click();", selectedSOrg);

        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void confirmLogin(){
        try{
        confirmLogin.click();

        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
}
