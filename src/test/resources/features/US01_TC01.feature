Feature: sayfaya_ulasma_testi
  @US01_TC01
  Background: kullanici_amazon_urlye_gider
    Given kullanici amazon url ye gider
    When  kullanici anasayfada oldugunu dogrular

    Scenario: kullanici_amazon_sayfasina_kayitli_kullanici_olarak_giris_yapar
      Given kullanici hesaba giris yapin alanina gelir
      When kullanici giris yap linke tiklar
      And  kullanici Giris yapin veya hesap olusturun sayfasina gelir
      And  kullanici kayitli telefon veya epostasini girer
      And  kullanici devam et butona tiklar
      And  kullanici kayitli sifresini girer
      And  kullanici giris yap butona tiklar
      And kullanici uye olarak sayfaya giris yapildigini dogrular
      Then  kullanici sayfayi kapatir