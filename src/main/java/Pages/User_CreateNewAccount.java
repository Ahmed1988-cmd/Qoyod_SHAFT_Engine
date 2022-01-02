package Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class User_CreateNewAccount
{
    private WebDriver driver;

    public User_CreateNewAccount(WebDriver driver)
    {

        this.driver=driver;
    }

    private By Email_textfield = By.id("email_create");
    private By Create_button = By.id("SubmitCreate");


    public void CreateNewAccount(String Email)

    {
        {
            new ElementActions(driver)
                    .type(Email_textfield, Email)
                    .click(Create_button);
        }

    }

}
