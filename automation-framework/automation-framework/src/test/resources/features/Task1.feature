Feature: Jumia - Create Account
  Scenario: Validate Successful Account Creation
    Given I access Jumia Page
    When I close the popup
    And I click on Account drop down menu
    And I click on Sign in button
    And I wait till Welcome to Jumia text appears
    And I enter the e-mail
    And I press on Continue button
    And I press Skip for now in the page of Secure your account
    And I wait for Password field to be available
    And I put password
    And I put the password again to confirm password
    And I click on Continue button
    And I put First name
    And I put Last name
    And I put the phone number
    And I press Continue button
    And I press on Gender field
    And I select Female
    And I double click on birthday field
    And I write 01
    And I write 01
    And I write 1999
    And I put check mark on the Terms and Conditions
    And I press on Continue
    Then I should receive a confirmation message: Your account has been created
