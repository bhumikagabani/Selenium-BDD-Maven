package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.util.Objects;

public class Patient_PageObject extends BaseClass {
    @FindBy(xpath = "//div[contains(@class,'v-tabs-bar__content')]//span[contains(text(),'Dashboard')]")
    public WebElement dashboardTab;
    @FindBy(xpath = "//div[contains(@class,'v-tabs-bar__content')]//span[contains(text(),'Observations')]")
    public WebElement observationsTab;
    @FindBy(xpath = "//div[contains(@class,'v-tabs-bar__content')]//span[contains(text(),'Notes')]")
    public WebElement notesTab;
    @FindBy(xpath = "//div[contains(@class,'v-tabs-bar__content')]//span[contains(text(),'Medications')]")
    public WebElement medicationsTab;
    @FindBy(xpath = "//div[contains(@class,'v-tabs-bar__content')]//span[contains(text(),'Documents')]")
    public WebElement documentsTab;
    @FindBy(xpath = "//div[contains(@class,'v-tabs-bar__content')]//span[contains(text(),'Care Programs')]")
    public WebElement careProgramsTab;
    @FindBy(xpath = "//div[contains(text(),'Information')]")
    public WebElement informationTab;
    @FindBy(xpath = "//div[contains(@class,'v-tabs-bar__content')]//span[contains(text(),'More')]")
    public WebElement moreTab;
    @FindBy(xpath = "//span[contains(text(),'Devices')]")
    public WebElement devicesTab;
    @FindBy(xpath = "//tr[1]//td[3]")
    public WebElement firstPatient;


    public Patient_PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void selectTab(String tab){
        try{
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            if(Objects.equals(tab, "Devices")){

                devicesTab.click();
            }

            if(Objects.equals(tab, "all")){
                dashboardTab.click();
                Thread.sleep(2000);
                observationsTab.click();
                Thread.sleep(2000);
                notesTab.click();
                Thread.sleep(2000);
                medicationsTab.click();
                Thread.sleep(2000);
                documentsTab.click();
                Thread.sleep(2000);
                careProgramsTab.click();
                Thread.sleep(2000);
                Thread.sleep(2000);
                informationTab.click();
                Thread.sleep(2000);
                devicesTab.click();
            }
            if(Objects.equals(tab, "all")){

            }
            else {
                log.info("Selecting tab " + tab);
                By xpathAddressTab = By.xpath("//div[contains(@class,'v-tabs-bar__content')]//span[contains(text(),'" + tab + "')]");
                WebElement selectAddressTab = driver.findElement(xpathAddressTab);
                executor.executeScript("arguments[0].click();", selectAddressTab);
                executor.executeScript("arguments[0].click();", selectAddressTab);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectPatient(){
        try {

            waitForVisibility(firstPatient,10);
            firstPatient.click();
            log.info("Click for info ....");

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }

    }




}
