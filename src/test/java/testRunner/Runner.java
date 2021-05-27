package testRunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
@CucumberOptions(features={"FeatureFiles"},glue={"stepDefinition"},tags={" @tag1"},
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/Login.html","pretty",
"html:target/cucumber-reports"},monochrome=true)
public class Runner extends AbstractTestNGCucumberTests {

}
