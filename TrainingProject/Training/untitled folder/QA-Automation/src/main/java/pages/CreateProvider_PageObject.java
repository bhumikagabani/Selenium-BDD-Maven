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

public class CreateProvider_PageObject extends BaseClass {
    //add user page
    //name
    @FindBy(xpath = "//div[@id='add-provider-form']//div[contains(@data-tid,'FirstName')]//input")
    public WebElement name;
    //Last name
    @FindBy(xpath = "//div[@id='add-provider-form']//div[contains(@data-tid,'LastName')]//input")
    public WebElement lastName;
    //NPI
    @FindBy(xpath = "//div[@id='add-provider-form']//div[contains(@data-tid,'ProviderNPI')]//input")
    public WebElement npiField;
    //Qualification button
    @FindBy(xpath = "//div[contains(@data-tid,'Qualification')]//i[contains(@class,'mdi-menu-down')]")
    public WebElement qualificationButton;
    //Prefix number
    @FindBy(xpath = "//*[@id='add-provider-form']/section[2]/div/form/div[3]/div/h3")
    public WebElement contactLabel;

    @FindBy(xpath = "//div[contains(@class,'country-code')]//i[contains(@class,'mdi-menu-down')]")
    public WebElement prefixNumber;
    //Prefix number plus + desired number
    @FindBy(xpath = "//div[contains(@name,'Canada')]")
    public WebElement prefixNumberPlus;
    //Phone number
    @FindBy(xpath = "//div[@id='add-provider-form']//input[contains(@type,'tel')]")
    public WebElement phoneNumber;
    //Phone type
    @FindBy(xpath = "//html/body/div[1]/div[2]/div/nav[2]/div[1]/div/section[2]/div/form/div[5]/div[1]/div/div/div/div[5]/i")
    public WebElement phoneNumberType;
    //Phone type Home
    @FindBy(xpath = "//div[contains(@class,'v-select__content')]//div[contains(text(),'Home')]")
    public WebElement phoneNumberTypeHome;
    //Phone type Work
    @FindBy(xpath = "//div[contains(@class,'v-select__content')]//div[contains(text(),'Work')]")
    public WebElement phoneNumberTypeWork;
    //Phone type Mobile
    @FindBy(xpath = "//div[contains(@class,'v-select__content')]//div[contains(text(),'Mobile')]")
    public WebElement phoneNumberTypeMobile;
    //Phone type Other
    @FindBy(xpath = "//div[contains(@class,'v-select__content')]//div[contains(text(),'Other')]")
    public WebElement phoneNumberTypeOther;
    //email
    @FindBy(xpath = "//label[(text()='Email')]/following-sibling::input")
    public WebElement email;
    //email type
    @FindBy(xpath = "//*[@id='add-provider-form']/section[2]/div/form/div[7]/div[2]")
    public WebElement emailType;
    //email type personal
    @FindBy(xpath = "//div[contains(@class,'v-menu__content--fixed')][4]//div[contains(text(),'Personal')]")
    public WebElement emailTypePersonal;
    //email type work
    @FindBy(xpath = "//div/div[3]/div[2]/div[contains(text(),'Work')]")//div[contains(@class,'v-menu__content--fixed')][4]
    public WebElement emailTypeWork;
    //email type other
    @FindBy(xpath = "//div[contains(@class,'v-menu__content--fixed')][4]//div[contains(text(),'Other')]")
    public WebElement emailTypeOther;

    @FindBy(xpath = "//div[@id='add-provider-form']//label[(text()='About')]/following-sibling::textarea")
    public WebElement about ;
    //Submit
    @FindBy(xpath = "//button[contains(@data-tid,'Submit')]")
    public WebElement submit ;
    //Cancel
    @FindBy(xpath = "//button[contains(@data-tid,'Cancel')]")
    public WebElement cancel ;

    @FindBy(xpath = "//button[contains(@data-tid,'RightDrawer-Close')]")
    public WebElement closeTab;

