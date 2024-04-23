@LinkedList

 Feature: LinkedList
 
 Background:Given User is on DSAlgoHome Page
   Then User clicks on Signinlink 
   Then Click on Linkedlist Get started button
   When User click on Introduction link
 
 Scenario: LinkedList Valid Data
   When User enters valid python code
   When user clicks on signout button
   
 Scenario: LinkedList InValid Data
   When User enters Invalid python code 
   When user clicks on signout button