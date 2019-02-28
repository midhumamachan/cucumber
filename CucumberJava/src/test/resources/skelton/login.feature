Feature: Login feature
Scenario Outline: A valid scenario 
	Given the url of the login app 
		And admin user enters <username> as user name 
		And admin user enters <password> as password 
		Then <result> user 
		
		Examples:
		| username | password | result|
		| ask@gmail.com | 1223344 | admin |
		| midhu@gmail.com | qaasvb | power |
		