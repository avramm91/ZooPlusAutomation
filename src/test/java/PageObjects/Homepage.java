package PageObjects;

import Base.BasePage;
import Help.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Homepage extends BasePage {

    public Homepage(WebDriver driver) {
        super(driver);
        elementMethods = new ElementMethods(driver);
    }

    public ElementMethods elementMethods;

    @FindBy(id = "topNavigation")
    public WebElement topNavigation;

    @FindBy(css = "[data-toplevelcategory = 'cats']")
    public WebElement catsTab;

    @FindBy(id = "hopps_search_bar")
    public WebElement search;

    @FindBy(id = "search_query_field")
    public WebElement searchZone;

    @FindBy(css = "[type = 'submit']")
    public WebElement searchSubmit;

    @FindBy(css = ".sc-bSqaIl.RugTE>div>div [class='sc-hGnimi bquGUf product-variant']>div>div [data-zta]>form>div>button[id='plus_1828674']")
    public WebElement increaseQuantity;

    @FindBy(css = ".sc-bSqaIl.RugTE>div>div [class='sc-hGnimi bquGUf product-variant']>div>div [data-zta]>form>div[data-articleid='1828674']")
    public WebElement addToCart;

    @FindBy(css = ".css-1jcelfz")
    public WebElement cartCheckout;

    @FindBy(css = ".css-1jcelfz>span")
    public WebElement cartItemsFlag;

    @FindBy(css = "div.cart__table.two__column > div.cart__table__row.two__column > div.quantity.regular__product.two__column > form > button")
    public WebElement deleteItemFromCart;

    @FindBy(css = ".cart__empty__box")
    public WebElement emptyCartMessage;


    public void topNavIsDisplayed() {
        acceptCookies();
        elementMethods.isElementDisplayed(topNavigation);
    }

    public void clickOnCatsTab() {
        catsTab.click();
    }

    public void searchBar() {
        acceptCookies();
        elementMethods.isElementDisplayed(search);
        searchZone.sendKeys("soarece");
        searchSubmit.click();
        NavigateToURL("https://www.zooplus.ro/search/results?q=soarece");
        increaseQuantity.click();
        addToCart.click();
        elementMethods.waitElement(cartItemsFlag);
        cartCheckout.click();
        deleteItemFromCart.click();
        WaitToLoadURL("https://www.zooplus.ro/checkout/cartEmpty.htm");
        elementMethods.isElementDisplayed(emptyCartMessage);
    }
}