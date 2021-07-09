package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage{
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By search = By.xpath("//input[@type='search']");
	By productName = By.cssSelector("h4.product-name");
	By plusButton = By.cssSelector("a.increment");
	By addCartBtn = By.xpath("//button[contains(text(),'ADD TO CART')]");
	By cartIcon = By.cssSelector("a.cart-icon");
	By btnProceedToCout = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	
	public WebElement getSearch() {
		return driver.findElement(search);
	}
	
	public WebElement getProductName() {
		return driver.findElement(productName);
	}
	
	public WebElement getPlusButton() {
		return driver.findElement(plusButton);
	}
	
	public WebElement getAddCartBtn() {
		return driver.findElement(addCartBtn);
	}
	
	public WebElement getCartIcon() {
		return driver.findElement(cartIcon);
	}
	
	public WebElement getBtnProceed() {
		return driver.findElement(btnProceedToCout);
	}
}
