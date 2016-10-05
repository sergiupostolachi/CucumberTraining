Feature: Navigation through LexShop menu2
@dummy
	Scenario: Test dummy
		Given I navigate to lex site
		When I access ".//*/a[@href='/lichidari.html']"
		Then I verify the filter ".//*/img[@src='/app/images/buton-lichidate.png']"
		And I close the browser
