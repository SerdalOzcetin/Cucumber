@failed_scenario
  Feature: to test the hooks
    Background: User goes to Url
      Given User Navigates to "google_url"

      Scenario: TC01_Google_İphone_Search
        Given User searchs for "İphone" ın searchbox
        Then Verify the results contain "İphone"
        Then Close the application

    Scenario: TC01_Google_Volvo_Search
      Given User searchs for "Volvo" ın searchbox
      Then Verify the results contain "PencilCom"
      Then Close the application