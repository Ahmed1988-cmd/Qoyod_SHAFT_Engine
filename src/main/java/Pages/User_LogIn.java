package Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class User_LogIn

{


    private WebDriver driver;



    public User_LogIn(WebDriver driver)
    {

        this.driver=driver;


    }


    private By Email_Text  = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input");
    private By Password_Text  = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input");
    private By Signin_Button  = By.xpath("//*[@id=\"SubmitLogin\"]/span");


    public void LogIn(String Email, String Password)

    {

        ElementActions.type(driver, Email_Text, Email);
        ElementActions.type(driver, Password_Text, Password);
        ElementActions.click(driver,Signin_Button);

    }
}
