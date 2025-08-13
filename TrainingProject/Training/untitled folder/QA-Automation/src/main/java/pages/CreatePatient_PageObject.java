package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

public class CreatePatient_PageObject extends BaseClass {
    //add user page
    //title
    @FindBy(xpath = "//div[contains(@data-tid,'FormTitle')]")
    public WebElement titleSelection;
    @FindBy(xpath = "//div[contains(text(),'Miss')]")
    public WebElement titleSelectionMiss;
    @FindBy(xpath = "//div[contains(text(),'Mrs')]")
    public WebElement titleSelectionMrs;
    @FindBy(xpath = "//div[contains(text(),'Ms')]")
    public WebElement titleSelectionMs;
    @FindBy(xpath = "//div[contains(text(),'Mr')]")
    public WebElement titleSelectionMr;
    @FindBy(xpath = "//div[contains(text(),'Mx')]")
    public WebElement titleSelectionMx;
    @FindBy(xpath = "//div[contains(text(),'Dr')]")
    public WebElement titleSelectionDr;
    @FindBy(xpath = "//label[(text()='First Name *')]/following-sibling::input")
    public WebElement name;
    //Middle name
    @FindBy(xpath = "//label[(text()='Middle Name')]/following-sibling::input")
    public WebElement middleName;
    //Last name
    @FindBy(xpath = "//label[(text()='Last Name *')]/following-sibling::input")
    public WebElement lastName;
    //Preferred name
    @FindBy(xpath = "//label[(text()='Preferred Name')]/following-sibling::input")
    public WebElement preferredName;
    //Prefix number
    @FindBy(xpath = "//label[(text()='Date of Birth')]/parent::div")
    public WebElement birtdateButton;
    @FindBy(xpath = "//div[contains(@class,'country-code')]//i[contains(@class,'mdi-menu-down')]")
    public WebElement prefixNumber;
    //Prefix number plus + desired number
    @FindBy(xpath = "//div[contains(@name,'American')]")
    public WebElement prefixNumberPlus;
    //Phone number
    @FindBy(xpath = "//*[@id='add-patient-form']/section[2]/div/form/div[7]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/div[1]/div/div[3]/label/following-sibling::input")
    public WebElement phoneNumber;
    //Phone type
    @FindBy(xpath = "//div[contains(@data-tid,'DetailsType')]")
    public WebElement phoneNumberType;
    //Phone type personal
    @FindBy(xpath = "//div[contains(@class,'v-list-item')]//div[(text()='Home')]")
    public WebElement phoneNumberTypeHome;
    //Phone type work
    @FindBy(xpath = "//div[contains(@class,'v-list-item-title') and (text()='Work')]")
    public WebElement phoneNumberTypeWork;
    //Phone type Mobile
    @FindBy(xpath = "//div[contains(@class,'v-list-item')]//div[(text()='Mobile')]")
    public WebElement phoneNumberTypeMobile;
    //Phone type other
    @FindBy(xpath = "//div[contains(@class,'v-list-item')]//div[(text()='Other')]")
    public WebElement phoneNumberTypeOther;
    //email
    @FindBy(xpath = "//label[(text()='Email')]/following-sibling::input")
    public WebElement email;
    //email type
    @FindBy(xpath = "//label[contains(text(),'Email')]/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div[1]/div[2]/div/div")
    public WebElement emailType;
    //email type personal
    @FindBy(xpath = "//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active')]//div[contains(@class,'v-list-item__content')]/div[contains(text(),'Personal}')]")
    public WebElement emailTypePersonal;
    //email type work
    @FindBy(xpath = "//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active')]//div[contains(@class,'v-list-item__content')]/div[contains(text(),'Work')]")
    public WebElement emailTypeWork;
    //email type other
    @FindBy(xpath = "//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active')]//div[contains(@class,'v-list-item__content')]/div[contains(text(),'Other')]")
    public WebElement emailTypeOther;
    @FindBy(xpath = "//div[contains(@data-tid,'FormAccountStatus')]")
    public WebElement accountStatus;
    @FindBy(xpath = "//div[contains(@data-tid,'IdentifierType')]")
    public WebElement identifierType;
    @FindBy(xpath = "//div[contains(@class,'col-sm-4 col-12')]//label[contains(text(),'Name')]/following-sibling::input")
    public WebElement identifierName;
    @FindBy(xpath = "//label[(text()='Identifier')]/following-sibling::input")
    public WebElement identifierIdentifier;
    @FindBy(xpath ="//label[contains(text(),'Zip')]/parent::div/parent::div/parent::div/parent::div/parent::div/following-sibling::div/div/div[contains(@class, 'v-input__control')]")
    public WebElement zipType;
    @FindBy(xpath = "//div[contains(@data-tid,'PrimaryCareProvider')]")
    public WebElement careProviderButton;
    //Enrolled Program CCM
    @FindBy(xpath = "//label[contains(text(),'CCM')]/following-sibling::DIV")
    public WebElement enrolledCCM;
    //Enrolled Program RPM
    @FindBy(xpath = "//label[contains(text(),'RPM')]/following-sibling::DIV")
    public WebElement enrolledRPM;
    //Enrolled Program PCM
    @FindBy(xpath = "//label[contains(text(),'PCM')]/following-sibling::DIV")
    public WebElement enrolledPCM;
    //Enrolled Program BHI
    @FindBy(xpath = "//label[contains(text(),'BHI')]/following-sibling::DIV")
    public WebElement enrolledBHI;
    //Languages spoken
    @FindBy(xpath = "//div[contains(@data-tid,'FormLanguages')]")
    public WebElement languagesSpoken ;
    //Languages spoken english
    @FindBy(xpath = "//div[contains(@class,'v-list-item')]//div[contains(text(),'English')]")
    public WebElement languagesSpokenEnglish ;
    @FindBy(xpath = "//div[contains(@data-tid,'FormGender')]")
    public WebElement genderButton;
    //About
    @FindBy(xpath = "//label[(text()='About')]/following-sibling::textarea")
    public WebElement about ;
    //Submit
    @FindBy(xpath = "//button[contains(@data-tid,'Submit')]")
    public WebElement submit ;
    //Cancel
    @FindBy(xpath = "//button[contains(@data-tid,'Cancel')]")
    public WebElement cancel ;

