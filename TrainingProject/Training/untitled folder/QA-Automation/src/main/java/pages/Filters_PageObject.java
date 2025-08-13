package pages;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.util.Objects;





public class Filters_PageObject extends BaseClass  {

    @FindBy(xpath = "//th[contains(@role, 'columnheader')][4]/div//i")
    public WebElement userOrganizationFilter;
    @FindBy(xpath = "//th[contains(@role, 'columnheader')][5]/div//i")
    public WebElement providerOrganizationFilter;
    @FindBy(xpath = "//th[contains(@role, 'columnheader')][7]/div//i")
    public WebElement providerStatusFilter;
    @FindBy(xpath = "//th[contains(@role, 'columnheader')][6]/div//i")
    public WebElement organizationStatusFilter;
    @FindBy(xpath = "//th[contains(@role, 'columnheader')][5]/div//i")
    public WebElement userProgramFilter;
    @FindBy(xpath = "//th[contains(@role, 'columnheader')][5]/div//i")
    public WebElement userRoleFilter;
    @FindBy(xpath = "//tr[2]")
    public WebElement result;
    @FindBy(xpath = "//tr[contains(@class,'v-data-table__empty-wrapper')]")
    public WebElement emptyResult;
    @FindBy(xpath = "//div[contains(@role, 'option')]//div [contains(text(), 'Inactive')]/parent::div/parent::div/parent::div/following-sibling::div/button[2]")
    public WebElement restButtonProviderStatus;
    public static Logger log = LogManager.getLogger(Filters_PageObject.class);

    String winHandleBefore = driver.getWindowHandle();

    public Filters_PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    JavascriptExecutor executor = (JavascriptExecutor)driver;

    public void selectUserOrganization(String org){
        try{
            Thread.sleep(2000);
            userOrganizationFilter.click();
            Thread.sleep(2000);
            log.info("Entering Organization filter " + org);
            By xpathOrg = By.xpath("//div[contains(@role, 'option')]//div [contains(text(), '"+org+"')]");
            WebElement selectedOrg= driver.findElement(xpathOrg);
            executor.executeScript("arguments[0].click();", selectedOrg);
            Thread.sleep(2000);
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectProviderOrganization(String org){
        try{
            Thread.sleep(4000);
            providerOrganizationFilter.click();
            Thread.sleep(2000);
            log.info("Entering Organization filter " + org);
            By xpathOrg = By.xpath("//div[contains(@role, 'option')]//div [contains(text(), '"+org+"')]");
            WebElement selectedOrg= driver.findElement(xpathOrg);
            executor.executeScript("arguments[0].click();", selectedOrg);
            Thread.sleep(2000);
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectUserProgram(String program){
        try{
            Thread.sleep(2000);
            userProgramFilter.click();
            Thread.sleep(2000);
            log.info("Entering Program filter " + program);
            By xpathProgram = By.xpath("//div[contains(@role, 'option')]//div [contains(text(), '" +program+"')]");
            WebElement selectedProgram= driver.findElement(xpathProgram);
            executor.executeScript("arguments[0].click();", selectedProgram);
            Thread.sleep(2000);
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectTypeOrganizationFilter(String type){
        try{
            Thread.sleep(2000);
            userProgramFilter.click();
            Thread.sleep(2000);
            log.info("Entering Type filter " + type);
            By xpathType = By.xpath("//div[contains(@role, 'option')]//div [contains(text(), '" +type+"')]");
            WebElement selectedType= driver.findElement(xpathType);
            executor.executeScript("arguments[0].click();", selectedType);
            Thread.sleep(2000);
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectProviderStatus(String status){
        try{
            Thread.sleep(4000);
            providerStatusFilter.click();
            restButtonProviderStatus.click();
            Thread.sleep(2000);
            providerStatusFilter.click();
            Thread.sleep(2000);
            log.info("Entering status filter " + status);
            By xpathProgram = By.xpath("//div[contains(@role, 'option')]//div [contains(text(), '" +status+"')]");
            WebElement selectedProgram= driver.findElement(xpathProgram);
            executor.executeScript("arguments[0].click();", selectedProgram);
            Thread.sleep(2000);
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectOrganizationStatus(String status){
        try{
            Thread.sleep(2000);
            organizationStatusFilter.click();
            restButtonProviderStatus.click();
            Thread.sleep(2000);
            organizationStatusFilter.click();
            Thread.sleep(2000);
            log.info("Entering status filter " + status);
            By xpathProgram = By.xpath("//div[contains(@role, 'option')]//div [contains(text(), '" +status+"')]");
            WebElement selectedProgram= driver.findElement(xpathProgram);
            executor.executeScript("arguments[0].click();", selectedProgram);
            Thread.sleep(2000);
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }



    public void selectUserRole(String role){
        try{
            Thread.sleep(2000);
            userRoleFilter.click();
            Thread.sleep(3000);
            log.info("Entering Role filter " + role);
            By xpathRole = By.xpath("//div[contains(@role, 'option')]//div [contains(text(), '"+role+"')]");
            Thread.sleep(3000);
            WebElement selectedRole= driver.findElement(xpathRole);
            executor.executeScript("arguments[0].click();", selectedRole);
            Thread.sleep(2000);
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    public void result(String expectedResult){
        try {
            if(Objects.equals(expectedResult, "visible")){
                result.isDisplayed();
            }
            if(Objects.equals(expectedResult, "not visible")){
                emptyResult.isDisplayed();
            }
        }catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }



}

