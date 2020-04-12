package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = { "src/test/resources/FeatureFiles" }, plugin = { "pretty", "html:target/cucumber-html-report",
				"json:cucumber.json", "junit:target/cucumber.xml" }, glue = { "steps" })

public class TestRunner {

}
