package pom.ftse.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RisersPage {
	
	// things on the page
	// annotations for selectors
	
	@FindBy(xpath = "//*[@id=\'view-constituents\']/div[2]/table/tbody/*[1]/*[1]")
	private WebElement topRiser;
	
	// constructor
	public RisersPage(WebDriver driver) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// wait for riser to load
		public void waitRiser(WebDriver driver) {
			WebElement RiserWaitElement = (new WebDriverWait(driver, 2))
							.until(ExpectedConditions
							.presenceOfElementLocated(By.id("view-constituents")));
		}
	
	// methods for doing things
	public String getRiserName() {
		return topRiser.getText();
	}
	
}
