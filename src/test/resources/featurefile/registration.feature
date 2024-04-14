@DSRegister
Feature: Registartion page

  Background: 
    Given User is on DSAlgoHome Page
    Then user clicks the register link
   

  Scenario: open Registration page
    Then user enters the username "test78"
    And user enters the password "Numpy@9034"
    And user enters the confirmation password "Numpy@9034"
    Then user clicks the register button
    And sucess  msg should display "New Account Created You are logged in as test8"

  Scenario Outline: open Registration page for negative cases
    When user clicks the register button with all empty fields
    Then user clicks the register button
    Then error "please fill out the field" appears below username textbox
    Then user clicks the register button
    When user click register button after entering the username "<username>"
    Then error "please fill out the field" appears below password
    Then user clicks the register button
    Then user click register button after entering the password "<passwrd>"
    And error "please fill out the field" appears below username
    Then user clicks the register button
    Then user click register button after entering the confimpassword "<confirmpwd>"
    And error "please fill out the field" appears below username
    Then user clicks the register button
    

    Examples: 
      | username | passwrd | confirmpwd |
      |          |         |            |
      | @#$%     |         |            |
      |          | adf234  |            |
      |          |         | &^5nkjk    |
      
