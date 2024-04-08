Feature: Queue

Background:
Given User is on login page "Testers" and "Numpy@123"
And user scrolls down for Queue option
Then Click on Queue Get started button

Scenario: Queue in Python
Given User select the option Implementation of Queue in Python
Then click on Try here tab
And user enter the valid python code "print "hello"" 
Then user able to see the output
And user enter the invalid python code error
Then User gets the error

Scenario: collections dequeue
Given User select the option collections dequeue
Then click on Try here tab
And user enter the valid python code "print "hello"" 
Then user able to see the output
And user enter the invalid python code error
Then User gets the error

Scenario: Implemen_tation Using Arrays
Given User click on the option Implemen_tation Using Arrays
Then click on Try here tab
And user enter the valid python code "print "hello"" 
Then user able to see the output
And user enter the invalid python code error
Then User gets the error

Scenario: Queue operations
Given User click on the option Queue operations
Then click on Try here tab
And user enter the valid python code "print "hello"" 
Then user able to see the output
And user enter the invalid python code error
Then User gets the error



