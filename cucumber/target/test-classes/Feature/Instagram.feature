Feature: verifying Instagram login details

  Scenario: Verifying Instagram with valid data
    Given User is on the Instagram login page
    When User should perform login
    
      | useName    | password |
      | bala@123   |    56778 |
      | sathishFam | 741@85BN |
      | mani       |    45414 |
      | rio        | 741@85BN |
      | fam        |    45414 |
    Then User should verify after login
