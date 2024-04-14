<<<<<<< HEAD
@DSLogin
Feature:Login Page

Background: Recurring steps for Login
Given User is on the browser
Then User able to see welcome message "You are at the right place"
When User clicks on Get Started button
Then User navigates to home page to clicks on Get Started button under Data Structures-Introduction
Then User will get error message "You are not logged in"

@LoginValid
Scenario: Login Validation

And User clicks on Sign link
When User enters Username "Testers"
When User enters Password "Numpy@123"
Then User clicks on Login button
Then User will get Success message "You are logged in"
@LoginInvalid
Scenario Outline: Login Validation for Invalid Data
And User clicks on Sign link
When User enters Username “<username>”
When User enters Password “<password>”
Then User clicks on Login button

Examples: 
      | username | password  |
      |   test1  |           |            
      |          |   @#$%    |            
      |    	     |           |
    
=======

Feature: DSportal app
Background: Given open the browser
  
  Scenario: Homepage of DS
    Given open the browser
    When the message is "You are at the right place"
    And user navigates to get started
   #Then user navigates to data structure dropdown 
   ### And it should see 6 different entries 
   # When user navigates to Data structures introduction 
  	And click the get started link
    Then user gets alert message "You are not logged in"
		When  user clicks registration link
  Then user should redirectred to registration form
  
   
     
   
 
   
>>>>>>> main
