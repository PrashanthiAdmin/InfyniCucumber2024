Feature: Login functionality


@validlogin  @regression
Scenario: Verify product owner is able to login to the cucumber application


When user enters email id "anusmoody@gmail.com"
And user enters password "Test@123"
And user clicks sign in button
Then user should be able to successfully login to the application



@invalidlogin @regression
Scenario Outline: Verify product owner can see error message if wrong credentials entered in the application



When user enters email id "<emailid>"
And user enters password "<password>"
And user clicks sign in button
Then user should see the error message on the screen



Examples:
|emailid|password|
|mindqselenium6@gmail.com|Test123|
|prashanthi.skvl@gmail.com|Test123|







