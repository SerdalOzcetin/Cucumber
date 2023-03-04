package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefinitions {
GooglePage googlePage = new GooglePage();
    @Given("User goes to Google")
    public void user_goes_to_google() {

        Driver.getDriver().get(ConfigReader.getProperty("google_url"));

    }
    @When("User searchs Iphone ın searchbox")
    public void user_searchs_ıphone_ın_searchbox() {

        googlePage.searchBox.sendKeys("Iphone" + Keys.ENTER);


    }
    @Then("Assert the results contain Iphone")
    public void assert_the_results_contain_ıphone() {

        String title = Driver.getDriver().getTitle();
        String expected = "Iphone";

        Assert.assertTrue(title.contains(expected));

    }


}
