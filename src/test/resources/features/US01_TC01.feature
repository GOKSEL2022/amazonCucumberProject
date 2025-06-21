Feature: sayfaya_ulasma_testi

    Scenario: kullanici_amazon_sayfasina_kayitli_kullanici_olarak_giris_yapar
      Given kullanici amazon url ye gider
      When  kullanici anasayfada oldugunu dogrular
      Given kullanici hesaba giris yapin alanina gelir
      When kullanici giris yap linke tiklar
      And  kullanici Giris yapin veya hesap olusturun sayfasina gelir
      And  kullanici kayitli telefon veya epostasini girer
      And  kullanici devam et butona tiklar
      And  kullanici kayitli sifresini girer
      And  kullanici giris yap butona tiklar
      And kullanici uye olarak sayfaya giris yapildigini dogrular
      Then  kullanici sayfayi kapatir

  Scenario: TC01_Amazon_Urun_Arama_Sepete_Ekleme
    Given kullanici amazon url ye gider
    When kullanici giris yap linke tiklar
    Then Gecerli kullanici adini girer
    Then Devam et butonuna tiklar
    Then Gecerli password bilgisini girer
    Then Giris yap butonuna tiklar
    Then Kullanici arama kutusuna herhangi bir gecerli veri girisi yapar
    Then Kullanici arama sonuclarini fiyati dusukten yuksege siralar
    Then Kullanici fiyati en dusuk olan urune tiklar
    Then Kullanici urunu sepete ekler
    Then Kullanici urunun sepete eklendigini dogrular