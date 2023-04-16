@ekrangoruntusu
Feature: screenshots
  @screenshots
  Scenario: tum ekran goruntusu
    Given kullanici "https://www.google.com/" adresine gider
    And   tum ekran goruntusunu alir

  Scenario: elementin ekran goruntusu
    Given kullanici "https://www.google.com/" adresine gider
    And   elementin goruntusunu alir