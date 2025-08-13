package pages;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;


public class Main_PageObject extends BaseClass  {
    public static Logger log = LogManager.getLogger(Main_PageObject.class);

    @FindBy(xpath = "//span[contains(@class,'text-no-wrap')]//span[contains(text(), 'Users')]")
    public WebElement userTab ;
    @FindBy(xpath = "//span[contains(text(), 'providers')]")
    public WebElement providersTab ;
    @FindBy(xpath = "//span[contains(text(), 'Organizations')]")
    public WebElement OrganizationsTab ;
    @FindBy(xpath = "//div[contains(@id,'table-search')]/div/div/div/div[2]/input")
    public WebElement searchInput ;

    @FindBy(xpath = "//tr[contains(@class, 'v-data-table__mobile-table-row')][1]")
    public WebElement searchResult;


    @FindBy(xpath = "//div[contains(@class, 'flex-grow-0 fill-height col col-auto')]")
    public WebElement search ;
    @FindBy(xpath = "//div[contains(@class, 'flex-grow-0 fill-height col col-auto')]/button")
    public WebElement searchPatient ;
    @FindBy(xpath = "//div[contains(@class, 'selection-controls__ripple')])[2]")
    public WebElement firstUser ;
    @FindBy(xpath= "//tr[2]//td[2]")
    public WebElement firstOption;
    @FindBy(xpath = "(//div[contains(@class, 'selection-controls__ripple')])[3]")

    public WebElement secondUser ;
    @FindBy(xpath = "(//div[contains(@class, 'selection-controls__ripple')])[4]")
    public WebElement thirdUser ;
    @FindBy(xpath = "(//button[contains(@class, 'mb-4 v-btn')])[2]")
    public WebElement selectAllButton ;
    @FindBy(xpath = "//button[contains(@class, 'mb-4 mr-2 v-btn')]")
    public WebElement closeAllButton ;
    //tabs
    @FindBy(xpath = "//a[contains(@value,'providers')]")
    public WebElement providedTab;
    @FindBy(xpath = "//a[contains(@value,'organizations')]")
    public WebElement organizationTab;
    @FindBy(xpath = "//span[contains(text(), 'At-Risk')]")
    public WebElement atriskTab;
    @FindBy(xpath = "(//div[contains(text(), 'Patients')]/parent::div)[1]")
    public WebElement patientTab;

    @FindBy(xpath = "//div[contains(text(), 'Directory')]")
    public WebElement directoryTab;
    @FindBy(xpath = "//span[contains(text(), 'Observations')]")
    public WebElement workboardTab;

    @FindBy(xpath = "//span[contains(text(), 'Adherence')]/parent::span/parent::a")
    public WebElement adherenceTab;
    @FindBy(xpath = "//div[contains(text(), 'rpm')]")
    public WebElement rpmTab;
    @FindBy(xpath = "//tr[contains(@class,'v-data-table__empty-wrapper')]")
    public WebElement emptyWrapper;
    //create
    @FindBy(xpath = "//button[contains(@class,'bg-primary')]")
    public WebElement plusIcon;
    @FindBy(xpath = "//div[contains(@class,'v-overlay')]/div[3]/span/button")
    public WebElement addUserButton;
    @FindBy(xpath = "//div[contains(@class,'v-overlay')]/div[2]/span/button")
    public WebElement addOrganizationButton;
    @FindBy(xpath = "//div[contains(@class,'v-overlay')]/div[1]/span/button")
    public WebElement addProviderButton;
    @FindBy(xpath = "//div[contains(@class,'v-overlay')]/div[4]/span/button")
    public WebElement addPatientButton;
    //edit
    @FindBy(xpath = "//button[contains(@data-tid, 'Edit')]")
    public WebElement editButton;


    // mailinator
    @FindBy(xpath = "//button[@class='primary-btn']")
    public WebElement goButton;
    @FindBy(xpath = "//a[normalize-space(text())='Back to Inbox']")
    public WebElement backToInbox;
    @FindBy(id = "inbox_field")
    public WebElement mailAddressField;
    @FindBy(xpath = "//*[@id='m8rguy']")
    public WebElement emptyInboxMessage;
    @FindBy(xpath = "//div[contains(@id ,'inbox_pane')]//td[contains(text(), \"Join\")]")
    public WebElement joinEmail;





    static String randomEmail = "Automation" + faker.name().username() + "@mailinator.com" ;
    static String randomName = "Automation" + faker.name().firstName();
    static String randomMiddleName = "Automation" + faker.name().firstName();
    static String randomLastName = "Automation" + faker.name().lastName();
    static String randomPreferredName = "Automation" + faker.name().firstName();
    static String randomAbout = "Automation " + faker.animal();
    static String randomPhoneNumber = faker.phoneNumber().cellPhone();

    String winHandleBefore = driver.getWindowHandle();

