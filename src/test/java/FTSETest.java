
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import pom.ftse.pages.FallersPage;
import pom.ftse.pages.PortalPage;
import pom.ftse.pages.RisersPage;

public class FTSETest {

    private static RemoteWebDriver driver;

    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();//chromeCfg());

    }
    
    @Test
    public void largestRiserTest() {
    	
    	System.out.println("starting test");
    	
    	// GIVEN - that I can navigate to the website 'https://www.hl.co.uk/shares/stock-market-summary/ftse-100'
    	driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100");
    	
    	PortalPage website = PageFactory.initElements(driver, PortalPage.class);
    	
    	RisersPage risers = PageFactory.initElements(driver, RisersPage.class);
    	
    	// WHEN - I click the risers link
    	website.navRisers();
    	
    	// AND - find the top riser
    	String topRiser = risers.getRiserName();
    	
    	// THEN - print the top riser
    	System.out.println("Top riser: " + topRiser);
    	
    }
    
    @Test
    public void largestFallerTest() {
    	
    	System.out.println("starting test");
    	
    	// GIVEN - that I can navigate to the website 'https://www.hl.co.uk/shares/stock-market-summary/ftse-100'
    	driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100");
    	
    	PortalPage website = PageFactory.initElements(driver, PortalPage.class);
    	
    	FallersPage fallers = PageFactory.initElements(driver, FallersPage.class);
    	
    	// WHEN - I click the risers link
    	website.navFallers();
    	
    	// AND - find the top riser
    	String topFaller = fallers.getFallerName();
    	
    	// THEN - print the top riser
    	System.out.println("Top Faller: " + topFaller);
    	
    }
    
    @AfterAll
    public static void tearDown() {
        driver.quit();
        System.out.println("driver closed");
    }
    
    // Designed to return ChromeOptions to configure new ChromeDrivers in Selenium
    public static ChromeOptions chromeCfg() {
     Map<String, Object> prefs = new HashMap<String, Object>();
     ChromeOptions cOptions = new ChromeOptions();
      
     // Settings
     prefs.put("profile.default_content_setting_values.cookies", 2);
     prefs.put("network.cookie.cookieBehavior", 2);
     prefs.put("profile.block_third_party_cookies", true);

     // Create ChromeOptions to disable Cookies pop-up
     cOptions.setExperimentalOption("prefs", prefs);

     return cOptions;
     }
    
}