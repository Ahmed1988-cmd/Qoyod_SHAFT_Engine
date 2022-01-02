package Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class User_HomePage

{
    private WebDriver driver;

    public User_HomePage(WebDriver driver)
    {

        this.driver=driver;
    }

private By signUp_button = By.xpath("/html//header[@id='header']//nav//a[@title='Log in to your customer account']");

    public void UserSignUp()

    {
        new ElementActions(driver)
                .click(signUp_button);
    }

}
