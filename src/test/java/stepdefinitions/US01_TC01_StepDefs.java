package stepdefinitions;
import io.cucumber.java.en.*;
import utilities.Driver;
public class US01_TC01_StepDefs {
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
    }

    @When("kullanici giris yap linke tiklar")
    public void kullaniciGirisYapLinkeTiklar() {
    }
}
