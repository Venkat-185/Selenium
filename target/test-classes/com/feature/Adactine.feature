Feature: Checking the Booking functionality of and Adactine Application
Scenario Outline: Login Functionality
Given user Must Launch The Url
When user Enter The  "<username>" In The Username Field
And user Enter The "<password>" In The Password Field
Then user Click TheLogin Button And It Navigates to The Search Hotel Page

Examples:
|username|password|
|abc|123|
|xyz|789|
|vijayvenkat740|Venkat07@|

Scenario:To Search The Hotel Functionality
When user Select The "London" In The Location Field
And user Select The "Hotel Sunshine" In The Hotels Field
And user Select The "Super Deluxe" In The Room Type Field
And user Select The "2" In The Number Of Rooms
And user Select The "2" In The Adults Per Room 
And user Select The "1" In The Childerns Per Room
Then user Click The Search Button It Naviagates To The Search Hotel Page

Scenario: To Select The Hotel Functionality
When user Select The Radio Button Field
Then user Click the Continue Button And Its Navigates To Book Hotel Page

Scenario:To Enter The Booking Functionality
When user Enter "Venkat" In The Firstname Field
And user Enter "Ram" In The Lastname Field
And user Enter "Abc Street" In The Billing Address Field
And user Enter "2525363656568989" In The Credit Card Field
And user Select "VISA" In The Cc Type Field
And user Select "12" In The Expiry Month Field
And user Select "2022" In The Expiry year Field
And user Enter "2563" In The Cvv Field
Then user Click The Book Now Button And It Navigates To Booking Confirmation Page

