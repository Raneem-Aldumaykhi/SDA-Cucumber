package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "stepdefinitions" ,
        features = "src/test/resources/features",
        plugin ={
                "html:cucumber-reports/html/report.html",
                "json:cucumber-reborts/json/report.jason",
                "pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        dryRun = false
)
public class Runner {


}
