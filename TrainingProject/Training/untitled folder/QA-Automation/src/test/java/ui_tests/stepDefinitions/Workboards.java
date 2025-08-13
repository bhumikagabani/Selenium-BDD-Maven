package ui_tests.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import pages.Workboards_PageObject;
import utilities.BaseClass;

@RunWith(Cucumber.class)
public class Workboards extends BaseClass {

    @Then("click on expandable row")
    public void clickOnExpandableRow() {
        Workboards_PageObject.selectFirstPatientExpandable();
    }
    @Then("click on first new expandable row")
    public void clickOnFirstNewExpandableRow() {
        Workboards_PageObject.selectFirstNewPatientExpandable();
    }
    @Then("click on first in progress expandable row")
    public void clickOnFirstInProgressExpandableRow() {
        Workboards_PageObject.selectFirstInProgressPatientExpandable();
    }
    @And("view Add Note with enabled status")
    public void viewAddNoteWithEnabledStatus() {
        Workboards_PageObject.checkAddNote();
    }

    @And("View Related Notes with disabled status")
    public void viewRelatedNotesWithDisabledStatus() {
        Workboards_PageObject.checkDisableRelatedNotes();
    }
    @And("View Related Notes with not disabled status")
    public void viewRelatedNotesWithNotDisabledStatus() {
        Workboards_PageObject.checkNotDisableRelatedNotes();
    }
    @And("Signed-off with enabled status")
    public void signedOffWithEnabledStatus() {
        Workboards_PageObject.checkSignOff();
    }

    @Then("view expanded row")
    public void viewExpandedRow() {
        Workboards_PageObject.checkExpandedRow();
    }

    @Then("check if patients are visible")
    public void checkIfPatientsIsVisible() {
        Workboards_PageObject.checkVisibility();
    }

    @When("click on Add Note")
    public void clickOnAddNote() {
        Workboards_PageObject.addNoteOpen();
    }

    @Then("fill note")
    public void fillNote() {
        Workboards_PageObject.fillNote();
    }

    @Then("check first related notes in board")
    public void checkFirstRelatedNotesInBoard() {
        Workboards_PageObject.viewRelatedNotes();
    }

    @And("select first note In Progress")
    public void selectFirstNoteInProgress() {
        Workboards_PageObject.firstInProgress();
    }

    @Then("sign off observation")
    public void signOffObservation() {
        Workboards_PageObject.signOff();
    }

    @And("confirm sign Off")
    public void confirmSignOff() {
        Workboards_PageObject.confirmSignOff();
    }

    @And("cancel sign Off")
    public void cancelSignOff() {
        Workboards_PageObject.cancelSignOff();
    }

    @And("select first {string} related notes in board")
    public void checkFirstEnabledRelatedNotesInBoard(String noteStatus) {
        if(noteStatus == "disabled"){
            Workboards_PageObject.firstNew();
        }
        if(noteStatus == "enabled"){
            Workboards_PageObject.firstInProgress();
        }
    }
}
