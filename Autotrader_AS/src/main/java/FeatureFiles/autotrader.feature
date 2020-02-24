Feature: Autotrader Advanced Search

Background: Open a blank browser
Given open browser
Then navigate to URL

Scenario: Autotrader BMW result verification

#Given User is on the homepage of Autotrader
#When Title of the homepage is New Cars, Used Cars - Find Cars for Sale and Reviews at Autotrader
Then Verify all the links are present
Then Verify Search button is present
Then Verify Drop-Downs are present
Then Click on Advanced Search
#When Title of the Advanced Search page is Search for Cars For Sale Online - Find a Car at Autotrader
Then User enters zipcode
Then User selects Certified option under Condition
Then User selects Convertible option under Style
Then User sets the desired from and to years under Years
And User selects the make of the car under Make, Model & Trim
Then User clicks on the Search button
#When Title of the Result page is BMW Convertibles for Sale in Alpharetta, GA 30004 - Autotrader
Then Assert that user only sees BMW cars
And log total number of cars
Then close the browser

