package pageobjs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.BasePage;

public class LoginPage extends BasePage {

	private String userNameLoc = "(//input[@name='session[username_or_email]'])[2]";
	private String pWordLoc = "(//input[@name='session[password]'])[2]";
	private String rememberMeTickBox = "(//input[@name='remember_me'])[2]";
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void loginWithCredentials(String username, String password) {
		WebElement tickBox = findByXPath(rememberMeTickBox);
		findByXPath(userNameLoc).sendKeys(username);
		findByXPath(pWordLoc).sendKeys(password);
		// don't remember me
		tickBox.click(); 
	}
}
