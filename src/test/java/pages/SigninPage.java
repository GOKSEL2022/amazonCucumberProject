package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SigninPage {
    public SigninPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='ap_email_login']")
    public WebElement cepTelefonuNumarasiVeyaEpostaGirinTextboxSignin;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement devamEtButonSignin;

    @FindBy(id = "signInSubmit")
    public WebElement girisYapButonSignin;



}
