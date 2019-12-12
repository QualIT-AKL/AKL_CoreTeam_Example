package pageobjs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.BasePage;

public class TwitterUserHomePage extends BasePage {
	
	private String dashboardProfileNameLoc = "//div[contains(@class,'DashboardProfileCard-content')]/..//a[contains(@class,'u-textInheritColor')]";

	public TwitterUserHomePage(WebDriver driver) {
		super(driver);
	}

	public boolean verifyDashboardProfileName(String fullName) {

		boolean correctNameFound = false;
		WebElement profileName = findByXPath(dashboardProfileNameLoc);

		// check that the text of profileName
		// in fact contains the set full name
		if (profileName.getText().contains(fullName)) {
			correctNameFound = true;
		}

		return correctNameFound;
	}
}
