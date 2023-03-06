@Data_Tables
Feature: Data_Tables_Personal_Credentials

  Background: Data_Tables
    Given User Navigates to "https://editor.datatables.net/"
    Then User clicks the new button

  Scenario Outline: TC01_Data_Tables_Personal_Credentials

    And User type the first name "<FirstName>"
    And User type the last name "<LastName>"
    And User type the Position "<Position>"
    And User type the Office "<Office>"
    And User type the Extension "<Extension>"
    And User type the Start Date "<Start Date>"
    And User type the Salary "<Salary>"
    Then User clicks the create button

    Examples:Credentials
      | FirstName | LastName | Position | Office    | Extension | Start Date | Salary |
      | Snm       | ctn      | QA       | Izmir     | 1234      | 2023-03-08 | 100000 |
      | Srdl      | ctn      | QA       | Balikesir | 12348     | 2023-04-08 | 200000 |
      | Slck      | Tstn     | tester   | izmir     | 4567      | 2023-04-09 | 40000  |
      | Tb        | Cck      | tester   | izmir     | 4567      | 2023-07-09 | 60000  |
      | Smt       | ctn      | sdet     | Balikesir | 56789     | 2024-07-09 | 900000 |