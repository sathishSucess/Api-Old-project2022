Feature: verifying Facebook login details

  Scenario: Verifying Facebook with valid data
    Given User is on the Facebook login page
    When User should perform login
      | bala@123   |    56778 |
      | sathishFam | 741@85BN |
      | mani       |    45414 |
    Then User should verify after login
