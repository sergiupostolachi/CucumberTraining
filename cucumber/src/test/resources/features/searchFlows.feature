Feature: Search Flows

	Scenario: Search for a product simple scenario
		When I type a product in search field "The Settlers of Catan"
		And I click on search
		Then I check for results "The Settlers of Catan"