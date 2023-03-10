package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DataTablesPage;
import utilities.ConfigReader;
import utilities.Driver;

public class DataTablesStepDefinitions {
DataTablesPage dataTablesPage = new DataTablesPage();
    @Given("User Navigates to {string}")
    public void user_navigates_to(String string) {
        Driver.getDriver().get(string);
    }

    @Then("User clicks the new button")
    public void user_clicks_the_new_button() {
       dataTablesPage.NewButton.click();
    }

    @Then("User type the first name {string}")
    public void user_type_the_first_name(String string) {
        dataTablesPage.FirstName.sendKeys(string);
    }
    @Then("User type the last name {string}")
    public void user_type_the_last_name(String string) {
        dataTablesPage.LastName.sendKeys(string);
    }

    @Then("User type the Position {string}")
    public void user_type_the_position(String string) {
        dataTablesPage.Position.sendKeys(string);
    }
    @Then("User type the Office {string}")
    public void user_type_the_office(String string) {
        dataTablesPage.Office.sendKeys(string);
    }
    @Then("User type the Extension {string}")
    public void user_type_the_extension(String string) {
        dataTablesPage.Extension.sendKeys(string);
    }
    @Then("User type the Start Date {string}")
    public void user_type_the_start_date(String string) {
        dataTablesPage.StartDate.sendKeys(string + Keys.TAB);
    }
    @Then("User type the Salary {string}")
    public void user_type_the_salary(String string) {
        dataTablesPage.Salary.sendKeys(string);
    }

    @Then("User clicks the create button")
    public void user_cliks_the_create_button(){
        dataTablesPage.CreateButton.click();
    }

    @Then("Verify the Personal credentials with {string}and{string}")
    public void verifyThePersonalCredentialsWithAnd(String arg0, String arg1) {

        dataTablesPage.SearchBox.sendKeys(arg0+" "+arg1);
        Assert.assertTrue(dataTablesPage.verifyName.getText().contains(arg0+" "+arg1));
    }
}
