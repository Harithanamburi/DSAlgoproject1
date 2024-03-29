
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
     
 
   