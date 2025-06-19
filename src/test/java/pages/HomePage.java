package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement merhabaGirisYapinHesapVeListelerTextTitleHome;

    @FindBy(xpath = "//*[text()='Giriş yap']")
    public WebElement girisYapButonHome;

    @FindBy(xpath = "//*[@id='nav-link-accountList']")
    public WebElement gokselKayitliKullaniciAdiHome;
}
