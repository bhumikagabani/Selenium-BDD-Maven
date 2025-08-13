package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

public class AddPatientCondition_PageObject extends BaseClass{

    @FindBy(xpath = "(//h2[contains(text(),'Conditions')]/following-sibling::button)[1]")
    public WebElement viewAllButton;
    @FindBy(xpath = "(//div[contains(text(),'Conditions')]/following-sibling::button)[2]")
    public WebElement addInsuranceButton;
    @FindBy(xpath = "//nav//span[contains(text(),'Submit')]/parent::span/parent::button")
    public WebElement submit;

    @FindBy(xpath = "//label[contains(text(), 'Display *')]/following-sibling::input")
    public WebElement inputDisplayAs;

    @FindBy(xpath = "//label[contains(text(), 'ICD-10 CM*')]/following-sibling::input")
    public WebElement icd;

    @FindBy(xpath = "//label[contains(text(), 'Onset')]/following-sibling::input")
    public WebElement startingDate;

    @FindBy(xpath = "//label[contains(text(), 'Abatement')]/following-sibling::input")
    public WebElement endingDate;

    @FindBy(xpath = "//label[contains(text(), 'Clinical Status')]/parent::div")
    public WebElement cLButton;
    @FindBy(xpath = "//div[contains(@id, 'edit-addresses-form')]//span[contains(text(),'Save')]]/parent::span/parent::button")
    public WebElement save;
    @FindBy(xpath = "//div[contains(@id, 'edit-addresses-form')]//span[contains(text(),'Cancel')]]/parent::span/parent::button")
    public WebElement cancel;

    static String randomAddres1 = faker.address().streetAddress();
    static String randomname = faker.lorem().fixedString(8);

    public AddPatientCondition_PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void openAll(){
        try{
            Thread.sleep(7000);
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
            viewAllButton.click();}
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    public void openAddCondition(){
        try{
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            By viewAllXpath = By.xpath("(//h2[contains(text(),'Conditions')]/following-sibling::button)[2]");
            WebElement viewAll = driver.findElement(viewAllXpath);
            executor.executeScript("arguments[0].click();", viewAll);
        }

        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void submitCondition(){
        try{
            submit.click();}catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    public void selectICD(String icd1) {
        try{
            icd.click();
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            icd. sendKeys("des");
            Thread.sleep(17000);
            By icd2 = By.xpath("//span[contains(text(),'"+icd1+"')]");
            WebElement icd3= driver.findElement(icd2);
            executor.executeScript("arguments[0].click();", icd3);

        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }}


    public void completeDates(String startDate,String endDate){
        try{
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            startingDate.click();
            log.info("Selecting starting date " + startingDate);
            By startingXpath = By.xpath("//button[contains(@class, 'v-btn v-btn--text v-btn--rounded theme--light')]//div[contains(text(),'" + startDate + "')]");
            WebElement startingElement = driver.findElement(startingXpath);
            executor.executeScript("arguments[0].click();", startingElement);

            endingDate.click();
            log.info("Selecting ending date " + endDate);
            By startingDate = By.xpath("//button[contains(@class, 'v-btn v-btn--text v-btn--rounded theme--light')]//div[contains(text(),'" + endDate + "')]");
            WebElement endingElement = driver.findElement(startingDate);
            executor.executeScript("arguments[0].click();", endingElement);

        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void fillDisplayAs(){
        try {
            inputDisplayAs.sendKeys(randomname);
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

    public void completeClinicalStatus(String cL){
        try{
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            cLButton.click();
            Thread.sleep(13000);
            By clXpath = By.xpath("//div[contains(text(),'"+cL+"')]");
            WebElement clWebElement= driver.findElement(clXpath);
            executor.executeScript("arguments[0].click();", clWebElement);

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
