package StepDefinitions;

import Pages.AmazonPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AmazonSteps {
    WebDriver driver = DriverFactory.getDriver();
    AmazonPages amazonPages = new AmazonPages(driver);

    @Given("Go to homepage of Amazon.com website")
    public void goToHomepageOfAmazonComWebsite() {
        AmazonPages.homepage();
    }

    @When("Click the search text box")
    public void clickTheSearchTextBox() {
        AmazonPages.clickSearchBox();
    }
    @When("Specify the product's name")
    public void specifyTheProductSName() {
        AmazonPages.specifyProduct();
    }

    @When("Click the magnifying glass icon to search the product")
    public void clickTheMagnifyingGlassIconToSearchTheProduct() {
        AmazonPages.magnifyingGlassIconClick();
    }

    @When("Filter for Customer Reviews four stars and up")
    public void filterForCustomerReviewsFourStarsAndUp() { AmazonPages.CustomerReview();
    }
    @When("Filter for Apple")
    public void filterForApple() {
        AmazonPages.filterApple();
    }
    @When("Filter for Climate Pledge Friendly")
    public void filterForClimatePledgeFriendly() { AmazonPages.ClimatePledgeFriendly ();
    }
    @When("Click the first product on the list")
    public void clickTheFirstProductOnTheList() {
        AmazonPages.clickFirstProduct();
    }

    @When("Add the product to the cart")
    public void addTheProductToTheCart() {
        AmazonPages.addCart();
    }

    @Then("Check the cart page")
    public void checkTheCartPage() {
        AmazonPages.checkCart();
    }

}
