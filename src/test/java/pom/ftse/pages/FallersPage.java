package pom.ftse.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FallersPage {
	
	// things on the page
	// annotations for selectors
	
	@FindBy(xpath = "//*[@id=\'view-constituents\']/div[2]/table/tbody/*[1]/*[1]")
	private WebElement topFaller;
	
	// constructor
	public FallersPage(WebDriver driver) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// methods for doing things
	
	// wait for faller to load
	public void waitFaller(WebDriver driver) {
		WebElement FallerWaitElement = (new WebDriverWait(driver, 2))
						.until(ExpectedConditions
						.presenceOfElementLocated(By.id("view-constituents")));
	}
	
	public String getFallerName() {
		return topFaller.getText();
	}
	
}
