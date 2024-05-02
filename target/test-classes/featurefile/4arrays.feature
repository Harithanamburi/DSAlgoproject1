 @Arrays
 Feature: Arrays
 
 
Background:
  Given User is on DSAlgoHome Page
   Then User clicks on Signinlink 
Scenario:  Arrays Module
   Then Click on Array Get started button
   When user click on Arrays in Python button in Array module
   Then user click on left panel links in Array module
     Then user clicks on signout button
   
   Scenario:  Arrays Module Invaliddata
   Then Click on Array Get started button
   When user click on Arrays in Python button in Array module
   Then user click on left panel links in Array module for Invalid data
     Then user clicks on signout button
   
    
  #Scenario:  Practice Questions
   #Given user should navigate details page to click on Practice Questions
   #When user cliks on Search The Array
   #Then user should be able to enter the code for negative testing "pythoncode"
   #Then user clicks on array run button
   #When user clicks on submit button for success msg


    