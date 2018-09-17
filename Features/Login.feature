Feature: Login
  As a Fanpass user
  I want to login with my credentials
  So that I can watch Sky Sport channels

  @login-valid
  Scenario: Login with a valid credentials
    Given I am an authorized Fanpass user
    When I login
    Then I should see "My Account" option

  Scenario: Login with an invalid credentials
    Given I am not an unauthorized Fanpass user
    When I try to login
    Then I should see an alert message
    And I should not be allowed to login

