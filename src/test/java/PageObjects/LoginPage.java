package PageObjects;

import Base.BaseUtils;
import Help.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    @FindBy(className = "my__account__text")
    WebElement userProfileButton;

    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement acceptCookies;

    @FindBy(id = "login-email")
    WebElement emailField;

    @FindBy(id = "login-password")
    WebElement passwordField;

    @FindBy(id = "loginButton")
    WebElement intraInContButton;

    @FindBy(id = "js-loginError-notificationText")
    WebElement loginError;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elementMethods = new ElementMethods(driver);
}
    public void login(String email, String password, String message) {
        acceptCookies.click();
        userProfileButton.click();
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        intraInContButton.click();
        elementMethods.isElementDisplayed(loginError);
        elementMethods.validateElementMessage(loginError, message);
    }

    public void login(String email, String password) {
        acceptCookies.click();
        userProfileButton.click();
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        intraInContButton.click();

    }





}
