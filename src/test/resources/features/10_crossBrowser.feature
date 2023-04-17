@crossbrowser
Feature: cross browser
  @headless
  Scenario: TC01 headless
    Given kullanici browser tipini "headles" olarak secer
    Given kullanici "https://www.amazon.com/" adresine gider
    Then tum ekran goruntusunu alir

  @opera
  Scenario: TC02 opera -fail edecek
    Given kullanici browser tipini "opera" olarak secer
    Given kullanici "https://www.amazon.com/" adresine gider
    Then tum ekran goruntusunu alir

  @firefox
  Scenario: TC03 firefox
    Given kullanici browser tipini "firefox" olarak secer
    Given kullanici "https://www.amazon.com/" adresine gider
    Then tum ekran goruntusunu alir

  @ie
  Scenario: TC04 ie fail edecek
    Given kullanici browser tipini "ie" olarak secer
    Given kullanici "https://www.amazon.com/" adresine gider
    Then tum ekran goruntusunu alir