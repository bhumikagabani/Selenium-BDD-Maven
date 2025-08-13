package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

public class AddPatientNote_PageObject extends BaseClass{

    @FindBy(xpath = "//span[contains(text(), 'Add Note')]/parent::span/parent::span/parent::button")
    public WebElement addNoteButton;

    @FindBy(xpath = "//nav//span[contains(text(),'Submit')]/parent::span/parent::button")
    public WebElement submit;

    @FindBy(xpath = "//label[contains(text(), 'Note Title')]/following-sibling::input")
    public WebElement title;

    @FindBy(xpath = "//p")
    public WebElement body;

    @FindBy(xpath = "(//label[contains(text(), 'Effective Date')]/following-sibling::input)[1]")
    public WebElement startingDate;

    @FindBy(xpath = "(//label[contains(text(), 'Effective Time')]/following-sibling::input)[1]")
    public WebElement endingDate;

    @FindBy(xpath = "(//label[contains(text(), 'Programs')]//following-sibling::div)[3]")
    public WebElement careProgramButton;
    @FindBy(xpath = "//span[contains(text(), 'Sign and Publish')]/parent::span/parent::button")
    public WebElement save;
    @FindBy(xpath = "//span[contains(text(),'Cancel')]]/parent::span/parent::button")
    public WebElement cancel;


    static String randomName = faker.lorem().fixedString(8);
    static String randoBody = faker.lorem().characters(30);

    public AddPatientNote_PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void addPatientNote(){
        addNoteButton.click();
    }

    public void selectCareProgram(String careProgram){
        careProgramButton.click();
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        By xpathCareProgram = By.xpath("//div[contains(text(), '"+careProgram+"')]");
        WebElement careProgramWebElement = driver.findElement(xpathCareProgram);
        executor.executeScript("arguments[0].click();", careProgramWebElement);
    }

    public void fillBodyAndText(){
        title.sendKeys(randomName);
        body.sendKeys(randoBody);

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
            save.click();
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

}
