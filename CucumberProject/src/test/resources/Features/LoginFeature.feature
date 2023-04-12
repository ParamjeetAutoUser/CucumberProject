Feature: Test the login functionality of Orange HRM

Scenario Outline: Test the valid login

Given User is on login page
When user enters <username> and <password>
And user clciks on login button
Then user should land on home page

Examples: 
	|username |password|
	| admin   | admin123 |
	| admin1  | admin123 |
