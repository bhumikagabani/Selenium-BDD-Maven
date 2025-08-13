package ui_tests.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import pages.*;
import utilities.BaseClass;

import static utilities.ConfigReader.getProperty;

@RunWith(Cucumber.class)
public class Patients extends BaseClass {

    @And("select {string} patient(s) tab(s)")
    public void selectPatientTab(String selectedTab) {
        Patient_PageObject.selectTab(selectedTab);
    }

    @Then("user click on create new medication")
    public void userClickOnCreateNewMedication() {
        CreateMedication_PageObject.selectAddMedication();
    }

    @And("select status {string}")
    public void selectStatus(String medicationStatus) {
        CreateMedication_PageObject.selectStatus(medicationStatus);
    }

    @And("fill medication name")
    public void fillMedicationName() {
        CreateMedication_PageObject.completeMedicationName();
    }

    @And("fill Quantity")
    public void fillQuantity() {
        CreateMedication_PageObject.completeQuantity();
    }

    @And("fill Range with low {string} and high {string} dose(s)")
    public void fillRange(String lowDose,String highDose) {
        CreateMedication_PageObject.completeRange(lowDose, highDose);
    }

    @And("select Unit {string}")
    public void selectUnits(String unit) {
        CreateMedication_PageObject.selectUnits(unit);
    }

    @And("select route {string}")
    public void selectRoute(String selectedRoute) {
        CreateMedication_PageObject.selectRoute(selectedRoute);
    }

    @And("select frequency {string}")
    public void selectFrequency(String selectedFrequency) {
        CreateMedication_PageObject.selectFrequency(selectedFrequency);
    }

    @And("select is needed {string}")
    public void selectIsNeeded(String needed) {
        CreateMedication_PageObject.isNeeded(needed);
    }

    @And("complete instructions and comments")
    public void completeInstructionsAndComments() {
        CreateMedication_PageObject.completeRandomData();
    }

    @And("complete starting date {string} and end date {string}")
    public void completeStartingDateAndEndDate(String starting, String ending) {
        CreateMedication_PageObject.completeDates(starting,ending);
    }

    @And("complete prescriber {string}")
    public void completePrescriber(String prescriber) {
        CreateMedication_PageObject.selectPrescriber(prescriber);
    }

    @And("cancel medication")
    public void cancelMedication() {
        CreateMedication_PageObject.cancelMedication();
    }

    @And("submit medication")
    public void submitMedication() {
        CreateMedication_PageObject.submitMedication();
    }

    @And("click on add device")
    public void clickOnAddDevice() {
        CreateDevice_PageObject.selectAddDevice();
    }

    @And("submit device")
    public void submitDevice() {
        CreateDevice_PageObject.submitDevice();
    }

    @And("select device name {string}")
    public void selectDeviceName(String deviceName) {
        CreateDevice_PageObject.selectDevice(deviceName);
    }

    @And("complete serial number")
    public void completeSerialNumber() {
        CreateDevice_PageObject.selectSerialNumber();
    }

    @And("complete email")
    public void completeEmail() {
        CreateDevice_PageObject.selectEmail();
    }

    @And("complete type {string}")
    public void completeType(String selectedType) {
        CreateDevice_PageObject.selectType(selectedType);
    }

    @And("click on Add Adress")
    public void clickOnAddAdress() {
        AddPatientAddress_PageObject.openAddAddress();
    }

    @And("submit Adress")
    public void submitAdress() {
        AddPatientAddress_PageObject.submitAddress();
    }

    @And("open view all address")
    public void openViewAllAddress() {
        CreatePatient_PageObject.seePatientAddresses();
    }


    @Then("see the created address {string}")
    public void seeTheCreatedAddres(String address) {
        CreatePatient_PageObject.findAddress(address);
    }

    @And("click on edit address")
    public void clickOnEditAddress() {
        CreatePatient_PageObject.editAddressButton();
    }

    @And("Edit Address section with {string} state and {string} type")
    public void editAddressSectionWithStateAndType(String editState, String editType) {
        AddPatientAddress_PageObject.fillAddress( editState);
    }

    @And("Edit phone and select {string} type")
    public void editPhoneAndSelectType(String editPhoneType) {
        AddPatientAddress_PageObject.completePhone(editPhoneType);
    }

    @And("Edit email and select {string} type")
    public void editEmailAndSelectType(String editEmailType) {
        AddPatientAddress_PageObject.completeEmail(editEmailType);
    }

    @And("save address")
    public void saveAddress() {
        AddPatientAddress_PageObject.save();
    }

    @And("click on Add Insurance")
    public void clickOnAddInsurance() {
        AddPatientInsurance_PageObject.openAddInsurance();

    }



    @And("select Medicare payor")
    public void selectMedicarePayor() {
        AddPatientInsurance_PageObject.selectMedicare();
    }
    @And("select Medicaid payor")
    public void selectMedicaid() {
        AddPatientInsurance_PageObject.selectMedicaid();
    }
    @And("select Private payor")
    public void selectPrivate() {
        AddPatientInsurance_PageObject.selectPrivate();
    }

    @And("click on Add Condition")
    public void clickOnAddCondition() {
        AddPatientCondition_PageObject.openAll();
        AddPatientCondition_PageObject.openAddCondition();
    }

    @And("submit Condition")
    public void submitCondition() {
        AddPatientCondition_PageObject.submitCondition();
    }

    @And("fill display As")
    public void fillDisplayAs() {
        AddPatientCondition_PageObject.fillDisplayAs();
    }

    @And("select ICB Status {string}")
    public void clinicalStatus(String icd) {
        AddPatientCondition_PageObject.selectICD(icd);
    }

    @And("complete onset date {string} and abatement date {string}")
    public void completeOnsetDateAndAbatementDate(String start, String end) {
        AddPatientCondition_PageObject.completeDates(start,end);
    }

    @And("select Clinical Status {string}")
    public void selectClinicalStatus(String clinicalStatus){
        AddPatientCondition_PageObject.completeClinicalStatus(clinicalStatus);
    }

    @Then("user click on Add Note")
    public void userClickOnAddNote() {
        AddPatientNote_PageObject.addPatientNote();
    }


    @And("select care program {string}")
    public void selectCareProgram(String careProgram) {
        AddPatientNote_PageObject.selectCareProgram(careProgram);
    }

    @And("Add note title and body")
    public void addNoteTitleAndBody() {
        AddPatientNote_PageObject.fillBodyAndText();
    }

    @And("sign and publish")
    public void signAndPublish() {
        AddPatientNote_PageObject.save();
    }

    @And("fill member ID")
    public void fillMemberID() {
        AddPatientInsurance_PageObject.fillMemberID();
    }

    @And("fill coverage start {string}")
    public void fillCoverageStart(String insuranceDate) {
        AddPatientInsurance_PageObject.fillInsuranceDate(insuranceDate);
    }

    @And("select type {string}")
    public void selectType(String insuranceType) {
        AddPatientInsurance_PageObject.fillInsuranseType(insuranceType);

    }

    @And("submit Insurance")
    public void submitInsuranse() {
        AddPatientInsurance_PageObject.submit();
    }

    @And("cancel Insurance")
    public void cancelInsuranse() {
    }

    @And("fill coverage end {string}")
    public void fillCoverageEnd(String endDate) {
        AddPatientInsurance_PageObject.fillInsuranceEndDate(endDate);
    }

    @And("fill private insurance data")
    public void fillPrivateInsuranceData() {
        AddPatientInsurance_PageObject.fillPrivateInsurance();
    }
}
