package RegressionTests;

import Base.BaseUtils;
import PageObjects.Homepage;
import org.junit.Test;

public class TopNavTest extends BaseUtils {

    @Test
    public void topNavIsDisplayedOnHomepage() {
        Homepage topNav = new Homepage(driver);
        topNav.topNavIsDisplayed();
        topNav.clickOnCatsTab();
    }
}

