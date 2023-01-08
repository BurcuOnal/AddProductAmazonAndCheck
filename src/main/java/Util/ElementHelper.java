package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class ElementHelper {
    WebDriver driver;
    static WebDriverWait wait;
    Actions action;
    public ElementHelper(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.action = new Actions(driver);
    }
    public static WebElement presenceElement(By key) { //element gelmesini bekle
        return
                wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }
    public static WebElement findElement(By key) {
        WebElement element = presenceElement(key);
        return element;
    }
    public static void click(By key) {
        findElement(key).click();
    }
    public static void sendKey (By key, String text) {
        findElement(key).sendKeys(text);
    }
    public static void checkVisibility (By key){
        wait.until(ExpectedConditions.visibilityOf(findElement(key)));
    }


}
