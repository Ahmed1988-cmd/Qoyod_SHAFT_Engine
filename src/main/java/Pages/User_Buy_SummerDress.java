package Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class User_Buy_SummerDress

{


    private WebDriver driver;



    public User_Buy_SummerDress(WebDriver driver)
    {

        this.driver=driver;


    }

    private By Dresses_Button  = By.xpath("//div[@id='block_top_menu']/ul/li[2]/a[@title='Dresses']");
    private By SummerDress_Button  = By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[3]/a");
   private By List_check  = By.xpath("//li[@id='list']//i[@class='icon-th-list']");
   private By  AddToCart_Button  = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div/div[3]/div/div[2]/a[1]/span");
    private By  ProceedtoCheckOut_Button  = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");


    public void SummerDresses()

    {
        ElementActions.click(driver,Dresses_Button);
       ElementActions.click(driver,SummerDress_Button);
        ElementActions.click(driver,List_check);
     ElementActions.click(driver,AddToCart_Button);
       ElementActions.click(driver,ProceedtoCheckOut_Button);

    }


}
