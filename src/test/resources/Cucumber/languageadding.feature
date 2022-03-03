Feature: I want to add a new Language into the database
  Scenario: Film receives a new translation
   Given I have selected a film
    When The film is not in English
    Then I expect to see that it is not available in English