@Excel_automation
  Feature: Excel_Login
    Scenario: TC01_Customer_Login_Test
      Given User Navigates to "BlueRentalCars_Url"
      When User logs in with "customer_info"

    Scenario: TC02_Admin_Login_Test
      Given User Navigates to "BlueRentalCars_Url"
      When User logs in with "admin_info"