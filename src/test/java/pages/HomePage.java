package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement accountButton;

    @FindBy(xpath = "//a[@href='/register']")
    public WebElement dontHaveAnAccount_link;
    @FindBy(id="register-email-input")
    public WebElement email_input;
    @FindBy(id = "register-password-input")
    public WebElement password_input;
    @FindBy(id="register-password-input-2")
    public WebElement password2_input;
    @FindBy(xpath = "//button[.='Register']")
    public WebElement register_button;
}
