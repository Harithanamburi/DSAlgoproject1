@DS
Feature: Data Structure Intruduction
Background: DataStructure Intruduction
Given User is on DSAlgoHome Page
 Then User clicks on Signinlink
  
 Scenario Outline: Data Structure Validation for Invalidadata
    
   When user clicks on Get started button under Data structures
   Then user should navigate details page to click on Time Complexity link
   Then user should navigate details page to click on Time Complexity link in left panel
   When user should navigate details page of Time Complexity to click on Tryhere editor
   When user enters invalid "code" in editor
   Then user clicks on run button
   When user clicks on signout button
   
   
   Scenario Outline: Data Structure Validation
  
   When user clicks on Get started button under Data structures
   Then user should navigate details page to click on Time Complexity link
   Then user should navigate details page to click on Time Complexity link in left panel
   When user should navigate details page of Time Complexity to click on Tryhere editor
   When user enters "code" in editor
   Then user clicks on run button
   When user clicks on signout button
   
    
    
    
    
      
      
    
  