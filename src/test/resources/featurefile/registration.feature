<<<<<<< HEAD
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
      
=======
Feature: Registartion page

  Background: 
    Given user navigates to register page
    Then user clicks the reister button
     

  Scenario: open Registration page
    Then user enters the username "test6"
    And user enters the password "Numpy@123"
    And user enters the confirmation password "Numpy@123"
    Then user clicks the reister button
    And sucess  msg should display "New Account Created You are logged in as test5"
# When user clicks register button 
  Scenario Outline: open Registration page for negative cases
    When user clicks register button with all empty fields
    Then error "please fill out the field" appears below textbox
    When user click register button after entering the username "<username>"
    Then error "please fill out the field" appears below password
    Then user click register button after entering the password "<passwrd>"
    And error "please fill out the field" appears below username
    Then user click register button after entering the confimpassword "<confirmpwd>"
    And error "please fill out the field" appears below username 

    Examples: 
      | username | passwrd  | confirmpwd |
      |          |          |            |
      | @#$%     |          |            |
      |    			 | adf234   |            |
      |          | 				  | &^5nkjk    |

  Scenario Outline: Open login page for invalid scenarios
    Given user click on signin link
    When user enters login button with all empty fields
   Then click on login button
    And error message  "please fill out the field" appears below username
   Then user enters username "<loginusername>"
   Then click on login button
   And error "please fill out the field" appears below password
   Then user enters  password "<loginpasswrd>"
   Then click on login button
   And error "please fill out the field" appears below username
   When user enters invalid username "<loginusername>"
   And user enters invalid password  "<loginpasswrd>"
   Then click on login button
   Then error message should display 
	  Examples: 
      | loginusername | loginpasswrd |
      |              |              |            
      | trd08$fh     |          |            
      |    					 | adf234   |            
      |     ffewfs   | vnjk876  | 
	
    
    #Scenario: open login page
   #Given open login page 
#	When user enter valid username "Testers" 
#	Then user enter valid  password "Numpy@123"
#	Then click on login button

Scenario: open login page
   Given open login page 	
	 When user enter valid "<username>", "<password>"
	 And click on login button
	
	 Examples:
    |  username    |password|
    |  Testers     |Numpy@123|
	
   
>>>>>>> main
