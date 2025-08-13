package ui_tests.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import pages.Filters_PageObject;
import utilities.BaseClass;

import java.util.Objects;

@RunWith(Cucumber.class)
public class Filters extends BaseClass {
    public String creationType = "";

    @And("click on {string} tab")
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
        if(Objects.equals(tab, "Observation")){
            Main_PageObject.selectObservations();
            creationType = "patient";}
    }

    @And("filter {string} with {string} filter active")
    public void filterWithFilterActive(String filter, String desiredFilter) {
        if(Objects.equals(creationType, "user")){

        if(Objects.equals(filter, "organization")){
            Filters_PageObject.selectUserOrganization(desiredFilter);
        }
        if(Objects.equals(filter, "program")){
            Filters_PageObject.selectUserProgram(desiredFilter);
        }
        if(Objects.equals(filter, "role")){
            Filters_PageObject.selectUserRole(desiredFilter);
        }}
        if(Objects.equals(creationType, "provider")){
            if(Objects.equals(filter, "status")){
                Filters_PageObject.selectProviderStatus(desiredFilter);
            }
            if(Objects.equals(filter, "type")){
                Filters_PageObject.selectProviderStatus(desiredFilter);
            }
        }
        if(Objects.equals(creationType, "organization")){
            if(Objects.equals(filter, "type")){
                Filters_PageObject.selectProviderOrganization(desiredFilter);
            }
            if(Objects.equals(filter, "status")){
                Filters_PageObject.selectOrganizationStatus(desiredFilter);
            }
        }


    }


    @Then("filter results are {string}")
    public void filterResultsAre(String result) {
        Filters_PageObject.result(result);
    }
}
