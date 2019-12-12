package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected WebDriver driver;
	protected long timeOut = 60;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		// new WebDriverWait(driver,
		// timeOut).until(((JavascriptExecutor)driver).executeScript("return
		// document.readyState").equals("complete")); <- needs work

	}

	protected WebElement findById(String loc) {
		return new WebDriverWait(driver, timeOut).until(ExpectedConditions.visibilityOfElementLocated(By.id(loc)));
	}

	protected WebElement findByXPath(String loc) {
		return new WebDriverWait(driver, timeOut).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc)));
	}

	protected WebElement findByName(String loc) {
		return new WebDriverWait(driver, timeOut).until(ExpectedConditions.visibilityOfElementLocated(By.name(loc)));
	}

}
