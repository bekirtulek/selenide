@locators
  Feature: locators
    Scenario: TC_01 locators
      Given kullanici "https://testcenter.techproeducation.com/index.php?page=form-authentication" adresine gider
      And   kullanici 2 saniye bekler
      And   kullanici username girer
      And   kullanici 2 saniye bekler
      And   kullanici password girer
      And   kullanici 2 saniye bekler
      When  kullanici submit butonuna tiklar
      And   kullanici 2 saniye bekler
      Then  kullanici login oldugunu gorur

