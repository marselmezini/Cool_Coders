Feature: This feature is to verify button and links in home page
@home
Scenario: Verify home page link is displayed
Given    Launch "<URL>"
Then     Verify home link is displayed

@cart
Scenario: Verify cart link is displayed
Given    Launch "<URL>"
Then     Verify  cart is displayed
     

@contact
Scenario: Verify Contact link is in function
Given    Launch "<URL>"
Then     Click contact button
And      Verify new message window is displayed

@login
Scenario: Verify user is log in
Given    Launch "<URL>"
Then     Click login button
Then     User type credentials "<Username>" "<Password>" and click login
And      Verify user is logged in

@item
Scenario: Verify item is displayed in cart
Given    Launch "<URL>"
Then     Click Samsung Galaxy S7
Then     Add item in cart
Then     Click cart  
And      Verify item is in cart











