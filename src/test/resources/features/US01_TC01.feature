Feature: sayfaya_ulasma_testi
  @US01_TC01
  Background: kullanici_amazon_urlye_gider
    Given kullanici amazon url ye gider
    When  kullanici anasayfada oldugunu dogrular

    Scenario: kullanici_amazon_sayfasina_kayitli_kullanici_olarak_giris_yapar
      Given kullanici hesaba giris yapin alanina gelir
      When kullanici giris yap linke tiklar
      Then  kullanici sayfayi kapatir