package RegressionTests;

import Base.BaseUtils;
import PageObjects.LoginPage;
import org.junit.*;

public class LoginTest extends BaseUtils {

    private String EMAIL = "sesermanmadalina@yahoo.com";
    private String PASSWORD = "Madalina91";
    private String WRONGPASSWORD = "Madalina";
    private String ERRORMESSAGE = "Datele de logare introduse nu sunt corecte. Vă rugăm verificați și încercați din nou.";

    @Test
    public void loginTestValid() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(EMAIL, PASSWORD);
    }

    @Test
    public void loginTestInvalid() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(EMAIL, WRONGPASSWORD, ERRORMESSAGE);
    }
}
