Feature: Application Login

#Background:
#Given validate browser
#When Browser is triggered
#Then Check if browser is displayed

@SmokeTest @RegTest
Scenario: Home page default login
Given User is on netBanking landing page
When User login into application with "jin" and "1234"
Then Home page is populated
And Cards displayed "true"

@RegTest
Scenario: Home page default login and card not displayed
Given User is on netBanking landing page
When User login into application with "john" and "321"
Then Home page is populated
And Cards displayed "false"

@MobileTest
Scenario: Home page default login and card not displayed
Given User is on netBanking landing page
When User login into application with "john" and "321"
Then Home page is populated
And Cards displayed "mobile"

@MobileTest
Scenario: Home page default login and card not displayed
Given User is on netBanking landing page
When User login into application with "john" and "321"
Then Home page is populated
And Cards displayed "mobile"

@SanityTest
Scenario: Home page default sign up
Given User is on netBanking landing page
When User sign up with following details
| jen | abcd | abcd@gmail.com | Indonesia | 1234|
Then Home page is populated

@SmokeTest
Scenario Outline: Home page login with data table
Given User is on netBanking landing page
When User login in to application with <username> and <password>
Then Home page is populated
And Cards displayed "true"

Examples:
|username	|password |
|user1		|pass1		|
|user2		|pass2		|
|user3		|pass3		|
