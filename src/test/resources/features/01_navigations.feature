@google
Feature: navigasyonlar
  Scenario: TC_01 navigasyon testi
    Given kullanici "https://www.google.com/" adresine gider
    Then  kullanici "https://www.amazon.com/" adresine gider
    And   kullanici 5 saniye bekler
    Then  kullanici onceki sayfaya gider
    And   kullanici 5 saniye bekler
    Then  kullanici sonraki sayfaya gider
    And   kullanici 5 saniye bekler
    Then  kullanici sayfayi yeniler
    And   kullanici 5 saniye bekler
    Then  kullanici sayfayi acik tutar