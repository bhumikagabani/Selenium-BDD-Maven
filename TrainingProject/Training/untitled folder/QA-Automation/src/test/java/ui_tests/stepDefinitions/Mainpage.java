


package ui_tests.stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import pages.*;
import utilities.BaseClass;
import java.util.Objects;


@RunWith(Cucumber.class)
public class Mainpage extends BaseClass {


    public String creationType = "";
    public String searchedName = "";

    @Then("user should see user tab")
    public void userLookUserTab() throws InterruptedException {
        Main_PageObject.seeUserTab();
        creationType = "user";

    }


    @And("select and deselect options")
    public void selectAndDeselectOptions() {
        Main_PageObject.selectFirstthree();
        Main_PageObject.selectAll();
        Main_PageObject.closeAll();

    }

    @And("user choice provider tab")
    public void userChoiceProviderTab() {
        Main_PageObject.selectProviderTab();
    }

    @And("user choose {string} tab")
    public void userChoiceTab(String tab)throws InterruptedException {
        if(Objects.equals(tab, "provider")){
        Main_PageObject.selectProviderTab();
        creationType = "provider";}
        if(Objects.equals(tab, "user")){
            Main_PageObject.selectUserTab();
            creationType = "user";}
        if(Objects.equals(tab, "organization")){
            Main_PageObject.selectOrganizationTab();
        creationType = "organization";}
        if(Objects.equals(tab, "patient")){
            Main_PageObject.selectPatientTab();
            creationType = "patient";}
        if(Objects.equals(tab, "Directory")){
            Main_PageObject.selectDirectoryTab();
            creationType = "directory";}
        if(Objects.equals(tab, "rpm")){
            Main_PageObject.selectRpmtab();
            creationType = "rpm";}
        if(Objects.equals(tab, "Workboard")){
            Main_PageObject.selectWorkboard();
            }
        if(Objects.equals(tab, "Adherence")){
            Main_PageObject.selectAdherence();
        }
        if(Objects.equals(tab, "observations")){
            Main_PageObject.selectObservations();
        }
        if(Objects.equals(tab, "atrisk")) {
            Main_PageObject.selectAtRisktab();
        }

    }



    @And("user go to add user section")
    public void userGoToAddUserSection() {
        Main_PageObject.openAddUser();
        creationType = "user";

    } @And("user go to add provider section")
    public void userGoToAddProviderSection() {
        Main_PageObject.openAddProvider();
        creationType = "provider";
    }
    @And("user go to add organization section")
    public void userGoToAddOrganizationSection() {
        Main_PageObject.openAddOrganization();
        creationType = "organization";
    }

    @And("user go to add patient section")
    public void userGoToAddSection() {
            Main_PageObject.openAddPatient();
            creationType = "patient";

    }

    @And("select title {string}")
    public void selectTitle(String tittle) {
        if(creationType == "user"){
            CreateUser_PageObject.selectTittle(tittle);
        }
        if(creationType == "editUser"){
            EditUser_PageObject.selectTittle(tittle);
        }
        if(creationType == "patient"){
            CreatePatient_PageObject.selectTittle(tittle);
        }
    }

    @And("complete all names")
    public void completeAllNames() {
        if(creationType == "user") {
            CreateUser_PageObject.completeNames();
        }
        if(creationType == "provider"){
            CreateProvider_PageObject.completeNames();
        }
        if(creationType == "organization"){
            CreateOrganization_PageObject.completeNames();
        }
        if(creationType == "editUser"){
            EditUser_PageObject.completeNames();
        }
        if(creationType == "editProvider"){
            EditProvider_PageObject.completeNames();
        }
        if(creationType == "editOrganization"){
            EditOrganization_PageObject.completeNames();
        }
        if(creationType == "patient"){
            CreatePatient_PageObject.completeNames();
        }

    }

    @And("complete phone and select {string} type")
    public void completePhone(String phoneType) {
        if(creationType == "user") {
            CreateUser_PageObject.completePhone(phoneType);
        }
        if(creationType == "provider"){
            CreateProvider_PageObject.completePhone(phoneType);
        }
        if(creationType == "organization"){
            CreateOrganization_PageObject.completePhone(phoneType);
        }
        if(creationType == "editUser"){
            EditUser_PageObject.completePhone(phoneType);
        }
        if(creationType == "editProvider"){
            EditProvider_PageObject.completePhone(phoneType);
        }
        if(creationType == "editOrganization"){
            EditOrganization_PageObject.completePhone(phoneType);
        }
        if(creationType == "patient"){
            CreatePatient_PageObject.completePhone(phoneType);
        }

    }

