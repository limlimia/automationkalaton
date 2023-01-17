Feature: Login Website

  Scenario Outline: Login with valid account
    Given User access login page
    When User enter <username> and <password>
    And Click login button
    Then User directed to homepage

		Examples:
   	| username        				| password     |
   	| standard_user   				| secret_sauce |
   	| problem_user   				  |	secret_sauce |
   	| performance_glitch_user | secret_sauce |
   	
  Scenario Outline: Login with invalid account
    Given User access login page
    When User enter <username> and <password>
    And Click login button
    Then User get error message

		Examples:
   	| username        				| password     |
   	|    	[blank]							| secret_sauce |
   	| standard_user   				|	[blank]			 |
   	| 		[blank]						  |	[blank]			 |
   	| abcdef   								|			HAHA		 |