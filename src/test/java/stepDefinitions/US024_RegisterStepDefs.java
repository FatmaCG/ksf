package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

import static hooks.Hooks.driver;

public class US024_RegisterStepDefs extends BasePage {
    @Given("user goes to home page")
    public void user_goes_to_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }

    @When("user clicks Don't have an account? Register.link")
    public void user_clicks_don_t_have_an_account_register_link() {
        getHomePage().dontHaveAnAccount_link.click();
    }

    @When("user clicks on Account button")
    public void user_clicks_on_account_button() {
        getHomePage().accountButton.click();
    }

    @When("user enters email")
    public void user_enters_email() {
        getHomePage().email_input.sendKeys("qa312@hotmail.com");
    }

    @When("user enters password")
    public void user_enters_password() {
        getHomePage().password_input.sendKeys("123456789");
    }

    @When("user enters password again")
    public void user_enters_password_again() {
        getHomePage().password2_input.sendKeys("123456789");
    }

    @When("user clicks to register button")
    public void user_clicks_to_register_button() {
        getHomePage().register_button.click();
     //   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
    }

    @Then("user should see url contains user-panel")
    public void user_should_see_url_contains_user_panel() {

    }

    @Then("user should see the Register Successfully! message")
    public void userShouldSeeTheRegisterSuccessfullyMessage() {
        ReusableMethods.waitFor(2);
       // String actualAlert =driver.switchTo().alert().getText();
       // System.out.println(actualAlert);
       // Assert.assertEquals("Register Successfully!",actualAlert);
       // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
       // driver.switchTo().alert().accept();
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }
}
