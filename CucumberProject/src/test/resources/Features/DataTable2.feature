Feature: Test the login functionality of Orange HRM

Scenario: Test the valid login using Datatable

Given User is on login page
When user enters credentials using DataTable
| admin   | admin123 |
And user clciks on login button
Then user should land on home page

