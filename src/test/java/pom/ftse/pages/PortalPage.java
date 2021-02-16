package pom.ftse.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PortalPage {
	
	// things on the page
	// annotations for selectors
	
	@FindBy(xpath = "//*[@id=\"view-constituents\"]/ul/li[2]/a")
	private WebElement risersLink;
	@FindBy(xpath = "//*[@id=\"view-constituents\"]/ul/li[3]/a")
	private WebElement fallersLink;
	
	@FindBy(xpath = "//*[@id=\'acceptCookie\']")
	private WebElement cookieButton;
	
	
	// constructor
	public PortalPage(WebDriver driver) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// methods for doing things
	public void navRisers() {
		risersLink.click();
	}
	
	public void navFallers() {
		fallersLink.click();
	}
	
	public void clickCookie() {
		cookieButton.click();
	}
	
}