    @FindBy(xpath = "//button[contains(@data-tid,'RightDrawer-Close')]")
    public WebElement closeTab;


    @FindBy(xpath = "//div[contains(@data-tid,'AddressState')]")
    public WebElement stateButton;

    //Address Line 1
    @FindBy(xpath = "//label[(text()='Address Line 1')]/following-sibling::input")
    public WebElement addressLine1;
    //Address Line 2
    @FindBy(xpath = "//label[(text()='Address Line 2')]/following-sibling::input")
    public WebElement addressLine2;

    @FindBy(xpath = "//label[(text()='City')]/following-sibling::input" )
    public WebElement city;

    //Zip code
    @FindBy(xpath = "//label[(text()='Zip/Postal Code')]/following-sibling::input" )
    public WebElement zip;

    @FindBy(xpath = "//div[(text()='1998')]")
    public WebElement birtYear;
    @FindBy(xpath = "//div[(text()='Oct')]")
    public WebElement birtMonth;
    @FindBy(xpath = "//div[(text()='30')]")
    public WebElement birtDay;

    @FindBy(xpath = "//div[contains(text(), 'Address')]/parent::div/parent::div//span[contains(text(), 'View All')]/parent::span/parent::button")
    public WebElement seePatientAddressButton;
    @FindBy(xpath = "//span[contains(text(),'Edit Addresses')]/parent::span/parent::span/parent::button")
    public WebElement editAddresses;

