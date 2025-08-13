package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

public class EditUser_PageObject extends BaseClass {
    //add user page
    //title
    @FindBy(xpath = "//div[contains(@data-tid,'UserForm-Title')]")
    public WebElement titleSelection;
    @FindBy(xpath = "//div[contains(text(),'Miss')]")
    public WebElement titleSelectionMiss;
    @FindBy(xpath = "//div[contains(text(),'Mrs')]")
    public WebElement titleSelectionMrs;
    @FindBy(xpath = "//div[contains(text(),'Ms)]")
    public WebElement titleSelectionMs;
    @FindBy(xpath = "//div[contains(text(),'Mr')]")
    public WebElement titleSelectionMr;
    @FindBy(xpath = "//div[contains(text(),'Mx')]")
    public WebElement titleSelectionMx;
    @FindBy(xpath = "//div[contains(text(),'Dr')]")
    public WebElement titleSelectionDr;
    @FindBy(xpath = "//div[@id='edit-user-form']//label[contains(text(),'First Name')]/following-sibling::input ")
    public WebElement name;
    //Middle name
    @FindBy(xpath = "//div[@id='edit-user-form']//label[contains(text(),'Middle Name')]/following-sibling::input ")
    public WebElement middleName;
    //Last name
    @FindBy(xpath = "//div[@id='edit-user-form']//label[contains(text(),'Last Name')]/following-sibling::input ")
    public WebElement lastName;
    //Preferred name
    @FindBy(xpath = "//div[@id='edit-user-form']//label[contains(text(),'Preferred Name')]/following-sibling::input ")
    public WebElement preferredName;
    //Prefix number
    @FindBy(xpath = "//div[contains(@class,'country-code')]//i[contains(@class,'mdi-menu-down')]")
    public WebElement prefixNumber;
    //Prefix number plus + desired number
    @FindBy(xpath = "//div[contains(@name,'American')]")
    public WebElement prefixNumberPlus;
    //Phone number
    @FindBy(xpath = "//label[(text()='Phone')]//following-sibling::input")
    public WebElement phoneNumber;
    //Phone type
    @FindBy(xpath = "//*[@id='add-user-form']/section[2]/div/form/div[4]/div[1]/div//following-sibling::input")
    public WebElement phoneNumberType;
    //Phone type Home
    @FindBy(xpath = "//div[contains(@class,'v-select__content')]//div[contains(text(),'Home')]")
    public WebElement phoneNumberTypeHome;
    //Phone type work
    @FindBy(xpath = "//div[contains(@class,'v-select__content')]//div[contains(text(),'Work')]")
    public WebElement phoneNumberTypeWork;
    //Phone type Mobile
    @FindBy(xpath = "//div[contains(@class,'v-select__content')]//div[contains(text(),'Mobile')]")
    public WebElement phoneNumberTypeMobile;
    //Phone type other
    @FindBy(xpath = "//div[contains(@class,'v-select__content')]//div[contains(text(),'Other')]")
    public WebElement phoneNumberTypeOther;
    //email
    @FindBy(xpath = "//div[@id='edit-user-form']//label[contains(text(),'Email')]/following-sibling::input")
    public WebElement email;
    //email type
    @FindBy(xpath = "//div[@id='edit-user-form']//label[contains(text(),'Email')]/parent::div/parent::div/parent::div/parent::div/parent::div/following-sibling::div/div/div")
    public WebElement emailType;
    //email type personal
    @FindBy(xpath = "//div[contains(@class,'v-menu__content--fixed')][4]//div[contains(text(),'Personal')]")
    public WebElement emailTypePersonal;
    //email type work
    @FindBy(xpath = "//div[contains(@class,'v-menu__content--fixed')][4]//div[contains(text(),'Work')]")
    public WebElement emailTypeWork;
    //email type other
    @FindBy(xpath = "//div[contains(@class,'v-menu__content--fixed')][4]//div[contains(text(),'Other')]")
    public WebElement emailTypeOther;
    //Access Role
    @FindBy(xpath = "//div[@id='edit-user-form']//label[contains(text(),'Access Role')]/following-sibling::input")
    public WebElement accessRole;
    //Access Role SYSTEM_ADMIN
    @FindBy(xpath = "//div[contains(@class,'menuable__content__active')]//div[contains(text(),'SYSTEM_ADMIN')]")
    public WebElement accessRoleSystemAdmin;
    //Access Role ORGANIZATION_ADMIN
    @FindBy(xpath = "//div[contains(@class,'menuable__content__active')]//div[contains(text(),'ORGANIZATION_ADMIN')]")
    public WebElement accessRoleOrganizationAdmin;
    //Access Role STANDARD_USER
    @FindBy(xpath = "//div[contains(@class,'menuable__content__active')]//div[contains(text(),'STANDARD_USER')]")
    public WebElement accessRoleStandardUser;
    //Access Role RESTRICTED_USER
    @FindBy(xpath = "//div[contains(@class,'menuable__content__active')]//div[contains(text(),'RESTRICTED_USER')]")
    public WebElement accessRoleRestrictedUser;
    //Access Role RESOURCE
    @FindBy(xpath = "//div[contains(@class,'menuable__content__active')]//div[contains(text(),'RESOURCE')]")
    public WebElement accessRoleResource;
    //Access Role PATIENT
    @FindBy(xpath = "//div[contains(@class,'menuable__content__active')]//div[contains(text(),'PATIENT')]")
    public WebElement accessRolePatient;
    //Designation
    @FindBy(xpath = "//label[contains(text(),'Designated Role')]/following-sibling::input")
    public WebElement designation;
    //Designation Registered Nurse
    @FindBy(xpath = "//div[contains(@class,'v-menu__content--fixed menuable__content__active')]//div[contains(text(),'Registered Nurse')]")
    public WebElement designationRegisteredNurse;
    //Designation Dietician
    @FindBy(xpath = "//div[contains(@class,'v-menu__content--fixed menuable__content__active')]//div[contains(text(),'Dietician')]")
    public WebElement designationDietician;
    //Designation Nurse Practitioner
    @FindBy(xpath = "//div[contains(@class,'v-menu__content--fixed menuable__content__active')]//div[contains(text(),'Nurse Practitioner')]")
    public WebElement designationNursePractitioner;
    //Designation Family Physician
    @FindBy(xpath = "//div[contains(@class,'v-menu__content--fixed menuable__content__active')]//div[contains(text(),'Family Physician')]")
    public WebElement designationFamilyPhysician;
    //Designation Adult Medicine Physician
    @FindBy(xpath = "//div[contains(@class,'v-menu__content--fixed menuable__content__active')]//div[contains(text(),'Adult Medicine Physician')]")
    public WebElement designationAdultMedicinePhysician;
    //Designation Case manager / Care coordinator
    @FindBy(xpath = "//div[contains(@class,'v-menu__content--fixed menuable__content__active')]//div[contains(text(),'Case manager / Care coordinator')]")
    public WebElement designationCaseManager;
    //Designation Pharmacist
    @FindBy(xpath = "//div[contains(@class,'v-menu__content--fixed menuable__content__active')]//div[contains(text(),'Pharmacist')]")
    public WebElement designationPharmacist;
    //Designation Social Worker
    @FindBy(xpath = "//div[contains(@class,'v-menu__content--fixed menuable__content__active')]//div[contains(text(),'Social Worker')]")
    public WebElement designationSocialWorker;
    //Designation Physician Assitant
    @FindBy(xpath = "//div[contains(@class,'v-menu__content--fixed menuable__content__active')]//div[contains(text(),'Physician Assitant')]")
    public WebElement designationPhysicianAssitant;
    //Designation Nurse's Aide
    @FindBy(xpath = "//div[contains(@class,'v-menu__content--fixed menuable__content__active')]//div[contains(text(),'Nurse's Aide')]")
    public WebElement designationNursesAide;
    //Designation Health information Technician
    @FindBy(xpath = "//div[contains(@class,'v-menu__content--fixed menuable__content__active')]//div[contains(text(),'Health information Technician)]")
    public WebElement designationHealthInformationTechnician;
    //Designation Technician
    @FindBy(xpath = "//div[contains(@class,'v-menu__content--fixed menuable__content__active')]//div[contains(text(),'Technician')]")
    public WebElement designationTechnician;
    //Enrolled Program CCM
    @FindBy(xpath = "//div[@id='edit-user-form']//label[contains(text(),'CCM')]/following-sibling::DIV")
    public WebElement enrolledCCM;
    //Enrolled Program RPM
    @FindBy(xpath = "//div[@id='edit-user-form']//label[contains(text(),'RPM')]/following-sibling::DIV")
    public WebElement enrolledRPM;
    //Enrolled Program PCM
    @FindBy(xpath = "//div[@id='edit-user-form']//label[contains(text(),'PCM')]/following-sibling::DIV")
    public WebElement enrolledPCM;
    //Enrolled Program BHI
    @FindBy(xpath = "//div[@id='edit-user-form']//label[contains(text(),'BHI')]/following-sibling::DIV")
    public WebElement enrolledBHI;
    //Languages spoken
    @FindBy(xpath = "//div[@id='edit-user-form']//label[contains(text(),'Languages Spoken')]/following-sibling::input")
    public WebElement languagesSpoken ;
    //Languages spoken english
    @FindBy(xpath = "//div[contains(@class,'menuable__content__active')]//div[contains(text(),'English')]")
    public WebElement languagesSpokenEnglish ;
    //About
    @FindBy(xpath = "//div[@id='edit-user-form']//label[contains(text(),'About')]/following-sibling::textarea")
    public WebElement about ;
    //Submit
    @FindBy(xpath = "//div[@id='edit-user-form']//span[contains(text(),'Submit')]/parent::span/parent::button")
    public WebElement submit ;
    //Cancel
    @FindBy(xpath = "//span[contains(text(),'Cancel')]/parent::span/parent::button")
    public WebElement cancel ;

