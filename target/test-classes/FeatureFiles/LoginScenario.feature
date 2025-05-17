Feature: Validate Login functionality of Banking Domain
	@High
  Scenario Outline: Validate Login functionality of GroTechMind Banking Domain
    Given User open the URL of Banking application
    And clicks on Log in button in Webpage
    And user enters username as "<username>"
    And user enters password as "<password>"
    When user click  on Login button
    Then user will get a success message from the website

    Examples: 
      | username | password |
      | rktest   | test123  |
