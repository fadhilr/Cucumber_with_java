Feature: Search and place order for vegetables

@SeleniumSmoke
Scenario: Search for item and validate result
Given User is on green cart landing page
When User searched for "Cucumber" vegetable
Then "Cucumber" results are displayed

@SeleniumRegression
Scenario Outline: Search for item and move to checkout page
Given User is on green cart landing page
When User searched for <Name> vegetables
And Added item to cart
And User proceeded to Checkout page for purchase
Then Verify selected <Name> item are displayed in Checkout page

Examples:
|Name	|
|Brinjal|
|Beetroot|
