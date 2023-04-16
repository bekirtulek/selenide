Feature: iframe ve windows
  @iframe
  Scenario: TC01 iframe
    Given kullanici "https://testcenter.techproeducation.com/index.php?page=iframe" adresine gider
    And   kullanici switch to ile iframe1 icine girer
    And   kullanici Back to TechProEducation.com linkine tiklar
    And   kullanici switch to window2 yapar
    And   kullanici cikan reklami kapatir
    #And   kullanici sayfayi acik tutar
