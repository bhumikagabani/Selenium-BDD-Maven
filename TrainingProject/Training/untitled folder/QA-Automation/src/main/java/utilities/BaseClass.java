package utilities;

import com.github.javafaker.Faker;
import com.google.common.base.Function;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;
import java.net.URL;
import java.time.Duration;
import java.util.Map;
import java.util.List;


public class BaseClass extends Driver {

    public static final String USERNAME = "zulfikarayub_zFWO7w";
    public static final String AUTOMATE_KEY = "1XaTd3nehMwVYaYcVakR";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
    public static WebDriver driver;
    public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<>();
    public static String runtype;
    public static Logger log = LogManager.getLogger(BaseClass.class);
    public static Agent_pageObject Agent_pageObject;
    public static Main_PageObject Main_PageObject;
    public static CreateUser_PageObject CreateUser_PageObject;
    public static CreateProvider_PageObject CreateProvider_PageObject;
    public static CreateOrganization_PageObject CreateOrganization_PageObject;
    public static CreatePatient_PageObject CreatePatient_PageObject;
    public static EditUser_PageObject EditUser_PageObject;
    public static EditProvider_PageObject EditProvider_PageObject;
    public static EditOrganization_PageObject EditOrganization_PageObject;
    public static Patient_PageObject Patient_PageObject;
    public static AddPatientAddress_PageObject AddPatientAddress_PageObject;
    public static AddPatientInsurance_PageObject AddPatientInsurance_PageObject;
    public static AddPatientCondition_PageObject AddPatientCondition_PageObject;
    public static AddPatientNote_PageObject AddPatientNote_PageObject;
    public static CreateMedication_PageObject CreateMedication_PageObject;
    public static CreateDevice_PageObject CreateDevice_PageObject;
    public static Filters_PageObject Filters_PageObject;
    public static Sorting_PageObject Sorting_PageObject;
    public static Workboards_PageObject Workboards_PageObject;
    public static JavascriptExecutor js;
    public static Faker faker = new Faker();


    public BaseClass() {
    }


    public void initTestMethod() {
        driver = geTDriver();
        Agent_pageObject = new Agent_pageObject(driver);
        Main_PageObject= new Main_PageObject(driver);
        CreateUser_PageObject= new CreateUser_PageObject(driver);
        CreateProvider_PageObject = new CreateProvider_PageObject(driver);
        CreateOrganization_PageObject = new CreateOrganization_PageObject(driver);
        CreatePatient_PageObject = new CreatePatient_PageObject(driver);
        EditUser_PageObject = new EditUser_PageObject(driver);
        EditProvider_PageObject = new EditProvider_PageObject(driver);
        EditOrganization_PageObject = new EditOrganization_PageObject(driver);
        Patient_PageObject = new Patient_PageObject(driver);
        AddPatientAddress_PageObject = new AddPatientAddress_PageObject(driver);
        AddPatientInsurance_PageObject = new AddPatientInsurance_PageObject(driver);
        AddPatientCondition_PageObject = new AddPatientCondition_PageObject(driver);
        AddPatientNote_PageObject = new AddPatientNote_PageObject(driver);
        CreateMedication_PageObject = new CreateMedication_PageObject(driver);
        CreateDevice_PageObject = new CreateDevice_PageObject(driver);
        Filters_PageObject = new Filters_PageObject(driver);
        Sorting_PageObject = new Sorting_PageObject(driver);
        Workboards_PageObject = new Workboards_PageObject(driver);

        js = (JavascriptExecutor) driver;
    }

