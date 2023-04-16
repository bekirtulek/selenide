Feature: explicitly wait
  @explicitly
  Scenario: TC01 explicitly wait
    Given kullanici "https://the-internet.herokuapp.com/dynamic_loading/1" adresine gider
    And   kullanici start butonuna tiklar
    Then  kullanici "Hello World!" yazisini gorur
    And   kullanici sayfayi acik tutar
