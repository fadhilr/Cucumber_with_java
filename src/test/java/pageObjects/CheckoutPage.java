package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
public WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By productNameLabel = By.cssSelector("p.product-name");
	
	
	public WebElement getProductLabel() {
		return driver.findElement(productNameLabel);
	}
}
