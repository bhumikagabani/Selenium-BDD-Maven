package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    public WebDriver driver;
    public LandingPage(WebDriver driver){
      this.driver= driver;
    }
    //added locators:
    By search = By.xpath("//input[@type='search']");
    By productName = By.cssSelector("h4.product-name");

    public void searchItem(String name){// action methods
        driver.findElement(search).sendKeys(name);
    }
    public void getSearchText(String name){// action methods
        driver.findElement(search).getText();
    }public String getProductName(){// action methods
        return driver.findElement(productName).getText();
    }

}

