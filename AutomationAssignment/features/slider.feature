Feature: Slider Feature
Scenario: count slider scenario
Given user is on home page
When user click on Shop Menu
When user click on Home menu button
Then user is on home page and Home page has Three Sliders only

Scenario: count arrival scenario
Given user is on home page
When user click on Shop Menu
When user click on Home menu button
Then Home page must contains only three Arrivals

Scenario: navigate arrival scenario
Given user is on home page
When user click on Shop Menu
When user click on Home menu button
Then Home page must contains only three Arrivals
When click the image in the Arrivals
Then it is navigating to next page where the user can add that book into his basket

Scenario: image description scenario
Given user is on home page
When user click on Shop Menu
When user click on Home menu button
Then Home page must contains only three Arrivals
When click the image in the Arrivals
Then it is navigating to next page where the user can add that book into his basket
When on Description tab 
Then There should be a description regarding that book 

Scenario: image review scenario
Given user is on home page
When user click on Shop Menu
When user click on Home menu button
Then Home page must contains only three Arrivals
When click the image in the Arrivals
Then it is navigating to next page where the user can add that book into his basket
When on Description tab 
Then There should be a description regarding that book 
When clock on Reviews tab for the book you clicked on.
Then There should be a Reviews regarding that book 
