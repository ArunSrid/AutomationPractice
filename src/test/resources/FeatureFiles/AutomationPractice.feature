Feature: Automation Practice workflow

  @valid
  Scenario: The application home page is identifiable and user clicks on sign in option
    Given user is on the Automation Practice home page
    When I click on the Sign in Page
    Then I should be able to view the Sign In page

  Scenario: Create an account and select a product and add to cart and complete the payment
    Given user is on the Sign in home page
    When I provide the email address
    And I click on the Create an account button
    And I enter the First name <FirstName> and Last Name <LastName> and Password <Password>
      | FirstName | LastName | Password    |
      | Arun      | Srid     | Password123 |
    And I select the Date <Date> Month <Month> and Year <Year>
      | Date | Month | Year |
      |    1 |    3  | 1980 |
    And I select the address details with FirstName <FirstName> LastName <LastName> Address <Address> City <City> State <State> ZipCode <PostalCode> Country <Country> MobilePhone <PhoneNumber>
      | FirstName  | LastName | Address | City | State | PostalCode | Country | PhoneNumber |
      | Arun       | Srid     | 436A    | US   | 5     |   00000    | 21      |  85462323   |
    And I click on the Register button
    And I navigate to dress tab
    And I Select a dress and Add to cart
    And Click on the Proceed to checkout on Summary tab
    And Click on the Proceed to checkout on Address tab
    And I check the Terms of service and Click on the Proceed to checkout on Shipping tab
    And I click on the Pay by wire option
    And I click on the I confirm my order
    Then I should be able to view the order confirmation page
    
    Scenario: When user tries to create account with existing email, an error should be prompted
   	Given user is on the Sign in home page
		When I provide the existing email address <email>
				| email |
				| arun@test1.com|
		And I click on the Create an account button
		Then I should be getting an error message stating account already exists
		
		Scenario: Existing user performs the sign 
		Given user is on the Sign in home page
		When I provide the existing email address <email> and password <password> in the already registered section
		| email     | password |
		| e@test.com| 12345    |
		Then I should be able to login and land in the account me page


 	 Scenario: Create user account with all mandatory details
 	  Given user is on the Sign in home page
    When I provide the email address
    And I click on the Create an account button
    And I enter the First name <FirstName> and Last Name <LastName> and Password <Password>
      | FirstName | LastName | Password    |
      | Arun      | Srid     | Password123 |
    And I select the Date <Date> Month <Month> and Year <Year>
      | Date | Month | Year |
      |    1 |    3  | 1980 |
    And I select the address details with FirstName <FirstName> LastName <LastName> Address <Address> City <City> State <State> ZipCode <PostalCode> Country <Country> MobilePhone <PhoneNumber>
      | FirstName  | LastName | Address | City | State | PostalCode | Country | PhoneNumber |
      | Arun       | Srid     | 436A    | US   | 5     |   00000    | 21      |  85462323   |
    And I click on the Register button
    
