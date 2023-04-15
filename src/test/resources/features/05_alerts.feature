Feature: alerts
  @alerts
  Scenario: TC01 alert
    Given kullanici "https://testcenter.techproeducation.com/index.php?page=javascript-alerts" adresine gider
    And   kullanici alert prompt butonuna tiklar
    And   kullanici alerte "Hello World" yazar ve OKe tiklar
    Then  kullanici sonucun "Hello World" icerdigini test eder
    And   kullanici sayfayi acik tutar