    public WebDriver geTDriver() {
        try {
            String browser;
            String browserEnvVarKey = ConfigReader.getProperty("browser_env_var_key");
            Map<String, String> env = System.getenv();
            if (env.containsKey(browserEnvVarKey)) {
                browser = env.get(browserEnvVarKey);
            } else {
                browser = ConfigReader.getProperty("browser");
            }
            runtype = ConfigReader.getProperty("runtype");
            if (runtype.equalsIgnoreCase("local")) {
                if (driver == null) {
                    switch (browser) {
                        case "chrome":
                            WebDriverManager.chromedriver().setup();
                            setDriver(new ChromeDriver());
                            break;
                        case "firefox":
                            WebDriverManager.firefoxdriver().setup();
                            setDriver(new FirefoxDriver());
                            break;
                        case "ie":
                            WebDriverManager.iedriver().setup();
                            setDriver(new InternetExplorerDriver());
                            break;
                        case "safari":
                            WebDriverManager.getInstance(SafariDriver.class).setup();
                            setDriver(new SafariDriver());
                            break;
                        case "headless-chrome":
                            ChromeOptions options = new ChromeOptions();
                            //options.setHeadless(true);
                            // options.addArguments("USER AGENT");
                            options.setHeadless(true);
                            options.addArguments("--window-size=1920,1080");
                            options.addArguments("--disable-gpu");
                            options.addArguments("--disable-extensions");
                            options.setExperimentalOption("useAutomationExtension", false);
                            options.addArguments("--proxy-server='direct://'");
                            options.addArguments("--proxy-bypass-list=*");
                            options.addArguments("--start-maximized");
                            options.addArguments("--remote-allow-origins=*");
                            options.addArguments("--headless");
                            options.addArguments("--disable-dev-shm-usage");
                            options.addArguments("--no-sandbox");
                            WebDriverManager.chromedriver().setup();
                            setDriver(new ChromeDriver(options));
                    }

                }

            } else if (runtype.equalsIgnoreCase("remote")) {
                DesiredCapabilities caps = new DesiredCapabilities();

                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Chrome");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "4.0.0");
                URL browserStackUrl = new URL(URL);
                setDriver(new RemoteWebDriver(browserStackUrl, caps));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver = getDriver();
        tdriver.set(driver);
        return newDriver();
    }


    public WebDriver newDriver() {
        return tdriver.get();
    }


    public static void waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = null;
        try {
            wait = new WebDriverWait(driver, Duration.ofSeconds(timeToWaitInSec));
        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());

        }

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement fluentWait(final WebElement webElement, int timeinsec) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeinsec)).pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });
        return element;
    }


    /**
     * Selects a random value from a dropdown list
     *
     * @param select
     * @return
     */
    public static void selectRandomTextFromDropdown(WebElement select, int whichIndex) {
        Select selectOption = new Select(select);
        log.info("selecting by index of .... " + whichIndex);
        log.info("selecting by index of .... " + selectOption.getAllSelectedOptions());
        selectOption.selectByIndex(whichIndex);

    }


    public void visit(String url) {
        geTDriver();
        initTestMethod();
        getDriver().get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    public static void getScreenShot(Scenario scenario) {


        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "image");

}
    public void validateRedText(int quantity){
        try{
            Thread.sleep(4000);
        List<WebElement> xpath = driver.findElements(By.xpath("//*[contains(@class,'v-messages__message')]"));
        int xpathCount = xpath.size();
        System.out.println("Total Elements: " + xpathCount);
        System.out.println("Desired Elements: " + quantity);
            Assert.assertEquals(xpathCount, quantity);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void snackBarValidation(String expectedSnakbar){
        try{
            Thread.sleep(4000);
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            log.info("Finding Snackbar " + expectedSnakbar);
            By xpathSnackbar= By.xpath("//div[contains(text(), '" + expectedSnakbar + "')]");
            WebElement selectSnackbar = driver.findElement(xpathSnackbar);
            executor.executeScript("arguments[0].click();", selectSnackbar);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void validationMessage(String validationMessage){
        try{
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            Thread.sleep(5000);
            log.info("Finding validation message " + validationMessage);
            By xpathMessage= By.xpath("//div[contains(text(),'" + validationMessage + "')][contains(@class, 'v-messages__message')]");
            WebElement messageWE = driver.findElement(xpathMessage);
            messageWE.isDisplayed();

        } catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

}
