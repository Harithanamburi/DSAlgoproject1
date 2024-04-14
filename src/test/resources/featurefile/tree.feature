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
    
