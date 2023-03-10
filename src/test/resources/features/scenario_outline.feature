@Scenario_Outline_01

Feature: Search_Feature

  Background: Navigate to Google
    Given User goes to Google

    @regression
    Scenario Outline: Search_Test
      When User searchs for "<Product>" ın searchbox
      Then Verify the results contain "<Product>"
      Then Close the application

      Examples:
      |Product|
      |Iphone |
      |Samsung|
      |Xiaomi |
      |Huawei |
      |Oppo   |
      |Vivo   |