    @And("complete email and select {string} type")
    public void completeEmail(String emailType) {
        if(creationType == "user") {
            CreateUser_PageObject.completeEmail(emailType);
        }
        if(creationType == "provider"){
            CreateProvider_PageObject.completeEmail(emailType);
        }
        if(creationType == "organization"){
            CreateOrganization_PageObject.completeEmail(emailType);
        }
        if(creationType == "EditOrganization"){
            EditOrganization_PageObject.completeEmail(emailType);
        }
        if(creationType == "patient"){
            CreatePatient_PageObject.completeEmail(emailType);
        }
        else{
            CreatePatient_PageObject.completeEmail(emailType);
        }
    }

    @And("select designation {string}")
    public void selectDesignation(String designation) {

        if(creationType == "editUser"){
            EditUser_PageObject.selectDesignation(designation);
        }
        if(creationType == "user"){
            CreateUser_PageObject.selectDesignation(designation);
        }
    }

    @And("select access role {string}")
    public void selectAccessRole(String accessRole) {

        if(creationType == "editUser"){
            EditUser_PageObject.selectAccessRole(accessRole);
        }
        if(creationType == "user"){
            CreateUser_PageObject.selectAccessRole(accessRole);
        }

    }

    @And("select enrolled program {string}")
    public void selectEnrolledProgram(String selectedEnrolledProgram) {

        if(creationType == "editUser"){
            EditUser_PageObject.selectEnrolledProgram(selectedEnrolledProgram);
        }
        if(creationType == "user"){
            CreateUser_PageObject.selectEnrolledProgram(selectedEnrolledProgram);
        }
        if(creationType == "patient"){
            CreatePatient_PageObject.selectEnrolledProgram(selectedEnrolledProgram);
        }
    }

    @And("select language spoken {string}")
    public void selectLanguage(String selectedLanguage) {

        if(creationType == "editUser"){
            EditUser_PageObject.selectLanguage(selectedLanguage);
        }
        if(creationType == "user"){
            CreateUser_PageObject.selectLanguage(selectedLanguage);
        }
        if(creationType == "patient"){
            CreatePatient_PageObject.selectLanguage(selectedLanguage);
        }
    }

    @And("complete about section")
    public void completeAboutSection() {
        if(creationType == "user") {
            CreateUser_PageObject.completeAbout();
        }
        if(creationType == "provider"){
            CreateProvider_PageObject.completeAbout();
        }
        if(creationType == "editProvider"){
            EditProvider_PageObject.completeAbout();
        }
        if(creationType == "organization"){
            CreateOrganization_PageObject.completeAbout();
        }
        if(creationType == "editUser"){
            EditUser_PageObject.completeAbout();
        }
        if(creationType == "editOrganization"){
            EditOrganization_PageObject.completeAbout();
        }
    }

    @And("submit")
    public void submitTheUser() {


        if(creationType == "user") {
            CreateUser_PageObject.submitUser();

        }
        if(creationType == "provider"){
            CreateProvider_PageObject.submitProvider();

        }
        if(creationType == "editProvider"){
            EditProvider_PageObject.submitProvider();

        }
        if(creationType == "editUser"){
            EditUser_PageObject.submitUser();

        }
        if(creationType == "editOrganization"){
            EditOrganization_PageObject.submitOrganization();

        }
        if(creationType == "organization"){
            CreateOrganization_PageObject.submitOrganization();
            CreateOrganization_PageObject.closeTabMenu();
        }
        if(creationType == "patient"){
            CreatePatient_PageObject.submitPatient();
            CreatePatient_PageObject.closeTabMenu();
        }


    }

    @And("cancel")
    public void cancelTheUserCreation() {
        if(creationType == "user") {
            CreateUser_PageObject.cancelUser();

        }
        if(creationType == "provider"){
            CreateProvider_PageObject.cancel();

        }
        if(creationType == "editProvider"){
            EditProvider_PageObject.cancel();
        }

        if(creationType == "editUser"){
            EditUser_PageObject.cancelUser();
           
        }

        
    }



    @And("validate email")
    public void validateEmail() {

        Main_PageObject.newWindow();
        Main_PageObject.navigateToMalinator();
        Main_PageObject.MailinatorChecking();


    }

