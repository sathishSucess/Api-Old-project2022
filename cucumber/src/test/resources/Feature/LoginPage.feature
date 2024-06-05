Feature: Verifying Adactin Login Details

  Scenario Outline: Verifying Adactin Login With Valid Data
    Given User is on the Adactin Page
    When User Should Enter "<userName>" and "<password>"
    And User Should Click Login button
    When User is on the Search Hotel Page "<location>" "<hotels>" "<roomType>" "<noOfRomms>" "<checkInDate>" "<checkOutDate>" "<adultPerRoom>" and "<childPerRoom>"
    Then User is on the Select Hotel Page to Select Hotel and Click continue button
    When User is on Book Hotel Page "<fristName>" "<lastName>" "<billingAddress>" "<cardNo>" "<cardType>" "<expireDate>" "<expireYear>" and "<cvvNumber>"
    Then User Should Print Oder Id

    Examples: 
      | userName   | password | location    | hotels         | roomType | noOfRomms | checkInDate | checkOutDate | adultPerRoom | childPerRoom | fristName | lastName | billingAddress    | cardNo           | cardType        | expireDate | expireYear | cvvNumber |
      | sathishFam | 741@85BN | London      | Hotel Sunshine | Double   | 1-One     | 25/08/2022  | 26/08/2022   | 2-Two        | 0-None       | Sathish   | Kumar    | Omr Chennai       | 2534567892534567 | VISA            | November   |       2022 |      1311 |
			| sathishFam | 741@85BN | Melbourne   | Hotel Hervey   | Double   | 2-Two     | 25/08/2022  | 26/08/2022   | 3-Three      | 3-Three      | Mohan     | Ram      | kani Madurai      | 1334567892534567 | American Express| November   |       2022 |      2511 |
      | sathishFam | 741@85BN | Brisbane    | Hotel Cornice  | Double   | 3-Three   | 25/08/2022  | 26/08/2022   | 4-Four       | 1-One        | Sab       | Den      | velea Kelembakam  | 1434567892534567 | VISA            | November   |       2022 |      1111 |
      | sathishFam | 741@85BN | Adelaide    | Hotel Creek    | Double   | 8-Eight   | 25/08/2022  | 26/08/2022   | 1-One        | 3-Three      | Sam       | Sung     | sabuthin Menabakam| 2634567892534567 | Master Card     | November   |       2022 |      1711 |
      | sathishFam | 741@85BN | New York    | Hotel Sunshine | Double   | 4-Four    | 25/08/2022  | 26/08/2022   | 3-Three      | 4-Four       | Mathew    | Raja     | Semba Trichy      | 1634567892534567 | Other           | November   |       2022 |      1711 |
      | sathishFam | 741@85BN | London      | Hotel Cornice  | Double   | 5-Five    | 25/08/2022  | 26/08/2022   | 4-Four       | 2-Two        | Mano      | Arton    | Ramsam Gundy      | 1734567892534567 | VISA            | November   |       2022 |      1911 |
      | sathishFam | 741@85BN | Los Angeles | Hotel Cornice  | Double   | 6-Six     | 25/08/2022  | 26/08/2022   | 3-Three      | 3-Three      | Dan       | Samos    | Thanam Dindukal   | 1834567892534567 | Master Card     | November   |       2022 |      1811 |
      | sathishFam | 741@85BN | London      | Hotel Sunshine | Double   | 7-Seven   | 25/08/2022  | 26/08/2022   | 1-One        | 0-None       | Master    | Gang     | Madhu Manikam Road| 1934567892534567 | VISA            | November   |       2022 |      1611 |
      | sathishFam | 741@85BN | Paris       | Hotel Hervey   | Double   | 10-Ten    | 25/08/2022  | 26/08/2022   | 4-Four       | 3-Three      | Sami      | Kan      | Omr Chennai       | 1874567892534567 | Master Card     | November   |       2022 |      1411 |
      | sathishFam | 741@85BN | London      | Hotel Cornice  | Double   | 9-Nine    | 25/08/2022  | 26/08/2022   | 2-Two        | 4-Four       | Santhos   | Kumar    | Omr Chennai       | 1004567892534567 | Other           | November   |       2022 |      2611 |
       