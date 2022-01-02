package Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class User_CreateAccountDetails

{

    private WebDriver driver;

    public User_CreateAccountDetails(WebDriver driver)
    {

        this.driver=driver;


    }

    private By FirstName_Text = By.xpath("//input[@id='customer_firstname']");
    private By lastname_Text = By.xpath("//input[@id='customer_lastname']");
    private By Email_Text  = By.xpath("/html//input[@id='email']");
    private By Password_Text = By.id("passwd");


    //YOUR ADDRESS
   private By AddressFirstName_Text = By.xpath("//input[@id='firstname']");
    private By AddressLastName_Text = By.xpath("//input[@id='lastname']");
   private By Address_Text = By.id("address1");
   private By City_Text  = By.id("city");
   private By StateDrpDown = By.xpath("//*[@id=\"id_state\"]");
   private By PostCode_Text = By.xpath("/html//input[@id='postcode']");
   private By MobileNumber_Text = By.xpath("//input[@id='phone_mobile']");
   private By MyAddress_Text = By.xpath("//input[@id='alias']");
   private By Register_Button = By.id("submitAccount");

    public void PersonalInfo(String FirstName,String LastName, String Email, String Pass, String AddressFirstName, String AddressLastName, String Address, String City, String postcode, String Mobile, String adress ) throws InterruptedException

    {
        {
                    ElementActions.type(driver, FirstName_Text, FirstName);
                    ElementActions.type(driver, lastname_Text, LastName);
                    ElementActions.type(driver, Email_Text, Email);
                    ElementActions.type(driver, Password_Text, Pass);
                    ElementActions.type(driver, AddressFirstName_Text, AddressFirstName);
                    ElementActions.type(driver, AddressLastName_Text, AddressLastName);
                    ElementActions.type(driver,Address_Text,Address);
                    ElementActions.type(driver,City_Text,City);
                    ElementActions.select(driver, StateDrpDown,"Arkansas" );
                    ElementActions.type(driver,PostCode_Text,postcode);
                    ElementActions.type(driver,MobileNumber_Text,Mobile);
                    ElementActions.type(driver,MyAddress_Text,adress);
                    ElementActions.click(driver,Register_Button);
        }
    }

}
