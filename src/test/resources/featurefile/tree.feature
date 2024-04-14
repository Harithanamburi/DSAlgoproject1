@Tree
 Feature: Tree module
Background: Tree  Validation
    Given User is on DSAlgoHome Page
    Then User clicks on Signinlink 
Scenario:  Tree Valid data
   Then Click on Tree Get started button
   When user click on Overview button  in Tree module
   Then user click on left panel links in Tree module
  
Scenario:  Tree Invalid data
   Then Click on Tree Get started button
   When user click on Overview button  in Tree module
  Then user click on left panel links in Tree module Invalid
  