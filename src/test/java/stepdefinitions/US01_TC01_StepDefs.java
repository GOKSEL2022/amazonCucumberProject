package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import pages.AllPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.clickByJS;
public class US01_TC01_StepDefs {
    AllPages allPages=new AllPages();
    Actions actions=new Actions(Driver.getDriver());
    @Given("kullanici amazon url ye gider")
    public void kullaniciAmazonUrlYeGider() {
        Driver.getDriver().get("amazon_url");
    }
    @When("kullanici anasayfada oldugunu dogrular")
    public void kullaniciAnasayfadaOldugunuDogrular() {
        assert Driver.getDriver().getTitle().contains("Amazon");
    }
    @Then("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
    @Given("kullanici hesaba giris yapin alanina gelir")
    public void kullaniciHesabaGirisYapinAlaninaGelir() {
        actions.moveToElement(allPages.homePage().merhabaGirisYapinHesapVeListelerTextTitleHome).perform();
    }
    @When("kullanici giris yap linke tiklar")
    public void kullaniciGirisYapLinkeTiklar() {
        clickByJS(allPages.homePage().girisYapButonHome);
    }
    @And("kullanici Giris yapin veya hesap olusturun sayfasina gelir")
    public void kullaniciGirisYapinVeyaHesapOlusturunSayfasinaGelir() {
        actions.moveToElement(allPages.homePage().merhabaGirisYapinHesapVeListelerTextTitleHome).perform();
    }
    @And("kullanici kayitli telefon veya epostasini girer")
    public void kullaniciKayitliTelefonVeyaEpostasiniGirer() {
        allPages.signinPage().cepTelefonuNumarasiVeyaEpostaGirinTextboxSignin.sendKeys(ConfigReader.getProperty("KayitliTelefon"));
    }
    @And("kullanici devam et butona tiklar")
    public void kullaniciDevamEtButonaTiklar() {
        clickByJS(allPages.signinPage().devamEtButonSignin);
    }

    @And("kullanici kayitli sifresini girer")
    public void kullaniciKayitliSifresiniGirer() {
        allPages.signinPage().cepTelefonuNumarasiVeyaEpostaGirinTextboxSignin.sendKeys(ConfigReader.getProperty("KayitliSifre"));
    }
}
