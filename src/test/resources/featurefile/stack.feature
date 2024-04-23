Feature: Stack Feature File
  

Background: Stack login
    Given User is on DSAlgoHome Page
    Then User clicks on Signinlink 
    Then Click on Stack Get started button
    
 
Scenario: Operations in Stack
When Click on operations in stack tab 
Then click on Try here tab
And user enter the valid python code "print "hello"" 
Then user able to see the output
And user enter the invalid python code "error"
Then user should check if there is an alert

Scenario: Implementation
Given User Click on the Implementation tab
Then click on Try here tab
And user enter the valid python code "print "hello"" 
Then user able to see the output
And user enter the invalid python code "error"
Then user should check if there is an alert

Scenario: Applications
Given User Click on the Application tab
Then click on Try here tab
And user enter the valid python code "print "hello"" 
Then user able to see the output
And user enter the invalid python code "error"
Then user should check if there is an alert