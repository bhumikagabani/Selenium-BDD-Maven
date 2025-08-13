package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

public class CreateDevice_PageObject extends BaseClass {


    @FindBy(xpath = "//span[contains(text(), 'Add Device')]/parent::span/parent::span/parent::button")
    public WebElement addDeviceButton;
    @FindBy(xpath = "//label[contains(text(),'Name *')]/following-sibling::input/parent::div")
    public WebElement nameInput;
    @FindBy(xpath = "//label[contains(text(),'Serial Number *')]/following-sibling::input")
    public WebElement serialNumber;
    @FindBy(xpath = "//label[contains(text(),'Email *')]/following-sibling::input")
    public WebElement email;
    @FindBy(xpath = "//*[@id='add-device-dialog']//span[contains(text(),'Cancel')]")
    public WebElement cancel;
    @FindBy(xpath = "//span[contains(text(),'Submit')]")
    public WebElement submit;


    static String randomNumber= "Automation" + faker.number().randomNumber(5,true);



    JavascriptExecutor executor = (JavascriptExecutor)driver;
    public CreateDevice_PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectAddDevice() {
        try {
            addDeviceButton.click();
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectDevice(String selectedDevice) {
        try {
            nameInput.click();

            log.info("Selecting device " + selectedDevice);
            By xpathDevice = By.xpath("//*[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[contains(text(),'" + selectedDevice + "')]");
            WebElement selectDevice = driver.findElement(xpathDevice);
            executor.executeScript("arguments[0].click();", selectDevice);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectSerialNumber() {
        try {
            serialNumber.click();
            log.info("Selecting serial number " + randomNumber);
            serialNumber.sendKeys(randomNumber);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectEmail() {
        try {
            email.click();
            log.info("Selecting serial number " + randomNumber);
            email.clear();
            email.sendKeys(randomNumber);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectType(String selectedType) {
        try {
            log.info("Selecting device " + selectedType);
            By xpathType= By.xpath("//label[contains(text(), '" + selectedType + "')]/parent::div/div/i");
            WebElement selectType = driver.findElement(xpathType);
            executor.executeScript("arguments[0].click();", selectType);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }






    public void cancelMedication(){
        cancel.click();
    }
    public void submitDevice(){
        submit.click();
    }

}









