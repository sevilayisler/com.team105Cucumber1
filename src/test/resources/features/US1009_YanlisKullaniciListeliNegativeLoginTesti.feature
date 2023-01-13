@wip
Feature: US1009_ Yanlis kullanici adi ve password listesi ile negatif login testi

  Scenario Outline: TC14 yanlis kullanici listesi ile giris yapilamamali

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    And cookie varsa accept eder
    And kullanici kutusuna manuel olarak "<yanlisUsername>" yazar
    And password kutusuna manuel olarak "<yanlisPassword>" yazar
    And 3 saniye bekler
    And login butonuna basar
    And giris yapilamadigini test eder
    Then sayfayi kapatir
    Examples:
      |yanlisUsername  |yanlisPassword|
      |ilker           |ilker@a.com   |
      |mehmet          |mehmet@b.com  |

