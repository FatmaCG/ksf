package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPanelPage extends BasePage{
    @FindBy(xpath = "//*[text()='Update Introduction']")
    public WebElement button_updateIntroduction;


}
