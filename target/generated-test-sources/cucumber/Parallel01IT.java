import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"C:/viviennsabo/src/test/resources/loginTest/login.feature"},
plugin = {"json:target/cucumber-parallel/1.json", "html:target/cucumber-parallel/1.html"},
monochrome = false,
 tags = {"@R001"}, glue = { "StepDefinition" })
public class Parallel01IT {
}
