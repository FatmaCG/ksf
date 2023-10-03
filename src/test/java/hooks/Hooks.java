package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Hooks{
    public static WebDriver driver;
    public static Actions actions;

    public static boolean isHeadless = false;
    public static String browserType = ConfigReader.getProperty("browser");

    public static boolean isFullScreen = true;
    public static int width;
    public static int height;

    @Before(value = "@headless", order = 0)
    public void setIsHeadless() {
        isHeadless = true;
    }

    @Before(value = "@firefox", order = 0)
    public void setIsFirefox() {
        browserType = "firefox";
    }

    @Before(value = "@iPhone12", order = 0)
    public void setiPhone12() {
        isFullScreen = false;
        width = 390;
        height = 844;
    }

    @Before(order = 1, value = "@UI")
    public void setup() {

        driver = Driver.getDriver();

        actions = new Actions(driver);
    }

    @After(value = "@UI")
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            final byte[] screenshot =
                    ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshots");
        }
        Driver.closeDriver();
    }

 /*   @Before(value = "@login")
    public void login() {
        driver.get(ConfigReader.getProperty("app_url"));
        getHomePage().button_account.click();
        ReusableMethods.waitForVisibility(getAccountPage().input_email, 5);
        getAccountPage().input_email.sendKeys(ConfigReader.getProperty("username"));
        getAccountPage().input_password.sendKeys(ConfigReader.getProperty("password"));
        getAccountPage().button_login.sendKeys(Keys.PAGE_DOWN);
        getAccountPage().button_login.click();
        ReusableMethods.waitForVisibility(getUserPanelPage().sidebar_userPanel, 5);
    }*/

    @Before("@DB")
    public void setupMySqlDatabase() {
  //      DBUtils.createMysqlConnection("kesifplus");
    }

    @After("@DB")
    public void closeMySqlDatabase() {
     //   DBUtils.closeDatabase();
    }

    @Before("@API")
    public void setBaseUrl() {
     //   kesifPlusSetUp();
    //    generateToken();
    }
}
