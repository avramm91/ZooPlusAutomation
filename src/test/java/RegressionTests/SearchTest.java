package RegressionTests;

import Base.BaseUtils;
import PageObjects.Homepage;
import org.junit.Test;

public class SearchTest extends BaseUtils {

    @Test
    public void testSearch(){
        Homepage search = new Homepage(driver);
        search.searchBar();
    }
}
