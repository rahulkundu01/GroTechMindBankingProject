#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Validate Signup functionality of Banking Domain
  @High
  Scenario Outline: Validate Signup functionality of GroTechMind Banking Domain
    Given User open the URL of Banking application
    And user clicks on SignUp Button in WebPage
    And user enters firstname as "<firstname>"
    And user enters lastname as "<lastname>"
    And user enters phone number as "<phonenumber>"
    And user enters Date of Birth as "<DOB>"
    And user selects the gender
    And user enters city name as "<cityname>"
    And user enters the user id as "<uid>"
    And user enters the password as "<password>"
    When user clicks on Submit button
    Then user will get a success message from the site

    Examples: 
      | firstname | lastname | phonenumber | DOB        | cityname | uid   | password |
      | Harry     | Dsoza    |  9811111112 | 05-05-2007 | Kolkata  | 13784 | test123  |