    @FindBy(xpath = "//div[contains(@class,'v-navigation-drawer__append')]//div[contains(@class,'v-bottom-navigation')]/button[4]")
    public WebElement closeTab;
    //div[contains(@class, "v-navigation-drawer__append")]//div[contains(@class, "v-bottom-navigation")]/button[4]

    // mailinator
    @FindBy(xpath = "//button[@class='primary-btn']")
    public WebElement goButton;
    @FindBy(xpath = "//a[normalize-space(text())='Back to Inbox']")
    public WebElement backToInbox;
    @FindBy(id = "inbox_field")
    public WebElement mailAddressField;
    @FindBy(xpath = "//*[@id='m8rguy']")
    public WebElement emptyInboxMessage;
    @FindBy(xpath = "//div[contains(@id ,'inbox_pane')]//td[contains(text(), \"Join\")]")
    public WebElement joinEmail;

    @FindBy(xpath = "//button[contains(@class,'v-size--x-large primary')]")
    public WebElement plusIcon;
    @FindBy(xpath = "//div[contains(@class,'v-speed-dial__list')]/button[3]")
    public WebElement addUserButton;



    static String randomEmail = "Automation" + faker.name().username() + "@mailinator.com" ;
    static String randomName = "Automation" + faker.name().firstName();
    static String randomMiddleName = "Automation" + faker.name().firstName();
    static String randomLastName = "Automation" + faker.name().lastName();
    static String randomPreferredName = "Automation" + faker.name().firstName();
    static String randomAbout = "Automation " + faker.animal();
    static String randomPhoneNumber = faker.phoneNumber().cellPhone();


