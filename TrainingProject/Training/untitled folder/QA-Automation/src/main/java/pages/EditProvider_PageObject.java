package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;
import utilities.Driver;

import java.util.Stack;

public class EditProvider_PageObject extends BaseClass {
    //add user page
    //name
    @FindBy(xpath = "//div[@id='edit-provider-form']//label[contains(text(),'First Name')]/following-sibling::input")
    public WebElement name;
    //Last name
    @FindBy(xpath = "//div[@id='edit-provider-form']//label[contains(text(),'Last Name')]/following-sibling::input")
    public WebElement lastName;
    //NPI
    @FindBy(xpath = "//div[@id='edit-provider-form']//label[contains(text(),'NPI')]/following-sibling::input")
    public WebElement npiField;
    //Cualification button
    @FindBy(xpath = "//label[contains(text(),'Qualifications')]/following-sibling::input")
    public WebElement qualificationButton;
    //Prefix number
    @FindBy(xpath = "//div[@id='edit-provider-form']//div[contains(text(),'+1')]/following-sibling::input ")
    public WebElement prefixNumber;
    //Prefix number plus + desired number
    @FindBy(xpath = "//div[contains(text(),'+3')]")
    public WebElement prefixNumberPlus;
    //Phone number
    @FindBy(xpath = "//div[@id='edit-provider-form']//label[contains(text(),'Phone Number')]/following-sibling::input")
    public WebElement phoneNumber;
    //Phone type
    @FindBy(xpath = "//div[@id='edit-provider-form']//div[contains(@Class,'v-select')]//label[contains(text(),'Type')]")
    public WebElement phoneNumberType;
    //Phone type personal
    @FindBy(xpath = "//div[contains(@class,'menuable__content__active')]//div[contains(text(),'Personal')]")
    public WebElement phoneNumberTypePersonal;
    //Phone type work
    @FindBy(xpath = "//div[contains(@class,'menuable__content__active')]//div[contains(text(),'Work')]")
    public WebElement phoneNumberTypeWork;
    //Phone type other
    @FindBy(xpath = "//div[contains(@class,'menuable__content__active')]//div[contains(text(),'Other')]")
    public WebElement phoneNumberTypeOther;
    //email
    @FindBy(xpath = "//div[@id='edit-provider-form']//label[contains(text(),'Email')]/following-sibling::input")
    public WebElement email;
    //email type
    @FindBy(xpath = "//div[@id='edit-provider-form']//label[contains(text(),'Email')]/parent::div/parent::div/parent::div/parent::div/parent::div/following-sibling::div/div/div")
    public WebElement emailType;
    //email type personal
    @FindBy(xpath = "//div[contains(@class,'v-menu__content--fixed')][4]//div[contains(text(),'Personal')]")
    public WebElement emailTypePersonal;
    //email type work
    @FindBy(xpath = "//div[contains(@class,'v-menu__content--fixed')][4]//div[contains(text(),'Work')]")
    public WebElement emailTypeWork;
    //email type other
    @FindBy(xpath = "//div[contains(@class,'v-menu__content--fixed')][4]//div[contains(text(),'Other')]")
    public WebElement emailTypeOther;

    @FindBy(xpath = "//div[@id='edit-provider-form']//label[contains(text(),'About')]/following-sibling::textarea")
    public WebElement about ;
    //Submit
    @FindBy(xpath = "//div[@id='edit-provider-form']//span[contains(text(),'Submit')]/parent::span/parent::button")
    public WebElement submit ;
    //Cancel
    @FindBy(xpath = "//span[contains(text(),'Cancel')]/parent::span/parent::button")
    public WebElement cancel ;

    @FindBy(xpath = "//div[contains(@class,'v-navigation-drawer__append')]//div[contains(@class,'v-bottom-navigation')]/button[4]")
    public WebElement closeTab;

    //Address Line 1
    @FindBy(xpath = "//label[contains(text(),'Address Line 1')]/following-sibling::input")
    public WebElement addressLine1;

    //Address Line 2
    @FindBy(xpath = "//label[contains(text(),'Address Line 2')]/following-sibling::input")
    public WebElement addressLine2;

    //City
    @FindBy(xpath = "//div[@id='edit-provider-form']//label[contains(text(),'City')]/following-sibling::input" )
    public WebElement city;

    //Zip code
    @FindBy(xpath = "//div[@id='edit-provider-form']//label[contains(text(),'Zip')]/following-sibling::input" )
    public WebElement zip;

    //State
    @FindBy(xpath = "//div[@id='edit-provider-form']//label[contains(text(),'State')]/parent::div")
    public WebElement stateButton;

    //Address type
    @FindBy(xpath = "//div[@id='edit-provider-form']//label[contains(text(),'Zip')]/parent::div/parent::div/parent::div/parent::div/parent::div/following-sibling::div/div/div")
    public WebElement addressType;

