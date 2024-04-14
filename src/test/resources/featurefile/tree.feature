<<<<<<< HEAD
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
  
=======
Feature: open login browser

  Scenario Outline: open login browser in Dsalgo
    Given open login page
    When user enter valid "<username>", "<password>"
    And click on login button
    Then user shows sucess message 
       And user click on Get Started button  in Tree module
    
    Examples:
    |  username    |password|
    |  Testers     |Numpy@123|
    
    Scenario: user is on treepage 
    Given user click on overview of trees link
    #When user click on Try here button
    #When user should be directed to the url "https://dsportalapp.herokuapp.com/tryEdito"
    #Then user  writes valid python code with in editor box "print 'hello'"
    #And user clicks run button
    #Then user should able to see the output
    
>>>>>>> main