    public EditUser_PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectTittle(String tittle){
        try {
            waitForVisibility(titleSelection,5);
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", titleSelection);

            switch (tittle){
                case "Miss":
                    waitForVisibility(titleSelectionMiss,5);
                    titleSelectionMiss.click();
                    break;
                case "Mrs":
                    waitForVisibility(titleSelectionMrs,5);
                    titleSelectionMrs.click();
                    break;
                case "Ms":
                    waitForVisibility(titleSelectionMs,5);
                    titleSelectionMs.click();
                    break;
                case "Mr":
                    waitForVisibility(titleSelectionMr,5);
                    titleSelectionMr.click();
                    break;
                case "Mx":
                    waitForVisibility(titleSelectionMx,5);
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
            name.sendKeys(Keys.CONTROL + "a");
            name.sendKeys(Keys.DELETE);
            name.sendKeys(randomName);
            //middle name
            log.info("Entering user middle name " + randomMiddleName);
            middleName.sendKeys(Keys.CONTROL + "a");
            middleName.sendKeys(Keys.DELETE);
            middleName.sendKeys(randomMiddleName);
            //last name
            log.info("Entering user lastname " + randomLastName);
            lastName.sendKeys(Keys.CONTROL + "a");
            lastName.sendKeys(Keys.DELETE);
            lastName.sendKeys(randomLastName);
            //Preferred Name
            log.info("Entering user Preferred Name " + randomPreferredName);
            preferredName.sendKeys(Keys.CONTROL + "a");
            preferredName.sendKeys(Keys.DELETE);
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
            log.info("Entering user phone number " + randomPhoneNumber);
            phoneNumber.sendKeys(Keys.CONTROL + "a");
            phoneNumber.sendKeys(Keys.DELETE);
            phoneNumber.sendKeys(randomPhoneNumber);
            //executor.executeScript("arguments[0].click();", phoneNumberType);
            phoneNumberType.click();
            waitForVisibility(phoneNumberType,100);

            switch (phoneType){
                case "Home":
                    phoneNumberType.click();
                    waitForVisibility(phoneNumberType,50);
                    phoneNumberTypeHome.click();
                    break;
                case "Work":
                    phoneNumberType.click();
                    waitForVisibility(phoneNumberType,100);
                    phoneNumberTypeWork.click();
                    break;
                case "Mobile":
                    phoneNumberType.click();
                    waitForVisibility(phoneNumberType,100);
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

    public void completeEmail(String emailTypeSelect){
        try{
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            log.info("Entering user email " + randomEmail);
            email.sendKeys(randomEmail);
            emailType.click();

            switch (emailTypeSelect){
                case "Personal":
                    executor.executeScript("arguments[0].click();", emailTypePersonal);
                    break;
                case "Work":
                    executor.executeScript("arguments[0].click();", emailTypeWork);
                    break;
                case "Other":
                    executor.executeScript("arguments[0].click();", emailTypeOther);
                    break;
                default:
                    executor.executeScript("arguments[0].click();", emailTypePersonal);
                    log.info("No email type selected, Personal selected ");
                    break;
            }

        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectAccessRole(String selectedAccessRole){
        try{
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", accessRole);
            switch (selectedAccessRole){
                case "SYSTEM_ADMIN":
                    executor.executeScript("arguments[0].click();", accessRoleSystemAdmin);
                    break;
                case "ORGANIZATION_ADMIN":
                    executor.executeScript("arguments[0].click();", accessRoleOrganizationAdmin);
                    break;
                case "STANDARD_USER":
                    executor.executeScript("arguments[0].click();", accessRoleStandardUser);
                    break;
                case "RESTRICTED_USER":
                    executor.executeScript("arguments[0].click();", accessRoleRestrictedUser);
                    break;
                case "RESOURCE":
                    executor.executeScript("arguments[0].click();", accessRoleResource);
                    break;
                case "PATIENT":
                    executor.executeScript("arguments[0].click();", accessRolePatient);
                    break;
                default:
                    executor.executeScript("arguments[0].click();", accessRoleStandardUser);;
                    log.info("No access role type selected, standard role selected ");
                    break;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("failed due to :::" + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public void selectDesignation(String selectdedDesignation){
        try {
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", designation);
            switch (selectdedDesignation){
                case "Registered Nurse":
                    executor.executeScript("arguments[0].click();", designationRegisteredNurse);
                    break;
                case "Dietician":
                    executor.executeScript("arguments[0].click();", designationDietician);
                    break;
                case "Nurse Practitioner":
                    executor.executeScript("arguments[0].click();", designationNursePractitioner);
                    break;
                case "Family Physician":
                    executor.executeScript("arguments[0].click();", designationFamilyPhysician);
                    break;
                case "Adult Medicine Physician":
                    executor.executeScript("arguments[0].click();", designationAdultMedicinePhysician);
                    break;
                case "Case Manager / Care coordinator":
                    executor.executeScript("arguments[0].click();", designationCaseManager);
                    break;
                case "Pharmacist":
                    executor.executeScript("arguments[0].click();", designationPharmacist);
                    break;
                case "Social Worker":
                    executor.executeScript("arguments[0].click();", designationSocialWorker);
                    break;
                case "Nurse's Aide":
                    executor.executeScript("arguments[0].click();", designationNursesAide);
                    break;
                case "Health Information Technician":
                    executor.executeScript("arguments[0].click();", designationHealthInformationTechnician);
                    break;
                case "Technician":
                    executor.executeScript("arguments[0].click();", designationTechnician);
                    break;
                default:
                    executor.executeScript("arguments[0].click();", designationRegisteredNurse);;
                    log.info("No designation type selected, Registered Nurse selected ");
                    break;
            }

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
            executor.executeScript("arguments[0].click();", languagesSpoken);
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
        about.sendKeys(Keys.CONTROL + "a");
        about.sendKeys(Keys.DELETE);
        about.sendKeys(randomAbout);
    }

    public void submitUser(){
        try {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", submit);
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





}
