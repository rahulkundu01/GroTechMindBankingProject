Feature: Validate Contact Us functionality of Banking Domain
  @Low
  Scenario Outline: Validate Contact Us functionality of GroTechMind Banking Domain
    Given User open the URL of Banking application
    And user clicks on ContactUs button in WebPage
    And user enters name as "<contact_name>"
    And user enters email as "<contact_email>"
    And user enters phone as "<contact_phone>"
    And user enters address as "<contact_address>"
    And user enters country as "<contact_country>"
    And user enters zip as "<contact_zip>"
    When user clicks on Submit button in ContactUs page
    Then user will get a success message in ContactUs page

    Examples: 
      | contact_name | contact_email   | contact_phone | contact_address | contact_country | contact_zip |
      | Harry        | harry@gmail.com |    9811111112 | park street     | Kolkata         |       13784 |
