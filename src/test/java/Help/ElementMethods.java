package Help;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementMethods {
    public WebDriver driver;

    public ElementMethods(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean isElementDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    public void validateElementMessage(WebElement element, String expected) {
        waitElement(element);
        String actual = element.getText();
        Assert.assertEquals("The expected is not equal with actual", expected, actual);
    }

    public void waitElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
