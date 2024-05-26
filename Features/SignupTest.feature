Feature: This is a signup feature file


Scenario: User should do signup successfully

Given User should be there in login page
When User enters emailid and password
And User clicks signup button
Then User should register successfully