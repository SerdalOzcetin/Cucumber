package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "./src/test/resources/features",  //features folder path
        glue =  "stepdefinitions",                   // stepdefinition path
        tags = "@Data_Tables",
        dryRun = false

)
public class Runner {

    // BU sinif Test çaseleri RUN etmek icin kullanilir
    // Ve konfiguraşyonlar icin kullanilir

}