    @And("complete NPI")
    public void completeNPI() {
        if(creationType == "provider"){
            CreateProvider_PageObject.completeNPI();
        }
        if(creationType == "editProvider"){
            EditProvider_PageObject.completeNPI();
        }

    }

    @And("complete Qualification as {string}")
    public void completeQualificationAs(String selectedQualification) {

        if(creationType == "provider"){
            CreateProvider_PageObject.completeQualification(selectedQualification);
        }
        if(creationType == "editProvider"){
            EditProvider_PageObject.completeQualification(selectedQualification);
        }
    }

    @And("Complete Address section with {string} state and {string} type")
    public void completeAddressSectionWithState(String state, String type) {
        if(creationType == "provider"){
            CreateProvider_PageObject.fillAddress(state,type);
        }
        if(creationType == "editProvider"){
            EditProvider_PageObject.fillAddress(state,type);
        }
        if(creationType == "organization"){
            CreateOrganization_PageObject.fillAddress( state,type);
        }
        if(creationType == "editOrganization"){
            EditOrganization_PageObject.fillAddress( state,type);
        }
        if(creationType == "patient"){
            CreatePatient_PageObject.fillAddress( state);
        }
    }

    @And("complete organization type {string}")
    public void completeOrganizationType(String organizationType) {
        if(creationType == "organization") {
            CreateOrganization_PageObject.completeOrganizationType(organizationType);
        }
        if(creationType == "editOrganization") {
            EditOrganization_PageObject.completeOrganizationType(organizationType);
        }
    }

    @And("select first")
    public void selectFirst() {
        if (creationType == "user"){
            Main_PageObject.selectEditable();
        }
        if (creationType == "provider"){
            Main_PageObject.selectEditable();
        }
        if (creationType == "organization"){
            Main_PageObject.selectEditable();
        }
        if (creationType == "patient"){
            Main_PageObject.selectEditable();
        }
    }


    @And("click on edit")
    public void clickOnEdit() {
        if (creationType == "user"){
            Main_PageObject.clickEdit();
            creationType = "editUser";

        }
        if (creationType == "provider"){
            Main_PageObject.clickEdit();
            creationType = "editProvider";
        }
        if (creationType == "organization"){
            Main_PageObject.clickEdit();
            creationType = "editOrganization";
        }
    }

    @And("find {string} in the speed dial")
    public void findInTheSpeedDial(String findet) {
        if (creationType == "patient"){
            Main_PageObject.findPatient(findet);
        } else{
        Main_PageObject.find(findet);
        }
        searchedName = findet;
    }

    @And("search result is {string}")
    public void searchResultIs(String searchResult) {

        Main_PageObject.checkSearch(searchResult, searchedName);
    }


    @And("select account status {string}")
    public void selectAccountStatus(String statusPatient) {
        CreatePatient_PageObject.selectStatus(statusPatient);
    }

    @And("select gender {string}")
    public void selectGender(String gender) {
        CreatePatient_PageObject.selectGender(gender);
    }

    @And("complete identifier {string}")
    public void completeIdentifier(String identifier) {
        CreatePatient_PageObject.selectIdentidier(identifier);
    }

    @And("select care provider {string}")
    public void selectCareProvider(String careProvider) {
        CreatePatient_PageObject.selectCareProvider(careProvider);
    }
    @And("complete birth date")
    public void completeBirthDate() {
        CreatePatient_PageObject.enterBirthDate();
    }

    @And("see details")
    public void seeDetails() {
        if (creationType == "patient"){
            Patient_PageObject.selectPatient();
        }
    }


    @And("select name sort {string}")
    public void selectNameSort(String sorting) {
        Sorting_PageObject.selectSorting(sorting);
    }

    @Then("{string} count is {string}")
    public void countIs(String tab, String count) {
        Main_PageObject.checkCount(tab,count);
    }

    @Then("see validation message")
    public void seeValidationMessage() {
        CreateUser_PageObject.validationMessage();
    }


    @Then("see the snackbar message {string}")
    public void seeTheSnackbarMessage(String snackbarMessage) {
        Main_PageObject.snackBarValidation(snackbarMessage);
    }

    @Then("see the validation message {string}")
    public void seeTheValidationMessage(String validationMessage) {
        Main_PageObject.validationMessage(validationMessage);
    }
}
