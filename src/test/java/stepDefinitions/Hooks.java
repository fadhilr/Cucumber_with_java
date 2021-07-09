package stepDefinitions;

import Cucumber.Automation.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base{
	
	@Before("@MobileTest")
	public void beforevalidation() {
		System.out.println("Mobile before hook");
	}
	
	@After("@MobileTest")
	public void aftervalidation() {
		System.out.println("Mobile after hook");
	}
	
	@Before("@WebTest")
	public void beforeWebvaldiation()
	{
		System.out.println("Before Web  hook");
	}
	
	@After("@WebTest")
	public void AfterWebvaldiation()
	{
		System.out.println("  After Web before hook");
	}
	
	@After("@SeleniumRegression")
	public void afterSeleniumCase() {
		driver.close();
	}
	@After("@SeleniumSmoke")
	public void afterSeleniumSmoke() {
		driver.close();
	}
}
