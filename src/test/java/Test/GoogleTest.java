package Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Features/FirstTest.feature",
        glue = {""},
        monochrome = true,
        dryRun = false)
public class GoogleTest {

}
