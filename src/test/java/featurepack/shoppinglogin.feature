Feature: I want to login into the softwaret testing board website
 
  Scenario Outline: Login using username and password
    Given I want to login into the login page using my credentials
    And use the account for shoppings
    When I click on SignIn
    And Enter username as "<username>" and password as "<password>"
    And Click on Sign In button
    Then Login should be successful with login ststus as "<login_status>"
    And I exit the pages
    
    Examples:
    |username |password| login_status|
    |Uvray@gmail.com|Selenium@12345|Login_Successful|
    |Urvashi|Selenium@12345|Login_Fail|
    |Uvray@gmail.com|Sel|Login_Fail|
    |Urvashi|Sele|Login_Fail|
    
	