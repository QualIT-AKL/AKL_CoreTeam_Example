package pageobjs;

import org.openqa.selenium.WebDriver;

import common.BasePage;

public class HomePage extends BasePage {
	
	private String loginButtonLoc = "(//a[contains(.,'Log in')])[2]";

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void goToLoginPage() {
		findByXPath(loginButtonLoc).click();
	}	
}
