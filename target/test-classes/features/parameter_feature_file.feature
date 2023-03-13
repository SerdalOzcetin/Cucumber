@parameter
Feature: Search_feature

  Background: Navigate to Google
    Given User goes to Google
  @smoke
  Scenario: TC01_Google_Iphone_search
    When User searchs for "Iphone" ın searchbox
    Then Verify the results contain "Iphone"
    Then Close the application

  @smoke
  Scenario: TC02_Google_Mercedes_search
    When User searchs for "Mercedes" ın searchbox
    Then Verify the results contain "Mercedes"
    Then Close the application

  @smoke
  Scenario: TC03_Google_Cadillac_search
    When User searchs for "Cadillac" ın searchbox
    Then Verify the results contain "Cadillac"
    Then Close the application

  @smoke
  Scenario: TC04_Google_Mustang_search
    When User searchs for "Mustang" ın searchbox
    Then Verify the results contain "Mustang"
    Then Close the application