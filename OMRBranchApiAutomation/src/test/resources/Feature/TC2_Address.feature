@Address
Feature: Address Module API Automation

  Scenario Outline: Verify add new address and get the address_id to the application through API
    Given User should add headers and bearer authourization for accessing address endpoint
    When User should add request body for Add new address "<first_name>", "<last_name>", "<mobile>", "<apartment>", "<state>", "<city>", "<country>", "<zipcode>", "<address>" and "<address_type>"
    And User should "POST" request for add new address
    Then User verify the status code is 200
    And User verify the create address response message matches "Address added successfully" and get the address_id

    Examples: 
      | first_name | last_name | mobile     | apartment           | state | city | country | zipcode | address   | address_type |
      | Sandi      | saba      | 8678967777 | AconMartinApartment |    31 | 3131 |     102 |   62121 | cuddalore | S.kHome      |

  Scenario Outline: Verify update address to the application through API
    Given User should add headers and bearer authourization for accessing address endpoint
    When User should add request body for Update new address "<first_name>", "<last_name>", "<mobile>", "<apartment>", "<state>", "<city>", "<country>", "<zipcode>", "<address>" and "<address_type>"
    And User should "PUT" request for update existing address
    Then User verify the status code is 200
    And User verify the update address response message matches "Address updated successfully"

    Examples: 
      | first_name | last_name | mobile     | apartment       | state | city | country | zipcode | address | address_type |
      | Pandi      | Deva      | 9845212332 | Mohan Apartment |    31 | 3131 |     102 |   62121 | madurai | s.k office   |

  Scenario: Verify get address to the application through API
    Given User should add headers and bearer authourization for accessing address endpoint
    When User should "GET" request for getting all address
    Then User verify the status code is 200
    And User verify the get address response message matches "OK"

  Scenario: Verify delete address to the application through API
    Given User should add headers and bearer authourization for accessing address endpoint
    When User should add request body for Delete address using "<address_id>"
    And User should "DELETE" request for deleting the generated address
    Then User verify the status code is 200
    And User verify the delete address response message matches "Address deleted successfully"
