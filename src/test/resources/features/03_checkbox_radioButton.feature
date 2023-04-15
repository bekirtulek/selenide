
  Feature: checkbox ve radio buton
    @checkbox
    Scenario: TC01 checkbox
      Given kullanici "https://testcenter.techproeducation.com/index.php?page=checkboxes" adresine gider
      And   kullanici "Checkbox 1" secili degilse secer
      And   kullanici "Checkbox 2" secili degilse secer
      And   kullanici sayfayi acik tutar

    @radio1
    Scenario: TC02 radio buton
      Given kullanici "https://testcenter.techproeducation.com/index.php?page=radio-buttons" adresine gider
      And   kullanici "Red" secili degilse secer
      And   kullanici sayfayi acik tutar

    @radio2
    Scenario: TC03 radio buton
      Given kullanici "https://testcenter.techproeducation.com/index.php?page=radio-buttons" adresine gider
      And   kullanici "Football" secili degilse secer
      And   kullanici sayfayi acik tutar

