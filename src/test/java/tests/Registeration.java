package tests;

import Pages.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import java.io.FileReader;
import java.io.IOException;

public class Registeration extends TestBase {

    User_HomePage SignOBJ;
    User_CreateNewAccount CreateAccountOBJ;
    User_CreateAccountDetails UserDetailsOBJ;
    User_LogOut logOutOBJ;
    User_LogIn LoginOBJ;
    User_Buy_SummerDress DressOBJ;
    User_Payment PaymentObj;

    //First User
    private static String UserEmailText;

    private static String FirstNameText;
    private static String lastnameText;
    private static String EmailText;
    private static String PasswordText;
    private static String AddressFirstNameText;
    private static String AddressLastNameText;
    private static String AddressText;
    private static String CityText;
    private static String PostCodeText;
    private static String MobileText;
    private static String MyAddressText;

    //UserLogin
    private static String SignInText;
    private static String passText;


    private static String filePath = "C:\\Users\\ZaZa\\eclipse-workspace\\Qoyod\\src\\test\\java\\Data\\testData.json";

    /**
     * this function for reading test data from json file
     *
     * @throws IOException
     * @throws ParseException
     */


    public void getDataForTesting() throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader(filePath);

        //Read JSON file
        Object dataObj = jsonParser.parse(reader);
        JSONObject resultObj = (JSONObject) dataObj;

        // First User
        UserEmailText = (String) resultObj.get("UserEmailText");

        FirstNameText = (String) resultObj.get("FirstNameText");
        lastnameText = (String) resultObj.get("lastnameText");
        EmailText = (String) resultObj.get("EmailText");
        PasswordText = (String) resultObj.get("PasswordText");
        AddressFirstNameText = (String) resultObj.get("AddressFirstNameText");
        AddressLastNameText = (String) resultObj.get("AddressLastNameText");
        AddressText = (String) resultObj.get("AddressText");
        CityText = (String) resultObj.get("CityText");
        PostCodeText = (String) resultObj.get("PostCodeText");
        MobileText = (String) resultObj.get("MobileText");
        MyAddressText = (String) resultObj.get("MyAddressText");

        //SignIn
        SignInText = (String) resultObj.get("SignInText");
        passText = (String) resultObj.get("passText");

    }


    @Description("Check That User can Create new Account with  new Email")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1, alwaysRun = true)
    public void FirstUserHomePage() throws IOException, ParseException, InterruptedException {
        getDataForTesting();

        SignOBJ = new User_HomePage(driver);
        SignOBJ.UserSignUp();

    }

    @Description("Check That User CREATE AN ACCOUNT is Open and user fill his information")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 2)
    public void FirstUserRegister() throws IOException, ParseException, InterruptedException {
        getDataForTesting();

        CreateAccountOBJ = new User_CreateNewAccount(driver);
        CreateAccountOBJ.CreateNewAccount(UserEmailText);

    }

    @Description("After User Create his new Account Then he can Fill His Account Information")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3)
    public void FirstUserFillHisDetails() throws IOException, ParseException, InterruptedException {
        getDataForTesting();

        UserDetailsOBJ = new User_CreateAccountDetails(driver);
        UserDetailsOBJ.PersonalInfo(FirstNameText, lastnameText, EmailText, PasswordText, AddressFirstNameText, AddressLastNameText, AddressText, CityText, PostCodeText, MobileText, MyAddressText);

    }

    @Description("After user Create new Account THEN he try to LogOut")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void FirstUserLogOut() throws IOException, ParseException, InterruptedException {
        getDataForTesting();

        logOutOBJ = new User_LogOut(driver);
        logOutOBJ.LogOut();

    }

    @Description("user Try to login with his new credential")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void FirstUserLogIN() throws IOException, ParseException, InterruptedException {
        getDataForTesting();

        LoginOBJ = new User_LogIn(driver);
        LoginOBJ.LogIn(SignInText, passText);

    }

    @Description("user Try to Buy Summer Dresses")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void FirstUserBuySummerDresses() throws IOException, ParseException, InterruptedException {
        getDataForTesting();

        DressOBJ = new User_Buy_SummerDress(driver);
        DressOBJ.SummerDresses();

    }

    @Description("purchase order")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void FirstUserpurchaseorder() throws IOException, ParseException, InterruptedException {
        getDataForTesting();

        PaymentObj = new User_Payment(driver);
        PaymentObj.Payment();

    }

}

