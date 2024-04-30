 @Arrays
 Feature: Arrays
 
 Background:
   Given User is on DSAlgoHome Page
   Then User clicks on Signinlink 
   Then Click on Array Get started button
   When user click on Arrays in Python button in Array module
   
  Scenario:  Arrays Module Validdata
   Then user click on left panel links in Array module
   When user clicks on signout button
   
   
  Scenario:  Arrays Module Invaliddata
   Then user click on left panel links in Array module for Invalid data
   When user clicks on signout button
   
   
  Scenario:  Practice Questions for valid data
   Then user clicks on practice questions
   Then user should be able to enter the code 
   When user clicks on signout button
   
   Scenario:  Practice Questions for Invalid data
   Then user clicks on practice questions
   Then user should be able to enter the  Inavalid code 
   When user clicks on signout button
 
 
 
   
   


    