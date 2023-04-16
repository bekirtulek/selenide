Feature: actions

  @draganddrop
  Scenario: TC01 drag and drop
    Given kullanici "https://jqueryui.com/droppable/" adresine gider
    And   kullanici switch to ile iframe1 icine girer
    And   kullanici source elementi target elementine surukler
    And   kullanici sayfayi acik tutar


  @draganddropby
  Scenario: TC02 drag and dropby
    Given kullanici "https://jqueryui.com/droppable/" adresine gider
    And   kullanici switch to ile iframe1 icine girer
    And   kullanici source elementini x 463 y -19 koordinatlarina surukler
    And   kullanici source elementini x 463 y -19 koordinatlarina suruklendigini dogrular
    And   kullanici sayfayi acik tutar


