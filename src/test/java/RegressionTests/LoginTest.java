package RegressionTests;

import Base.BaseUtils;
import PageObjects.LoginPage;
import org.junit.*;

public class LoginTest extends BaseUtils {

    @Test
    public void loginTestValid() {

        LoginPage loginPage = new LoginPage();
        loginPage.login("sesermanmadalina@yahoo.com", "Madalina91");

    }

    @Test
    public void loginTestInvalid() {

        LoginPage loginPage = new LoginPage();
        loginPage.login("sesermanmadalina@yahoo.com", "Madalina");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(loginPage.isErrorDisplayed());
        loginPage.getTheErrorMessage().equals("Datele de logare introduse nu sunt corecte. Vă rugăm verificați și încercați din nou.");


    }


}
