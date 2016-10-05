Feature: Using dropdown, radio button and checkbox
	@Application
	@web
	Scenario: Search for a product
		Given I navigate to lex site
		When I type a product in search field
			| Fields      | Value                 |
			| SearchInput | The Settlers of Catan |
		And I search for a product
		Then I check the results are in place
		And I order the products by "Cele mai vandute"
		And I filter products by "info0"
		Then I check the results are in place
		And I close the browser