Feature: Navigation through LexShop menu

	Scenario: Test Deteriorate
		Given I navigate to lex site
		When I access ".//*/a[@href='/deteriorate.html']"
		Then I verify the ".//*/img[@title='sequence a']" item
		And I verify the ".//*/img[@title='bruges a']" item
		And I verify the ".//*/img[@title='ticket to ride anniversary']" item
		And I close the browser

	Scenario: Test Lichidare
		Given I navigate to lex site
		When I access ".//*/a[@href='/lichidari.html']"
		Then I verify the filter ".//*/img[@src='/app/images/buton-lichidate.png']"
		And I close the browser