Feature: Using dropdown, radio button and checkbox

	Background:
		Given I navigate to lex site

	@Application
	@web
	Scenario: Search for a product

		When I type a product in search field
			| Fields      | Value                 |
			| SearchInput | Game |
		And I search for a product
		Then I check the results are in place
		And I order the products by "Cele mai vandute"
		And I filter products by "info0"
		Then I check the results are in place