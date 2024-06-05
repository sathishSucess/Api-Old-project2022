Feature: verifying Amazon login details

  Scenario: Verifying Amazon with valid data
    Given User is on the Amazon login page
    When User should perform login
      | Tv      | sony        |
      | Grocery | vegi        |
      | Android | redmi       |
      | laptop  | lenova      |
      | Iphone  | 13 iphone   |
      | Samsung | Samsung f23 |
    Then User should verify after login
