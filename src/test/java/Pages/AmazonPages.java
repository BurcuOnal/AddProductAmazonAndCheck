package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;
    static By search = By.id("twotabsearchtextbox");
    static By magnifyingIcon = By.id("nav-search-submit-button");
    static By customerReview = By.cssSelector(".a-icon.a-icon-star-medium.a-star-medium-4");
    static By filterApplePhone = By.xpath("//li[@id='p_n_feature_nine_browse-bin/2488717011']//i[@class='a-icon a-icon-checkbox']");
    static By FilterClimateFriendly = By.cssSelector("div[id='climatePledgeFriendlyRefinements'] i[class='a-icon a-icon-checkbox']");
    static By firstProduct = By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1'] div[class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style'] span:nth-child(1)");
    static By addCart = By.id("add-to-cart-button");
    static By closeIcon = By.id("attach-close_sideSheet-link");
    static By goCart = By.id("nav-cart-count");
    static By checkCart = By.cssSelector("span[class='a-truncate sc-grid-item-product-title a-size-base-plus'] span[class='a-truncate-cut']");

    public AmazonPages(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.elementHelper = new ElementHelper(driver);
    }

    public static void homepage() { // Config'ten URL çekilir direkt
    }

    public static void clickSearchBox() {
        ElementHelper.click(search);
    }

    public static void specifyProduct() {
        ElementHelper.sendKey(search,"phone case");
    }

    public static void magnifyingGlassIconClick() {
        ElementHelper.click(magnifyingIcon);
    }

    public static void CustomerReview() {
        ElementHelper.click(customerReview);
    }

    public static void filterApple() {
        ElementHelper.click(filterApplePhone);
    }

    public static void ClimatePledgeFriendly() {
        ElementHelper.click(FilterClimateFriendly);
    }

    public static void clickFirstProduct() {
        ElementHelper.click(firstProduct);
    }

    public static void addCart() {
        ElementHelper.click(addCart);
        ElementHelper.click(closeIcon);
        ElementHelper.click(goCart);
    }
    public static void checkCart() { ElementHelper.checkVisibility(checkCart);

    }

}
