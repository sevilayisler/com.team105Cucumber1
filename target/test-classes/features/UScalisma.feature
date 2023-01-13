Feature: 1007
  @wip
  Scenario Outline:
    # amazon
    Given kullanici"amazonUrl"anasayfasina gider
    Then kullanici"<arananUrun>"arattirir

    And arama"<aranan urun>"yazip arttiri
    And sayfayi kapati


  Examples:
    |aranan urun||yanlispasword
    |Nutella    |ilker
    |Java |
    |Samsung|
    |Aple   |