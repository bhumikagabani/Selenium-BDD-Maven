package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

public class AddPatientAddress_PageObject extends BaseClass{

    @FindBy(xpath = "//span[contains(text(),'Add Address')]/parent::span/parent::span/parent::button")
    public WebElement addAddressButton;
    @FindBy(xpath = "//nav//span[contains(text(),'Submit')]/parent::span/parent::button")
    public WebElement submit;

    @FindBy(xpath = "(//label[contains(text(),'State')]/parent::div)[1]")
    public WebElement stateButton;

    @FindBy(xpath = "(//label[contains(text(),'Address Line 1')]/following-sibling::input)[1]")
    public WebElement addressLine1;
    @FindBy(xpath = "(//label[contains(text(),'Address Line 2')]/following-sibling::input)[1]")
    public WebElement addressLine2;
    @FindBy(xpath = "(//label[contains(text(),'City')]/following-sibling::input)[1]" )
    public WebElement city;
    @FindBy(xpath = "(//label[contains(text(),'Zip')]/following-sibling::input)[1]" )
    public WebElement zip;
    @FindBy(xpath = "(//div[contains(text(),'+1')]/following-sibling::input)[1] ")
    public WebElement prefixNumber;
    @FindBy(xpath = "(//div[contains(text(),'+3')])[1]")
    public WebElement prefixNumberPlus;
    @FindBy(xpath = "(//label[contains(text(),'Phone Number')]/following-sibling::input)[1]")
    public WebElement phoneNumber;
    @FindBy(xpath = "(//div[contains(@Class,'v-select')]//label[contains(text(),'Type')])[1]")
    public WebElement phoneNumberType;
    @FindBy(xpath = "(//div[contains(@class,'menuable__content__active')]//div[contains(text(),'Personal')])[1]")
    public WebElement phoneNumberTypePersonal;
    @FindBy(xpath = "(//div[contains(@class,'menuable__content__active')]//div[contains(text(),'Work')])[1]")
    public WebElement phoneNumberTypeWork;
    @FindBy(xpath = "(//div[contains(@class,'menuable__content__active')]//div[contains(text(),'Other')])[1]")
    public WebElement phoneNumberTypeOther;
    @FindBy(xpath = "(//label[contains(text(),'Email')]/following-sibling::input)[1]")
    public WebElement email;
    @FindBy(xpath = "(//label[contains(text(),'Gender')]/following-sibling::div[2])[1]")
    public WebElement genderButton;
    @FindBy(xpath = "//div[contains(@id, 'edit-addresses-form')]//span[contains(text(),'Save')]]/parent::span/parent::button")
    public WebElement save;
    @FindBy(xpath = "//div[contains(@id, 'edit-addresses-form')]//span[contains(text(),'Cancel')]]/parent::span/parent::button")
    public WebElement cancel;

    static String randomAddres1 = faker.address().streetAddress();
    static String randomAddres2 = faker.address().secondaryAddress();
    static String randomCity = faker.address().city();
    static String randomPhoneNumber = faker.phoneNumber().cellPhone();
    static String randomEmail = "Automation" + faker.name().username() + "@mailinator.com" ;

    public AddPatientAddress_PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void openAddAddress(){
        try{
        addAddressButton.click();}
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void submitAddress(){
        try{
            submit.click();}catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void fillAddress(String state){
        try{
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            stateButton.click();
            log.info("Entering state " + state);

            By xpathState = By.xpath("//div[contains(text(),'"+state+"')]");

            Boolean isPresent = driver.findElements(By.xpath("//div[contains(text(),'"+state+"')]")).size() > 0;
            while(!isPresent){
                driver.findElement(By.xpath("//div[contains(text(),'Alabama')]/parent::div[contains(@class, 'v-list')]/parent::div/parent::div")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN
                        ,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN
                        ,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN
                        ,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN
                        ,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN
                        ,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN
                        ,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN
                        ,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN
                        ,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN
                        ,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
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
            zip.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            zip.sendKeys(Keys.DELETE);
            zip.sendKeys(randomZip);

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

    public void selectGender(String gender) {
        try{
            genderButton.click();
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            By xpathAddressType = By.xpath("//div[contains(text(),'"+gender+"')]/parent::div/parent::div");

            WebElement selectAddressType = driver.findElement(xpathAddressType);
            executor.executeScript("arguments[0].click();", selectAddressType);}

        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }

    }
    public void completeEmail(String emailTypeSelect){
        try{
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            log.info("Entering user email " + randomEmail);
            email.sendKeys(randomEmail);



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

    public void save(){
        try {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();",save);
            Thread.sleep(2000);
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

}
