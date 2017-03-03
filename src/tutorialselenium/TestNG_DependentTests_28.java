package tutorialselenium;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import page.classes.SearchPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_DependentTests_28 {
	private WebDriver driver;
	private String baseUrl;
	private static final Logger log = LogManager.getLogger(TestNG_DependentTests_28.class.getName());
	
	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
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
		SearchPage.fillDepartureDateTextBox(driver, "28/10/2017");
		SearchPage.fillReturnDateTextBox(driver, "11/11/2017");
		SearchPage.clickOnSearchButton(driver);
	}

	@Test(dependsOnMethods={ "searchFlights" })
	public void selectMorningFlight() {
		SearchPage.clickMorningFlight(driver);
	}

	@AfterClass
	public void afterClass() {
	}
}
