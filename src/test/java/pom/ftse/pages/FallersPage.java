package pom.ftse.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
	public String getFallerName() {
		return topFaller.getText();
	}
	
}