    //Address Line 1
    @FindBy(xpath = "//label[(text()='Address Line 1')]/following-sibling::input")
    public WebElement addressLine1;

    //Address Line 2
    @FindBy(xpath = "//label[(text()='Address Line 2')]/following-sibling::input")
    public WebElement addressLine2;

    //City
    @FindBy(xpath = "//label[(text()='City')]/following-sibling::input" )
    public WebElement city;

    //Zip code
    @FindBy(xpath = "//label[(text()='Zip/Postal Code')]/following-sibling::input" )
    public WebElement zip;

    //State
    @FindBy(xpath = "//div[contains(@data-tid,'AddressState')]")
    public WebElement stateButton;

    //Address type
    @FindBy(xpath = "//*[@id='add-provider-form']/section[2]/div/form/div[9]/div[1]/div/div/div/div[3]/div")
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






    public CreateProvider_PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void completeNames(){
        try{
            //name
            log.info("Entering user name " + randomName);
            name.sendKeys(randomName);
            //last name
            log.info("Entering user lastname " + randomLastName);
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
           // executor.executeScript("arguments[0].click();", qualificationButton);
            qualificationButton.click();
            log.info("Entering qualification " + qualification);
           By xpathQualification = By.xpath("//div[contains(@class,'v-list-item__content')]//div[contains(text(),'"+qualification+"')]");
            WebElement selectedQualification = driver.findElement(xpathQualification);
            executor.executeScript("arguments[0].click();", selectedQualification);
            //selectedQualification.click();
            contactLabel.click();
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
            //executor.executeScript("arguments[0].click();", prefixNumberPlus);
            //prefixNumberPlus.click();
            log.info("Entering user phone number " + randomPhoneNumber);
            phoneNumber.sendKeys(randomPhoneNumber);
            //phoneNumberType.click();
            executor.executeScript("arguments[0].click();", phoneNumberType);
            //phoneNumberType.click();
            waitForVisibility(phoneNumberType,100);

            switch (phoneType){
                case "Home":
                    phoneNumberType.click();
                    waitForVisibility(phoneNumberType,50);
                    phoneNumberTypeHome.click();
                    break;
                case "Work":
                    phoneNumberType.click();
                    waitForVisibility(phoneNumberType,100);
                    //executor.executeScript("arguments[0].click();", phoneNumberTypeWork);
                    phoneNumberTypeWork.click();
                    break;
                case "Mobile":
                    phoneNumberType.click();
                    waitForVisibility(phoneNumberType,50);
                    phoneNumberTypeMobile.click();
                    break;
                case "Other":
                    phoneNumberType.click();
                    waitForVisibility(phoneNumberType,50);
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

    public void completeEmail(String emailTypeSelect){
        try{
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            log.info("Entering user email " + randomEmail);
            js.executeScript("arguments[0].value='"+randomEmail+"';", email);
            emailType.click();

            switch (emailTypeSelect){
                case "Personal":
                    executor.executeScript("arguments[0].click();", emailTypePersonal);
                    break;
                case "Work":
                    executor.executeScript("arguments[0].click();", emailTypeWork);
                    break;
                case "Other":
                    executor.executeScript("arguments[0].click();", emailTypeOther);
                    break;
                default:
                    executor.executeScript("arguments[0].click();", emailTypePersonal);
                    log.info("No email type selected, Personal selected ");
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
        about.sendKeys(randomAbout);
    }

    public void submitProvider(){
        try {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
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
           // WebElement selectedState = driver.findElement(xpathState);

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
            addressLine1.sendKeys(randomAddres1);
            log.info("Entering Adress 2 " + randomAddres2);
            addressLine2.sendKeys(randomAddres2);
            log.info("Entering City" + randomCity);
            city.sendKeys(randomCity);
            String randomZip = faker.address().zipCode();
            log.info("Entering Zip" + randomZip);
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
