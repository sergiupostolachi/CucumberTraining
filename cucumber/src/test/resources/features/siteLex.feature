Feature: Navigation through LexShop menu
	@web
	Scenario: Test Deteriorate
		Given I navigate to lex site
		When I access ".//*/a[@href='/deteriorate.html']"
		Then I verify the ".//*/img[@title='sequence a']" item
		And I verify the ".//*/img[@title='bruges a']" item
		And I verify the ".//*/img[@title='ticket to ride anniversary']" item

	@web
	Scenario: Test Lichidare
		Given I navigate to lex site
		When I access ".//*/a[@href='/lichidari.html']"
		Then I verify the filter ".//*/img[@src='/app/images/buton-lichidate.png']"

	@Server
	@dummy
	Scenario: Test dummy
		Given I navigate to lex site
		When I access ".//*/a[@href='/lichidari.html']"
		Then I verify the filter ".//*/img[@src='/app/images/buton-lichidate.png']"

	@Application
	@web
	Scenario Outline: Test LexShop menu
		Given I navigate to lex site
		When I access on <Link>
		Then I verify the <Item> item
		Examples:
			| Link                              | Item                                          |
			| .//*/a[@href='/deteriorate.html'] | .//*/img[@title='sequence a']                 |
			| .//*/a[@href='/lichidari.html']   | .//*/img[contains(@data-original,'.829-jpg')] |