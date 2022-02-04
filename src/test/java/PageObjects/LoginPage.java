package PageObjects;

import Base.BaseUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseUtils{

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

    public LoginPage() {
        PageFactory.initElements(driver, this);
}
    public void login(String email, String password) {
        acceptCookies.click();
        userProfileButton.click();
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        intraInContButton.click();
    }

    public Boolean isErrorDisplayed(){
       return loginError.isDisplayed();
    }

    public String getTheErrorMessage(){
        return loginError.getText();
    }


}
