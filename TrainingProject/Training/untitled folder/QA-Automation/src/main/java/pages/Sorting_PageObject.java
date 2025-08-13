package pages;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

import java.util.Objects;


public class Sorting_PageObject extends BaseClass  {
    @FindBy(xpath = "//*[contains(@aria-label, 'Not sorted. Activate to sort ascending.')]")
    public WebElement notSorted;
    @FindBy(xpath = "//*[contains(@aria-label, 'Sorted descending. Activate to remove sorting.')]")
    public WebElement descendingSorted;
    @FindBy(xpath = "//*[contains(@aria-label, 'Sorted ascending. Activate to sort descending.')]")
    public WebElement ascendingSorted;

    public static Logger log = LogManager.getLogger(Sorting_PageObject.class);

    String winHandleBefore = driver.getWindowHandle();

    public Sorting_PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void baseSorting() {
        try {
            log.info("Descending sorting enabled");
            descendingSorted.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());

        }
    }

    public void selectSorting(String sorting){
        if(Objects.equals(sorting, "not sorted")){
            try {
                log.info("Not sorted");
                descendingSorted.isDisplayed();
                descendingSorted.click();
                notSorted.isDisplayed();
            } catch (Exception e) {
                e.printStackTrace();
                log.error("failed due to :::" + e.getMessage());
                Assert.fail(e.getMessage());

            }
        }
        if(Objects.equals(sorting, "ascending")){
            try {
                log.info("ascending sorted");
                descendingSorted.isDisplayed();
                descendingSorted.click();
                notSorted.isDisplayed();
                notSorted.click();
                ascendingSorted.isDisplayed();
            } catch (Exception e) {
                e.printStackTrace();
                log.error("failed due to :::" + e.getMessage());
                Assert.fail(e.getMessage());

            }
        }
        if(Objects.equals(sorting, "descending")){
            try {
                descendingSorted.isDisplayed();
                descendingSorted.click();
                notSorted.isDisplayed();
                notSorted.click();
                ascendingSorted.isDisplayed();
                ascendingSorted.click();
                descendingSorted.isDisplayed();
            } catch (Exception e) {
                e.printStackTrace();
                log.error("failed due to :::" + e.getMessage());
                Assert.fail(e.getMessage());

            }
        }
    }


}

