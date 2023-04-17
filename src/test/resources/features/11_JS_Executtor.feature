Feature: js executor
  @scrollwithJSexecutor
  Scenario: js executor
    Given kullanici "https://www.amazon.com/" adresine gider
    And   tum ekran goruntusunu alir
    And   footer elementi gorunur sekilde goster
    And   tum ekran goruntusunu alir
    And   kullanici sayfayi acik tutar

