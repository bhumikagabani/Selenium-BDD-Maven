package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.util.Objects;

public class Workboards_PageObject extends BaseClass {

    @FindBy(xpath = "(//button[contains(@data-tid,'RpmObservationDataTable-AddNote-Button')])[1]")
    public WebElement addNote;

    @FindBy(xpath = "(//button[contains(@class,'disabled')][contains(@data-tid,'RpmObservationDataTable-ViewRelatedNotes-Button')])[1]")
    public WebElement viewRelatedNotesDisabled;

    @FindBy(xpath = "(//button[contains(@data-tid,'RpmObservationDataTable-SignOff-Button')])[1]")
    public WebElement signOffButton;


    @FindBy(xpath = "//td[contains(@class,'d-block d-md-table-cell')]")
    public WebElement viewExpandedRow;
    @FindBy(xpath = "(//div[contains(@class,'overflow-y-auto overflow-x-hidden')])")
    public WebElement relatedNotesSlide;
    @FindBy(xpath = "(//button[not(contains(@class,'disabled'))][contains(@data-tid,'RpmObservationDataTable-ViewRelatedNotes-Button')])[1]")
    public WebElement viewRelatedNotes;

    @FindBy(xpath = "(//button[contains(@class,'mb-4 mr-4')])")
    public WebElement backofRelatedNotes;
    @FindBy(xpath = "(//span[contains(text(), 'In Progress')]/parent::td/following-sibling::td/button)[1]")
    public WebElement firstInprogress;
    //firstNew
    @FindBy(xpath = "(//span[contains(text(), 'New')]/parent::td/following-sibling::td/button)[1]")
    public WebElement firstNew;
    @FindBy(xpath = "(//button[contains(@class,'v-btn--icon v-btn--round ')])[4]")
    public WebElement firstRow;
    @FindBy(xpath = "(//div[contains(@class,'ProseMirror')])")
    public WebElement patientNote;

    @FindBy(xpath = "//*[@id='vueConfirm']//button[contains(text(), 'Yes')]")
    public WebElement confirmSignOff;
    @FindBy(xpath = "//*[@id='vueConfirm']//button[contains(text(), 'No')]")
    public WebElement cancelSignOff;
    public Workboards_PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    JavascriptExecutor executor = (JavascriptExecutor)driver;


    public void checkAddNote(){
        try {
            addNote.isDisplayed();

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());

        }
    }

    public void checkDisableRelatedNotes(){
        try {
            viewRelatedNotesDisabled.isDisplayed();

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());

        }
    }
    public void checkNotDisableRelatedNotes(){
        try {
            viewRelatedNotes.isDisplayed();

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());

        }
    }
    public void checkSignOff(){
        try {
            signOffButton.isDisplayed();

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());

        }
    }

    public void checkExpandedRow(){
        try {
            Thread.sleep(12000);
            viewExpandedRow.isDisplayed();

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void checkVisibility() {
        try {
            firstRow.isDisplayed();


        } catch (Exception e) {
            e.printStackTrace();
            log.error("Results are not visible, reloading page to continue");
            Main_PageObject.selectAdherence();
            Main_PageObject.selectObservations();


        }
    }
    public void addNoteOpen() {
        try {
            addNote.click();

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());

        }
    }
    public void fillNote() {
        try {
            patientNote.sendKeys("Patient Info");

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());

        }
    }
    public void selectFirstPatientExpandable(){
        try {
            Thread.sleep(20000);
            firstNew.isDisplayed();
            By xpathFirstPatientExpandable = By.xpath("(//button[contains(@class,'v-btn--icon v-btn--round ')])[4]");
            WebElement firstPatientExpandable = driver.findElement(xpathFirstPatientExpandable);
            executor.executeScript("arguments[0].click();", firstPatientExpandable);

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());

        }
    }
    public void selectFirstNewPatientExpandable() {
        try {
            Thread.sleep(20000);
            firstNew.isDisplayed();
            By xpathFirstNewPatientExpandable = By.xpath("(//span[contains(text(), 'New')]/parent::td/following-sibling::td/button)[1]");
            WebElement firstNewPatientExpandable = driver.findElement(xpathFirstNewPatientExpandable);
            executor.executeScript("arguments[0].click();", firstNewPatientExpandable);

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());

        }
    }

    public void viewRelatedNotes(){
        try {
            firstInprogress.click();
            viewRelatedNotes.click();
            relatedNotesSlide.isDisplayed();
            Thread.sleep(20000);
            backofRelatedNotes.click();

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());

        }

    }
    public void selectFirstInProgressPatientExpandable() {
        try {
            Thread.sleep(20000);
            firstInprogress.isDisplayed();
            By xpathFirstInProgressPatientExpandable = By.xpath("(//span[contains(text(), 'In Progress')]/parent::td/following-sibling::td/button)[1]");
            WebElement firstInProgressPatientExpandable = driver.findElement(xpathFirstInProgressPatientExpandable);
            executor.executeScript("arguments[0].click();", firstInProgressPatientExpandable);

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());

        }
    }
    public void firstNew(){
        try {
            firstNew.click();

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());

        }

    }
    public void firstInProgress(){
        try {

            firstInprogress.click();


        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());

        }

    }


    public void signOff(){
        try {
            //Thread.sleep(1000);
            //signOffButton.click();
           // Thread.sleep(3000);
            By xpathsignoff = By.xpath("(//button[contains(@data-tid,'RpmObservationDataTable-SignOff-Button')])[1]");
            WebElement signoff = driver.findElement(xpathsignoff);
            executor.executeScript("arguments[0].click();", signoff);


        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());

        }

    }

    public void confirmSignOff(){
        try {
            confirmSignOff.click();

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());

        }

    }
    public void cancelSignOff(){
        try {
            cancelSignOff.click();

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());

        }

    }

}
