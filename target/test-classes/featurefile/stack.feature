

Feature: Stack Feature File
  

Background:
Given User is on login page "Testers" and "Numpy@123"
And user scrolls down for stack option
Then Click on Stack Get started button
 
Scenario: Operations in Stack
When Click on operations in stack tab 
Then click on Try here tab
And user enter the valid python code "print "hello"" 
Then user able to see the output
And user enter the invalid python code error
Then User gets the error

Scenario: Implementation
Given User Click on the Implementation tab
Then click on Try here tab
And user enter the valid python code "print "hello"" 
Then user able to see the output
And user enter the invalid python code error
Then User gets the error

Scenario: Applications
Given User Click on the Application tab
Then click on Try here tab
And user enter the valid python code "print "hello"" 
Then user able to see the output
And user enter the invalid python code error
Then User gets the error







 