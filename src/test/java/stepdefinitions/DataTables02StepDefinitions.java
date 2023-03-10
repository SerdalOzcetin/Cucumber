package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BlueRentalCars;

import java.util.List;

public class DataTables02StepDefinitions {

    BlueRentalCars blueRentalCars = new BlueRentalCars();

    @When("User types the email and password")
    public void user_types_the_email_and_password(io.cucumber.datatable.DataTable dataTable) {

        List<String> customerCredentials = dataTable.row(1);
        blueRentalCars.email.sendKeys(customerCredentials.get(0));
        blueRentalCars.password.sendKeys(customerCredentials.get(1));
    }

    @Then("User hits the login button")
    public void user_hits_the_login_button() {
      blueRentalCars.LoginButton.click();
    }

}
