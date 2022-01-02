package Pages;

import com.shaft.gui.element.ElementActions;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.shaft.validation.Validations;
import com.shaft.gui.element.ElementActions;
public class User_Payment

{

    private WebDriver driver;

    public User_Payment(WebDriver driver)
    {

        this.driver=driver;


    }

    private By Proceed_Button  = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
    private By ProceedToCheckOut_Button  = By.xpath("//*[@id=\"center_column\"]/form/p/button");
    private By TearmsOfServices_Button  = By.xpath("/html//form[@id='form']//label");
    private By CheckOut_Button  = By.xpath("//*[@id=\"form\"]/p/button");
    private By SelectPayment_Button  = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a");
    private By ConfirmMyOrder_Button  = By.xpath("//*[@id=\"cart_navigation\"]/button");


    public void Payment()

    {
        ElementActions.click(driver,Proceed_Button);
        ElementActions.click(driver,ProceedToCheckOut_Button);
        ElementActions.click(driver,TearmsOfServices_Button);
        ElementActions.click(driver,CheckOut_Button);
        ElementActions.click(driver,SelectPayment_Button);
        ElementActions.click(driver,ConfirmMyOrder_Button);
        Assertions.assertNotEmpty("//*[@id=\"center_column\"]/h1","//*[@id=\"center_column\"]/h1");


    }

}
