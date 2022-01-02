package Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class User_LogOut

{

    private WebDriver driver;



        public User_LogOut(WebDriver driver)
        {

            this.driver=driver;


        }


    private By LogOut_Button  = By.xpath("/html//header[@id='header']//nav//a[@title='Log me out']");

         public void LogOut()

         {

             ElementActions.click(driver,LogOut_Button);
         }

}
