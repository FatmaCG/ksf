package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    private HomePage homePage;
    private LoginPage loginPage;
    private UserPanelPage userPanelPage;

    public HomePage getHomePage() {
        if (homePage==null)
            homePage=new HomePage();
        return homePage;
    }
    public LoginPage getLoginPage(){
        if (loginPage==null)
            loginPage=new LoginPage();
        return loginPage;
    }

    public UserPanelPage getUserPanelPage() {
        if (userPanelPage==null)
            userPanelPage=new UserPanelPage();
        return userPanelPage;
    }
}