    public Main_PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void seeUserTab() {
        try {
            waitForVisibility(userTab,120);
            log.info("User tab is open ....");


        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }


    public void selectFirstthree(){

        try {
            waitForVisibility(firstUser,5);
            firstUser.click();
            secondUser.click();
            thirdUser.click();
            log.info("Click on users ....");


        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }

    }

    public void selectEditable(){
        try {

            waitForVisibility(firstOption,5);
            firstOption.click();
            log.info("Click for info ....");

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }

    }

    public void selectAll(){
        try {
            waitForVisibility(selectAllButton,5);
            selectAllButton.click();
            log.info("Click on select all ....");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }


    }

    public void closeAll(){
        try {
            waitForVisibility(closeAllButton,5);
            closeAllButton.click();
            log.info("Click on Close all ....");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }


    }

    public void selectProviderTab(){
        try {
            waitForVisibility(providedTab,60);
            providedTab.click();
            log.info("Click on provider tab....");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectUserTab(){
        try {
            waitForVisibility(userTab,60);
            userTab.click();
            log.info("Click on user tab....");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectOrganizationTab(){
        try {
            waitForVisibility(organizationTab,60);
            organizationTab.click();
            log.info("Click on organization tab....");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectPatientTab(){
        try {
            waitForVisibility(patientTab,80);
            patientTab.click();
            log.info("Click on organization tab....");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectDirectoryTab(){
        try {
            waitForVisibility(directoryTab,90);
            directoryTab.click();
            log.info("Click on organization tab....");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    public void selectWorkboard(){
        try {
            Thread.sleep(80000);
            waitForVisibility(workboardTab,110);
            workboardTab.click();
            log.info("Click on workboard tab....");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectAdherence(){
        try {
            Thread.sleep(80000);
            waitForVisibility(adherenceTab,90);
            adherenceTab.click();
            log.info("Click on workboard tab....");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    public void selectObservations(){
        try {
            waitForVisibility(workboardTab,90);
            workboardTab.click();
            log.info("Click on workboard tab....");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    public void selectRpmtab(){
        try {
            waitForVisibility(rpmTab,90);
            rpmTab.click();
            log.info("Click on rpm tab....");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectAtRisktab(){
        try {
            waitForVisibility(atriskTab,110);
            atriskTab.click();
            log.info("Click on At-Risk tab....");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void openAddUser() {
        try {
            plusIcon.click();
            Thread.sleep(9000);
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            By xpathAddUser = By.xpath("(//div[contains(@class,'v-overlay')]/div[3]/span/button)");
            WebElement addUserElement = driver.findElement(xpathAddUser);
            addUserElement.click();

            }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void openAddProvider() {
        try {
            plusIcon.click();
            Thread.sleep(9000);
            addProviderButton.click();}
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    public void openAddOrganization() {
        try {
            plusIcon.click();
            addOrganizationButton.click();}
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void openAddPatient(){
        try {
            Thread.sleep(9000);
            patientTab.click();
            plusIcon.click();
            addPatientButton.click();
            Thread.sleep(9000);}

        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectTab(String selectedTab){
        try{
            switch(selectedTab){
                case "Users":
                    userTab.click();
                    break;
                case "Providers":
                    userTab.click();
                    providersTab.click();
                    providersTab.click();
                    break;
                case "Organizations":
                    userTab.click();
                    providersTab.click();
                    OrganizationsTab.click();
                    break;
                default:
                    log.info("Input not valid ");
                    break;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    public void find(String findet){
        try {
            Thread.sleep(9000);
            search.click();
            Thread.sleep(2000);
            searchInput.sendKeys(findet);
            search.click();
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void findPatient(String findet){
        try {
            Thread.sleep(20000);
            searchPatient.click();
            Thread.sleep(10000);
            searchInput.sendKeys(findet);
            Thread.sleep(20000);
            //searchPatient.click();
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }


    public void clickEdit(){
        try{
            js.executeScript("window.scrollBy(0,-1000)");
            js.executeScript("arguments[0].click();", editButton);

        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    public void checkSearch(String expectedresult,String searchname){
        try{
            Thread.sleep(30000);
            log.info("checking " + searchname);
            By xpathSearch = By.xpath("//span[contains(text(), '" + searchname + "')]");

            if (Objects.equals(expectedresult, "visible")) {
                Thread.sleep(30000);
                WebElement searched = driver.findElement(xpathSearch);
                searched.isDisplayed();

            }
            if (Objects.equals(expectedresult, "not visible")) {
                emptyWrapper.isDisplayed();
                }

        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    public void checkCount(String tab, String count){
        try{
            log.info("checking count " + count +" in " +tab);
            By xpathCount = By.xpath("//a[contains(@value,'"+tab+"')]/span[2]/span/span[contains(text(), '"+count+"')]");
            WebElement elementCount = driver.findElement(xpathCount);
            elementCount.isDisplayed();
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }




    public void newWindow() {
        winHandleBefore = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
    }

    public void navigateToMalinator() {
        log.info("********************** Navigating to Mailinator **********************");
        driver.navigate().to("https://www.mailinator.com/v4/public/inboxes.jsp");
    }


    public void MailinatorChecking() {


        try {
            mailAddressField.sendKeys(randomEmail);
            goButton.click();
            if (emptyInboxMessage.isDisplayed()) {
                log.info("Reliq is not sending emails to customers...");
                driver.close();
                driver.switchTo().window(winHandleBefore);
            } else {
                log.info(" Getting email...");
                joinEmail.click();
                driver.close();
                driver.switchTo().window(winHandleBefore);
            }

        } catch (Exception e) {
            e.printStackTrace();
            log.info("Method failed due to an exception:::" + e.getMessage());
        }
    }

    public void changeTab(){
        try{
            String originalWindow = driver.getWindowHandle();

//Check we don't have other windows open already
            assert driver.getWindowHandles().size() == 1;

//Click the link which opens in a new window
            driver.findElement(By.linkText("new window")).click();

        }
     catch (Exception e) {
        e.printStackTrace();
        log.info("Method failed due to an exception:::" + e.getMessage());
    }
    }


}

