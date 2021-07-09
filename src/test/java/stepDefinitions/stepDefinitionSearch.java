package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.Automation.Base;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;

public class stepDefinitionSearch extends Base {

	// public WebDriver driver;
	HomePage homePage;
	CheckoutPage checkoutPage;

	// Search.feature
	@Given("^User is on green cart landing page$")
	public void user_is_on_green_cart_landing_page() throws Throwable {
		driver = Base.getDriver();

	}

	@When("^User searched for \"([^\"]*)\" vegetable$")
	public void user_searched_for_something_vegetable(String vegetable) throws Throwable {

		homePage = new HomePage(driver);
		homePage.getSearch().sendKeys(vegetable);

		// WebElement fieldSearch =
		// driver.findElement(By.xpath("//input[@type='search']"));
		// fieldSearch.sendKeys(vegetable);
		Thread.sleep(2000);
	}

	@Then("^\"([^\"]*)\" results are displayed$")
	public void something_results_are_displayed(String vegetable) throws Throwable {
		// WebElement cardCucumber =
		// driver.findElement(By.cssSelector("h4.product-name"));
		// String textCardCucumber = cardCucumber.getText();
		// Assert.assertEquals("Cucumber - 1 Kg", textCardCucumber);
		Assert.assertTrue(homePage.getProductName().getText().contains(vegetable));
	}

	@And("^Added item to cart$")
	public void added_item_to_cart() throws Throwable {
		// WebElement plusButton = driver.findElement(By.cssSelector("a.increment"));
		// plusButton.click();
		// driver.findElement(By.xpath("//button[contains(text(),'ADD TO
		// CART')]")).click();
		homePage.getPlusButton().click();
		homePage.getAddCartBtn().click();
	}

	@And("^User proceeded to Checkout page for purchase$")
	public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {
		// driver.findElement(By.cssSelector("a.cart-icon")).click();
		// driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO
		// CHECKOUT')]")).click();
		homePage.getCartIcon().click();
		homePage.getBtnProceed().click();
	}

	@Then("^Verify selected \"([^\"]*)\" item are displayed in Checkout page$")
	public void verify_selected_something_item_are_displayed_in_checkout_page(String vegetable) throws Throwable {
		// WebElement valueProduct =
		// driver.findElement(By.cssSelector("p.product-name"));
		checkoutPage = new CheckoutPage(driver);
		Assert.assertTrue(checkoutPage.getProductLabel().getText().contains(vegetable));
	}
	
	@When("^User searched for (.+) vegetables$")
    public void user_searched_for_vegetable(String name) throws Throwable {
		homePage = new HomePage(driver);
		homePage.getSearch().sendKeys(name);

		// WebElement fieldSearch =
		// driver.findElement(By.xpath("//input[@type='search']"));
		// fieldSearch.sendKeys(vegetable);
		Thread.sleep(2000);
    }
	
	@Then("^Verify selected (.+) item are displayed in Checkout page$")
    public void verify_selected_item_are_displayed_in_checkout_page(String name) throws Throwable {
		checkoutPage = new CheckoutPage(driver);
		Assert.assertTrue(checkoutPage.getProductLabel().getText().contains(name));
    }
}
