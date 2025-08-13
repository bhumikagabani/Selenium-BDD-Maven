package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

public class AddPatientInsurance_PageObject extends BaseClass{

    @FindBy(xpath = "//span[contains(text(),'Add Insurance')]/parent::span")
    public WebElement addInsuranceButton;
    @FindBy(xpath = "//nav//span[contains(text(),'Submit')]/parent::span/parent::button")
    public WebElement submit;

    @FindBy(xpath = "//label[contains(text(), 'Payor')]/following-sibling::div[2]")
    public WebElement selectPayor;
    @FindBy(xpath = "//div[contains(text(), 'Medicare')]")
    public WebElement medicare;
    @FindBy(xpath = "//div[contains(text(), 'Medicaid')]")
    public WebElement medicaid;
    @FindBy(xpath = "//div[contains(text(), 'Private')]")
    public WebElement privateoption;



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
    @FindBy(xpath = "//span[contains(text(),'Submit')]")
    public WebElement save;
    @FindBy(xpath = "//div[contains(@id, 'edit-addresses-form')]//span[contains(text(),'Cancel')]]/parent::span/parent::button")
    public WebElement cancel;
    @FindBy(xpath = "(//label[contains(text(),'Member ID')]/following-sibling::input)[1]")
    public WebElement memberID;
    @FindBy(xpath = "//label[contains(text(), 'Coverage Start')]/following-sibling::input/parent::div/parent::div/div[1]/div")
    public WebElement coverageDate;
    @FindBy(xpath = "//label[contains(text(), 'Coverage End')]/following-sibling::input")
    public WebElement coverageEndDate;
    @FindBy(xpath = "//label[contains(text(), 'Type')]/parent::div/div[3]")
    public WebElement typeInsurance;
    @FindBy(xpath = "//label[contains(text(), 'Plan Name')]/following-sibling::input")
    public WebElement planName;
    @FindBy(xpath = "//label[contains(text(), 'Plan Number')]/following-sibling::input")
    public WebElement planNumber;
    @FindBy(xpath = "//label[contains(text(), 'Group Number')]/following-sibling::input")
    public WebElement groupNumber;



    static String randomAddres1 = faker.address().streetAddress();
    static String randomAddres2 = faker.address().secondaryAddress();
    static String randomCity = faker.address().city();
    static String randomId = faker.idNumber().toString();
    static String randomPhoneNumber = faker.phoneNumber().cellPhone();
    static String randomEmail = "Automation" + faker.name().username() + "@mailinator.com" ;
    static String randomName = faker.name().username();


    public AddPatientInsurance_PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void openAddInsurance(){
        try{
            Thread.sleep(5000);
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            WebElement addInsurance = driver.findElement(By.xpath("//span[contains(text(),'Add Insurance')]/parent::span"));
            executor.executeScript("arguments[0].click();", addInsurance);
            }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void submitInsurance(){
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



   public void selectMedicare(){
        try{
        selectPayor.click();
        medicare.click();
   }catch(Exception e) {
        e.printStackTrace();
        log.error("failed due to :::" + e.getMessage());
        Assert.fail(e.getMessage());}
    }
   public void selectMedicaid(){
        try{
        selectPayor.click();
        medicaid.click();}
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    public void selectPrivate(){
        try{
        selectPayor.click();
        privateoption.click();}
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }


    public void fillInsuranseType(String type){
        try{
            typeInsurance.click();
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            log.info("Selecting starting date " + type);
            By startingXpath = By.xpath("//div[contains(text(), '" + type + "')]");
            WebElement startingElement = driver.findElement(startingXpath);
            executor.executeScript("arguments[0].click();", startingElement);

        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }


    public void fillInsuranceDate(String date){
        try{
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            By coverageDateXpath = By.xpath("//label[contains(text(), 'Coverage Start')]/following-sibling::input/parent::div/parent::div/div[1]/div");
            WebElement coverageDateWebElement = driver.findElement(coverageDateXpath);
            executor.executeScript("arguments[0].click();", coverageDateWebElement);
            log.info("Selecting starting date " + date);
            By startingXpath = By.xpath("//div[contains(text(),'" + date + "')]");
            WebElement startingElement = driver.findElement(startingXpath);
            executor.executeScript("arguments[0].click();", startingElement);
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    public void fillInsuranceEndDate(String date){
        try{
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            coverageEndDate.click();
            log.info("Selecting starting date " + date);
            By startingXpath = By.xpath("//div[contains(text(),'" + date + "')]");
            WebElement startingElement = driver.findElement(startingXpath);
            executor.executeScript("arguments[0].click();", startingElement);
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    public void fillMemberID(){
        try{
            memberID.sendKeys(randomId);
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void fillPrivateInsurance(){
        try{
            planName.sendKeys(randomName);
            planNumber.sendKeys(randomId);
            groupNumber.sendKeys(randomId);

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

    public void submit(){
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
