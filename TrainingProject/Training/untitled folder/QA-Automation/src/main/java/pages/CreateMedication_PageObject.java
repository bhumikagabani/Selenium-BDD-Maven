package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

public class CreateMedication_PageObject extends BaseClass {


    @FindBy(xpath = "//button//span[contains(text(), 'Add Medication')]/parent::span/parent::span/parent::button")
    public WebElement addMedication;

    @FindBy(xpath = "//*[@id='add-medication-form']//label[contains(text(),'Status*')]/following-sibling::div[1]")
    public WebElement status;
    @FindBy(xpath = "//label[contains(text(),'Medication Name*')]/following-sibling::input")
    public WebElement medicationName;
    @FindBy(xpath = "//label[contains(text(),'Range')]")
    public WebElement rangeRadioButton;
    @FindBy(xpath = "//label[contains(text(),'Quantity')]")
    public WebElement quantityRadioButton;
    @FindBy(xpath = "//label[contains(text(), 'Dose')]/following-sibling::input")
    public WebElement dose;
    @FindBy(xpath = "//label[contains(text(), 'Low Dose')]/following-sibling::input")
    public WebElement lowDose;
    @FindBy(xpath = "//label[contains(text(), 'High Dose')]/following-sibling::input")
    public WebElement highDose;
    @FindBy(xpath = "//*[@id='add-medication-form']//label[contains(text(),'Units')]/following-sibling::div")
    public WebElement units;
    @FindBy(xpath = "//*[@id='add-medication-form']//label[contains(text(),'Units')]/following-sibling::input")
    public WebElement unitField;
    @FindBy(xpath = "//label[contains(text(),'Route')]/parent::div/div[3]")
    public WebElement route;
    @FindBy(xpath = "//label[contains(text(),'Frequency')]/parent::div/div[3]")
    public WebElement frequency;
    @FindBy(xpath = "//label[contains(text(),'As Needed')]/parent::div/div/input")
    public WebElement asNeeded;
    @FindBy(xpath = "//label[contains(text(), 'Instructions')]/following-sibling::input")
    public WebElement instructions;
    @FindBy(xpath = "//label[contains(text(), 'Comments')]/following-sibling::input")
    public WebElement comments;
    @FindBy(xpath = "(//label[contains(text(), 'Start Date')]/parent::div/following-sibling::div/div)[2]")
    public WebElement startingDate;
    @FindBy(xpath = "(//label[contains(text(), 'End Date')]/parent::div/following-sibling::div/div)[2]")
    public WebElement endingDate;
    @FindBy(xpath = "//*[@id='add-medication-form']//label[contains(text(),'Prescriber')]/following-sibling::input")
    public WebElement prescriber;
    @FindBy(xpath = "//*[@id='add-medication-form']//span[contains(text(),'Cancel')]")
    public WebElement cancel;
    @FindBy(xpath = "//*[@id='add-medication-form']//span[contains(text(),'Submit')]")
    public WebElement submit;
    @FindBy(xpath = "//span[contains(text(), 'Other')]")
    public WebElement otherPrescription;

    static String randomName = "Automation" + faker.name().firstName();
    static String randomDose = "Automation" + faker.number().randomNumber(3,true);
    static String randomInstruction = "Automation " + faker.name().bloodGroup();
    static String randomComment = "Automation " + faker.lorem();


    JavascriptExecutor executor = (JavascriptExecutor)driver;
    public CreateMedication_PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectAddMedication() {
        try {
            addMedication.click();
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectStatus(String selectedStatus) {
        try {
            status.click();
            Thread.sleep(35000);
            log.info("Selecting status " + selectedStatus);
            By xpathStatus = By.xpath("//*[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[contains(text(),'" + selectedStatus + "')]");
            WebElement selectStatus = driver.findElement(xpathStatus);
            executor.executeScript("arguments[0].click();", selectStatus);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    public void selectRoute(String selectedRoute) {
        try {
            route.click();

            log.info("Selecting route " + selectedRoute);
            By xpathStatus = By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active')]//div[contains(text(),'" + selectedRoute + "')]");
            WebElement selectRoute = driver.findElement(xpathStatus);
            executor.executeScript("arguments[0].click();", selectRoute);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectFrequency(String selectedFrequency) {
        try {
            frequency.click();

            log.info("Selecting route " + selectedFrequency);
            By xpathFrequency = By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active')]//div[contains(text(),'" + selectedFrequency + "')]");
            WebElement selectFrequency = driver.findElement(xpathFrequency);
            executor.executeScript("arguments[0].click();", selectFrequency);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectUnits(String desiredUnits){
        try{
            unitField.sendKeys(desiredUnits);
           // units.click();
           // units.click();
            log.info("Selecting unit " + desiredUnits);
            By unitsXpath = By.xpath("//span[contains(@class,'v-list-item__mask')]");
            WebElement unitsElement = driver.findElement(unitsXpath);
            executor.executeScript("arguments[0].click();", unitsElement);
            units.click();

        }catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }



    }

    public void completeMedicationName(){
        try {
            log.info("Filling  medication field");
            medicationName.sendKeys(randomName);
        }catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void completeQuantity(){
        try {
            quantityRadioButton.click();
            dose.sendKeys(randomDose);

        }catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void completeRange(String low, String high){
        try {
           rangeRadioButton.click();
            lowDose.sendKeys(low);
            highDose.sendKeys(high);

        }catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void isNeeded(String needed){
        try {
            if(needed == "on"){
                asNeeded.click();
            }
            if(needed == "off"){
                asNeeded.click();
                Thread.sleep(1000);
                asNeeded.click();
            }

        }catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void completeRandomData(){
        try{
            comments.sendKeys(randomComment);
            instructions.sendKeys(randomInstruction);
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void completeDates(String startDate,String endDate){
        try{
            startingDate.click();
            log.info("Selecting starting date " + startingDate);
            By startingXpath = By.xpath("//button[contains(@class, 'v-btn v-btn--text v-btn--rounded theme--light')]//div[contains(text(),'" + startDate + "')]");
            WebElement startingElement = driver.findElement(startingXpath);
            executor.executeScript("arguments[0].click();", startingElement);


            endingDate.click();
            log.info("Selecting ending date " + endDate);
            By startingDate = By.xpath("//button[contains(@class, 'v-btn v-btn--text v-btn--rounded theme--light')]//div[contains(text(),'" + endDate + "')]");
            Thread.sleep(7000);
            WebElement endingElement = driver.findElement(startingDate);
            executor.executeScript("arguments[0].click();", endingElement);

        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectPrescriber(String desiredPrescriber){
        try{
            prescriber.sendKeys(desiredPrescriber);

            log.info("Selecting prescriber " + desiredPrescriber);
            By prescriberXpath = By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]");
            WebElement prescriberElement = driver.findElement(prescriberXpath);
            executor.executeScript("arguments[0].click();", prescriberElement);
            otherPrescription.click();

        }catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }

    }
    public void cancelMedication(){
        cancel.click();
    }
    public void submitMedication(){
        submit.click();
    }




    }









