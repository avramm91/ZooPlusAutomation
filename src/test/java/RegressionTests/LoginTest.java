package RegressionTests;

import Base.BaseUtils;
import PageObjects.LoginPage;
import org.junit.*;
import org.openqa.selenium.WebElement;


public class LoginTest extends BaseUtils {

    @Test
    public void loginTestValid() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("sesermanmadalina@yahoo.com", "Madalina91");

    }

    @Test
    public void loginTestInvalid() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("sesermanmadalina@yahoo.com", "Madalina","Datele de logare introduse nu sunt corecte. Vă rugăm verificați și încercați din nou.");

    }


}
