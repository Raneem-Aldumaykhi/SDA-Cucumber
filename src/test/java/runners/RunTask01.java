package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "stepdefinitions" ,
        features = "src/test/resources/features/Task01.feature",
        tags = "@samsung and @cucumber",
        dryRun = true

)
public class RunTask01 {
}
