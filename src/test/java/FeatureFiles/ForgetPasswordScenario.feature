Feature: Validate Forget Password functionality of Banking Domain
	@Medium
  Scenario Outline: Validate Forget password functionality of GroTechMind Banking Domain
    Given User open the URL of Banking application
    And clicks on Forget Password button in Webpage
    And user enters email in Forget Password page as "<fp_email>"
    And user enters phone number in Forget Password page as "<fp_phone>"
    When user click  on forget password button
    Then user will get a success message in Forget Password page
    

    Examples: 
      | fp_email         | fp_phone   |
      | rktest@gmail.com | 8087282220 |
