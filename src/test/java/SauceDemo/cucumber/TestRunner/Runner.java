package SauceDemo.cucumber.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/SauceDemo/cucumber/features",
        glue = "SauceDemo.cucumber.StepDef",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)

public class Runner {
}
