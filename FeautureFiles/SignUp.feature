Feature: Account Sign-Up Flow

Scenario: User successfully signs up
  Given I am on the sign-up page
  When I enter valid details
  And I click on submit
  Then I should see a confirmation message