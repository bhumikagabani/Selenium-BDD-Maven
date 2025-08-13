package ui_tests.RunnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/ui_tests/FeatureFile", plugin = {
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, glue = {
        "ui_tests/stepDefinitions"},
       tags ="@daily",stepNotifications = true,
        monochrome = true, dryRun = false)
public class TestRunner {

}
