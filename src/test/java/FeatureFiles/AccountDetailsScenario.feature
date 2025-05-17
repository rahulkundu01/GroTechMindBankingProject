Feature: Validate Account Details functionality of Banking Domain
	@Low
  Scenario Outline: Validate Account Details functionality of GroTechMind Banking Domain
    Given User open the URL of Banking application
    And user clicks on Account Details button in WebPage
    And select and customer from the dropdown
    And Click on Login
    And click on deposit tab
    And enter the amount to be deposited as "<d_amount>"
    When click on Deposit button
    Then balance is updated
    And click on withdrawl tab
    And enter amount to be withdrawn as "<w_amount>"
    When click on withdraw button
    Then balance will be updated

    Examples: 
      | d_amount | w_amount |
      |    10000 |     5000 |
