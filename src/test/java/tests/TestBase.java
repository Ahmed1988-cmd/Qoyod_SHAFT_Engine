
package tests;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TestBase

{

     WebDriver driver;

    @BeforeClass
    public void startdriver ()
    {

        driver = DriverFactory.getDriver();
        BrowserActions.navigateToURL(driver,"http://automationpractice.com/index.php");

    }

    @AfterClass
    public void stopdriver()
    {
        driver.close();
    }


}
