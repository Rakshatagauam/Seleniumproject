package snippet;

public class Snippet {
	Feature: test login functionality
	
	  Scenario: validae login with valid credentials
	    Given chrome browser is open
	    And user is on login page
	    When user enter username and password
	    Then user is navigated to homepage
	
}

