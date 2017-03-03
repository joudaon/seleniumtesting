package tutorialselenium;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import page.classes.SearchPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


public class TestNG_MultiBrowserAndParallelTests_32 {
	
	private WebDriver driver;
	private String baseUrl;
	private static final Logger log = LogManager.getLogger(TestNG_TestSuite_26.class.getName());

	@Parameters("browserType")
	@BeforeClass
	public void beforeClass(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			// http://chromedriver.storage.googleapis.com/index.html
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uda\\workspace_selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		baseUrl = "https://www.expedia.com/";
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void searchFlights() throws Exception {
		SearchPage.navigateToFlightsTab(driver);
		SearchPage.fillOriginTextBox(driver, "New York");
		SearchPage.fillDestinationTextBox(driver, "Chicago");
		SearchPage.fillDepartureDateTextBox(driver, "10/28/2014");
		SearchPage.fillReturnDateTextBox(driver, "10/31/2014");
		SearchPage.selectFlightAdults(driver, "2");
	}

	@AfterClass
	public void afterClass() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}

}
