Feature: check the languages available
  people want to know what language they can watch a movie in
  Scenario: Film has English dub
   Given I have selected a film
    When The film is not in English
    Then I expect to see that it is not available in English