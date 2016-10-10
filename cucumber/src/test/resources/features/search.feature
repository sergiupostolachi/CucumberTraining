Feature: Search in LexShop site

	Background:
		Given I navigate to lex site

	@Application
	@web
	Scenario: Search for a product

		When I type a product in search field
			| Fields      | Value                 |
			| SearchInput | The Settlers of Catan |
		And I search for a product
		Then I check the results are in place