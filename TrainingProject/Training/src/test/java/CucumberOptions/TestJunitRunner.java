package CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",
glue = "stepDefinitions",monochrome = true,tags = "@smokeTest", plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"})
public class TestJunitRunner extends AbstractTestNGCucumberTests {
}
