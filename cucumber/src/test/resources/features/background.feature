Feature: Navigation through LexShop menu using background script

	Background:
		Given I navigate to lex site

@web
@background
	Scenario: Test Deteriorate
		When I access ".//*/a[@href='/deteriorate.html']"
		Then I verify the ".//*/img[@title='sequence a']" item
		And I verify the ".//*/img[@title='bruges a']" item
		And I verify the ".//*/img[@title='ticket to ride anniversary']" item
		And I close the browser

@web
@background
	Scenario: Test Lichidare
		When I access ".//*/a[@href='/lichidari.html']"
		Then I verify the filter ".//*/img[@src='/app/images/buton-lichidate.png']"
		And I close the browser