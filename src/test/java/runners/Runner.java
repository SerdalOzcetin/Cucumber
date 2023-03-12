package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },

        monochrome = true,

        features = "./src/test/resources/features",            //features folder path
        glue = {"stepdefinitions","hooks"},                   // stepdefinition path
        tags = "@Excel_automation",
        dryRun = false

)
public class Runner{

        // Thic class is used to run the Test cases
        // and configurations

}
