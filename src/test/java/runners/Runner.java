package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        //features folder path                          // stepdefinition path
        features = "C:\\Users\\asus\\IdeaProjects\\Cucumber\\src\\test\\resources\\features\\firstfeaturefile.feature",   glue =  "stepdefinitions"
)
public class Runner {




    // BU sinif Test çaseleri RUN etmek icin kullanilir
    // Ve konfiguraşyonlar icin kullanilir

}
