@Datatables02
Feature: Datatables02

  Scenario: Datatables02
    Given User Navigates to "BlueRentalCars_Url"
    When User types the email and password
      | email                         | password  |
      | sam.walker@bluerentalcars.com | c!fas_art |
    Then User hits the login button