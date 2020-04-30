@Web
Feature: Search Pokemon
  Scenario: Search pokemon on google
    Given User open Google home page
    When User get "Pikachu Wikipedia Indonesia" from API
    When User input search "Pikachu Wikipedia Indonesia"on home page
    When User click first search result
    Then User see result "Pikachu Wikipedia Indonesia" on article page


  Scenario: Search pokemon on google
    Given User open Google home page
    When User get "Charizard Wikipedia Indonesia" from API
    When User input search "Charizard Wikipedia Indonesia"on home page
    When User click first search result
    Then User see result "Charizard Wikipedia Indonesia" on article page

  Scenario: Search pokemon on google
    Given User open Google home page
    When User get "Bulbasaur Wikipedia Indonesia" from API
    When User input search "Bulbasaur Wikipedia Indonesia"on home page
    When User click first search result
    Then User see result "Bulbasaur Wikipedia Indonesia" on article page

  Scenario: Search pokemon on google
    Given User open Google home page
    When User get "Mewtwo Wikipedia Indonesia" from API
    When User input search "Mewtwo Wikipedia Indonesia"on home page
    When User click first search result
    Then User see result "Mewtwo Wikipedia Indonesia" on article page



