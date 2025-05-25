package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import pages.AllPages;
import utilities.Driver;
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
    }
}
