package pages;
public class AllPages {
    public AllPages() {
    }
    private HomePage homePage;
    private SigninPage signinPage;

    public SigninPage signinPage() {
        if (signinPage == null) {
            signinPage = new SigninPage();
        }
        return signinPage;
    }


    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }
}
