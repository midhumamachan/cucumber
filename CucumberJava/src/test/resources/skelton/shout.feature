Feature: Shout Feature 
Scenario: Voice Audible 
    Given Sean is 20 meers {away} from Lucia
    When Sean shouts "free coffee"
    Then Lucia hears message
    @tag2
 Scenario: Voice is not Audible 
    Given Sean is 200 meers {away} from Lucia
    When Sean shouts "free coffee"
    Then Lucia cannot hear message
 