package Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseUtils {

    public WebDriver driver;

    @Before
    public  void launchApp() {

        //set the WebDriver
        System.setProperty("webdriver.chrome.driver", "/Users/ravram/ZooPlusAutomationExam/src/test/resources/chromedriver");

        //open a Chrome instance
        driver = new ChromeDriver();

        //access the URL
        driver.get("https://www.zooplus.ro/");

        //maximize the window
        driver.manage().window().maximize();
    }

    @After
    public void closeApp() {
        driver.quit();
    }
}