    // mailinator
    @FindBy(xpath = "//button[@class='primary-btn']")
    public WebElement goButton;
    @FindBy(xpath = "//a[normalize-space(text())='Back to Inbox']")
    public WebElement backToInbox;
    @FindBy(id = "inbox_field")
    public WebElement mailAddressField;
    @FindBy(xpath = "//*[@id='m8rguy']")
    public WebElement emptyInboxMessage;
    @FindBy(xpath = "//div[contains(@id ,'inbox_pane')]//td[contains(text(), 'Join')]")
    public WebElement joinEmail;

    @FindBy(xpath = "//button[contains(@class,'v-size--x-large primary')]")
    public WebElement plusIcon;
    @FindBy(xpath = "//div[contains(@class,'v-speed-dial__list')]/button[3]")
    public WebElement addUserButton;



    static String randomEmail = "Automation" + faker.name().username() + "@mailinator.com" ;
    static String randomName = "Automation" + faker.name().firstName();
    static String randomLastName = "Automation" + faker.name().lastName();
    static String randomAbout = "Automation " + faker.animal();
    static String randomPhoneNumber = faker.phoneNumber().cellPhone();
    static String randomNPI = faker.number().digits(8);
    static String randomAddres1 = faker.address().streetAddress();
    static String randomAddres2 = faker.address().secondaryAddress();
    static String randomCity = faker.address().city();






    public EditProvider_PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void completeNames(){
        try{
            //name
            log.info("Entering user name " + randomName);
            name.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            name.sendKeys(Keys.DELETE);
            name.sendKeys(randomName);
            //last name
            log.info("Entering user lastname " + randomLastName);
            lastName.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            lastName.sendKeys(Keys.DELETE);
            lastName.sendKeys(randomLastName);
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void completeNPI(){
        try{
            log.info("Entering NPI " + randomNPI);
            npiField.click();
            npiField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            npiField.sendKeys(Keys.DELETE);
            npiField.sendKeys(randomNPI);
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void completeQualification(String qualification){
        try{
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            //executor.executeScript("arguments[0].click();", qualificationButton);
            log.info("Entering qualification " + qualification);
            By xpathQualification = By.xpath("//div[contains(text(),'"+qualification+"')]");
            WebElement selectedQualification = driver.findElement(xpathQualification);
            selectedQualification.click();
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    public void completePhone(String phoneType){
        try {
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", prefixNumber);
            prefixNumberPlus.click();
            log.info("Entering user phone number " + randomPhoneNumber);
            phoneNumber.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            phoneNumber.sendKeys(Keys.DELETE);
            phoneNumber.sendKeys(randomPhoneNumber);
            executor.executeScript("arguments[0].click();", phoneNumberType);

            switch (phoneType){
                case "Personal":
                    phoneNumberTypePersonal.click();
                    break;
                case "Work":
                    phoneNumberTypeWork.click();
                    break;
                case "Other":
                    phoneNumberTypeOther.click();
                    break;
                default:
                    log.info("No phone type selected, Personal selected ");
                    break;
            }

        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }


    public void completeAbout(){
        about.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        about.sendKeys(Keys.DELETE);
        about.sendKeys(randomAbout);
    }

    public void submitProvider(){
        try {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", submit);
            executor.executeScript("arguments[0].click();", submit);
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    public void cancelProvider(){
        try {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", cancel);
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    public void closeTabMenu(){
        try{
            closeTab.click();
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    public void fillAddress(String state,String type){
        try{
            JavascriptExecutor executor = (JavascriptExecutor)driver;

            stateButton.click();
            log.info("Entering state " + state);

            By xpathState = By.xpath("//div[contains(text(),'"+state+"')]");

            Boolean isPresent = driver.findElements(By.xpath("//div[contains(text(),'"+state+"')]")).size() > 0;
            while(!isPresent){
                driver.findElement(By.xpath("//div[contains(text(),'Alabama')]/parent::div[contains(@class, 'v-list')]/parent::div/parent::div")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
                String s = "T";
                js.executeScript("window.scrollBy(0,-350)");
                isPresent = driver.findElements(By.xpath("//div[contains(text(),'"+state+"')]")).size() > 0;

            }
            WebElement selectedState = driver.findElement(xpathState);
            executor.executeScript("arguments[0].click();", selectedState);
            log.info("Entering Adress 1 " + randomAddres1);
            addressLine1.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            addressLine1.sendKeys(Keys.DELETE);
            addressLine1.sendKeys(randomAddres1);
            log.info("Entering Adress 2 " + randomAddres2);
            addressLine2.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            addressLine2.sendKeys(Keys.DELETE);
            addressLine2.sendKeys(randomAddres2);
            log.info("Entering City" + randomCity);
            city.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            city.sendKeys(Keys.DELETE);
            city.sendKeys(randomCity);
            String randomZip = faker.address().zipCode();
            log.info("Entering Zip" + randomZip);
            city.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            city.sendKeys(Keys.DELETE);
            zip.sendKeys(randomZip);
            addressType.click();
            log.info("Entering state " + type);
            By xpathAddressType = By.xpath("//div[contains(text(),'"+type+"')]");
            WebElement selectAddressType = driver.findElement(xpathAddressType);
            executor.executeScript("arguments[0].click();", selectAddressType);

        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }




    public void cancel(){
        try {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", cancel);
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }






}
