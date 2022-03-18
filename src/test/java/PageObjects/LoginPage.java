package PageObjects;

import Base.BasePage;
import Help.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
        elementMethods = new ElementMethods(driver);
    }

    public ElementMethods elementMethods;

    @FindBy(className = "my__account__text")
    public WebElement userProfileButton;

    @FindBy(css = "#mzp-navigation > div[class='v3-flatbox--shadow App-zooplus-module__MenuContainer--zna1UxpK2N']> ul[class='App-zooplus-module__MenuList--gzfhm0QmKA']>li[class='App-zooplus-module__Logout--pAAYD4Ittg']")
    public WebElement logOutButton;

    @FindBy(id = "modal fade feedback-logout")
    public WebElement logOutFeedback;

    @FindBy(id = "login-email")
    public WebElement emailField;

    @FindBy(id = "login-password")
    public WebElement passwordField;

    @FindBy(id = "loginButton")
    public WebElement intraInContButton;

    @FindBy(id = "js-loginError-notificationText")
    public WebElement loginError;

    public void login(String email, String password, String message) {
        acceptCookies();
        userProfileButton.click();
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        intraInContButton.click();
        elementMethods.isElementDisplayed(loginError);
        elementMethods.validateElementMessage(loginError, message);
    }

    public void login(String email, String password) {
        acceptCookies();
        userProfileButton.click();
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        intraInContButton.click();
        WaitToLoadURL("https://www.zooplus.ro/account/overview");
        elementMethods.isElementDisplayed(logOutButton);
        logOutButton.click();
    }


}