    static String randomEmail = "Automation" + faker.name().username() + "@mailinator.com" ;
    static String randomName = "Automation" + faker.name().firstName();
    static String randomMiddleName = "Automation" + faker.name().firstName();
    static String randomLastName = "Automation" + faker.name().lastName();
    static String randomPreferredName = "Automation" + faker.name().firstName();
    static String randomAbout = "Automation " + faker.animal();
    static String randomIdentifierName = "Automation " + faker.artist().name();
    static String randomIdentifierType = "Automation " + faker.book().title();
    static String randomPhoneNumber = faker.phoneNumber().cellPhone();
    static String randomAddres1 = faker.address().streetAddress();
    static String randomAddres2 = faker.address().secondaryAddress();
    static String randomCity = faker.address().city();


    public CreatePatient_PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectTittle(String tittle){
        try {
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            titleSelection.click();
            waitForVisibility(titleSelection,100);
            //executor.executeScript("arguments[0].click();", titleSelection);

            switch (tittle){
                case "Miss":
                    waitForVisibility(titleSelectionMiss,30);
                    titleSelectionMiss.click();
                    break;
                case "Mrs":
                    waitForVisibility(titleSelectionMrs,30);
                    titleSelectionMrs.click();
                    break;
                case "Ms":
                    waitForVisibility(titleSelectionMs,30);
                    titleSelectionMs.click();
                    break;
                case "Mr":
                    waitForVisibility(titleSelectionMr,30);
                    titleSelectionMr.click();
                    break;
                case "Mx":
                    waitForVisibility(titleSelectionMx,30);
                    titleSelectionMx.click();
                    break;
                case "Dr":
                    waitForVisibility(titleSelectionDr,5);
                    titleSelectionDr.click();
                    break;
                default:
                    log.info("No tittle selected, Miss tittle selected");
                    waitForVisibility(titleSelectionMiss,5);
                    titleSelectionMiss.click();
                    break;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void completeNames(){
        try{
            //name
            log.info("Entering user name " + randomName);
            name.sendKeys(randomName);
            //middle name
            log.info("Entering user middle name " + randomMiddleName);
            middleName.sendKeys(randomMiddleName);
            //last name
            log.info("Entering user lastname " + randomLastName);
            lastName.sendKeys(randomLastName);
            //Preferred Name
            log.info("Entering user Preferred Name " + randomPreferredName);
            preferredName.sendKeys(randomPreferredName);
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void completePhone(String phoneType){
        try {
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", prefixNumber);
            //prefixNumberPlus.click();
            waitForVisibility(prefixNumber,100);
            log.info("Entering user phone number " + randomPhoneNumber);
            phoneNumber.sendKeys(randomPhoneNumber);
            //executor.executeScript("arguments[0].click();", phoneNumberType);
            phoneNumberType.click();
            waitForVisibility(phoneNumberType,100);

            switch (phoneType){
                case "Home":
                    phoneNumberType.click();
                    waitForVisibility(phoneNumberType,50);
                    phoneNumberTypeHome.click();
                    //executor.executeScript("arguments[0].click();", phoneNumberTypeWork);
                    break;
                case "Work":
                    executor.executeScript("arguments[0].click();", phoneNumberType);
                    waitForVisibility(phoneNumberType,100);
                    phoneNumberTypeWork.click();
                    //executor.executeScript("arguments[0].click();", phoneNumberTypeWork);
                    break;
                case "Mobile":
                    phoneNumberType.click();
                    waitForVisibility(phoneNumberType,50);
                    phoneNumberTypeMobile.click();
                    break;
                case "Other":
                    phoneNumberType.click();
                    waitForVisibility(phoneNumberType,50);
                    phoneNumberTypeOther.click();
                    break;
                default:
                    log.info("No phone type selected, Personal selected ");
                    break;
            }

        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectGender(String gender) {
        try{
            genderButton.click();
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            By xpathGenderType = By.xpath("//div[contains(text(),'"+gender+"')]/parent::div/parent::div");

            WebElement selectGenderType = driver.findElement(xpathGenderType);
            executor.executeScript("arguments[0].click();", selectGenderType);}

        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }

    }

    public void completeEmail(String emailTypeSelect){
        try{
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            log.info("Entering user email " + randomEmail);
            js.executeScript("arguments[0].value='"+randomEmail+"';", email);



        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }




    public void selectEnrolledProgram(String selectedEnrolledProgram){
        try{
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            switch (selectedEnrolledProgram){
                case "CCM":
                    executor.executeScript("arguments[0].click();", enrolledCCM);
                    break;
                case "BHI":
                    executor.executeScript("arguments[0].click();", enrolledBHI);
                    break;
                case "PCM":
                    executor.executeScript("arguments[0].click();", enrolledPCM);
                    break;
                case "RPM":
                    executor.executeScript("arguments[0].click();", enrolledRPM);
                    break;
                default:
                    executor.executeScript("arguments[0].click();", enrolledCCM);;
                    log.info("No enrolled program selected, CCL selected ");
                    break;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectLanguage(String selectedLanguage){
        try{
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            //executor.executeScript("arguments[0].click();", languagesSpoken);
            languagesSpoken.click();
            js.executeScript("window.scrollBy(0,-300)");
            switch (selectedLanguage){
                case "English":
                    executor.executeScript("arguments[0].click();", languagesSpokenEnglish);
                    break;
                default:
                    log.info("No language selected, English selected ");
                    executor.executeScript("arguments[0].click();", languagesSpokenEnglish);

            }
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void completeAbout(){
        about.sendKeys(randomAbout);
    }

    public void submitPatient(){
        try {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", submit);
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    public void cancelUser(){
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
    public void closeTabMenu(){
        try{
            closeTab.click();
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }


    public void selectStatus(String statusPatient) {
        try {
            Thread.sleep(120);
            accountStatus.click();
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            By xpathStatus = By.xpath("//div[contains(text(),'" + statusPatient + "')]");
            WebElement selectStatus = driver.findElement(xpathStatus);
            executor.executeScript("arguments[0].click();", selectStatus);
        }catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectIdentidier(String identifier) {
        try{

        identifierIdentifier.sendKeys(randomIdentifierType);
        identifierType.click();
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        By xpathIdentifier = By.xpath("//div[contains(text(),'"+identifier+"')]");
        WebElement selectIdentifier = driver.findElement(xpathIdentifier);
        executor.executeScript("arguments[0].click();", selectIdentifier);
    }catch (Exception e) {
        e.printStackTrace();
        log.error("failed due to :::" + e.getMessage());
        Assert.fail(e.getMessage());
    }}

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

    public void selectCareProvider(String careProvider) {
        try{
        //careProviderButton.click();

        JavascriptExecutor executor = (JavascriptExecutor)driver;
        //executor.executeScript("arguments[0].click();", careProviderButton);
            careProviderButton.click();
        By xpathCare = By.xpath("//div[(text()='"+careProvider+"')]");
        WebElement selectCare= driver.findElement(xpathCare);
        executor.executeScript("arguments[0].click();", selectCare);

        }
        catch (Exception e) {
        e.printStackTrace();
        log.error("failed due to :::" + e.getMessage());
        Assert.fail(e.getMessage());
    }}

    public void enterBirthDate() {
        try{
            JavascriptExecutor executor = (JavascriptExecutor)driver;
        birtdateButton.click();
        //    birtdateButton.click();
        Thread.sleep(5000);
        executor.executeScript("arguments[0].click();", birtYear);
        Thread.sleep(5000);
        birtMonth.click();
        Thread.sleep(5000);
        executor.executeScript("arguments[0].click();", birtDay);
    }
        catch (Exception e) {
        e.printStackTrace();
        log.error("failed due to :::" + e.getMessage());
        Assert.fail(e.getMessage());
    }
    }

    public void seePatientAddresses(){
        try{
            driver.navigate().refresh();
            Thread.sleep(3000);
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", seePatientAddressButton);
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void findAddress(String s){
        try{

            Thread.sleep(5000);
              String a = s.toLowerCase();
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            By xpathAddressfind = By.xpath("//td/span[contains(text(), '"+a+"')]");
            WebElement addressFind = driver.findElement(xpathAddressfind);
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
    public void editAddressButton(){
        try{
            Thread.sleep(6000);
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", seePatientAddressButton);
            executor.executeScript("arguments[0].click();", editAddresses);

        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
}



