package tutorialselenium;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import page.classes.SearchPage;

public class TestNG_ParametersAndDataProviders_31 {
	
	private WebDriver driver;
	private String baseUrl;
	  private static final Logger log = LogManager.getLogger(TestNG_TestSuite_26.class.getName());
	
	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	@DataProvider(name="fieldsInputs")
	public static Object[][] searchData() {
		return new Object[][] {{"New York", "Chicago", "28/10/2017", "31/10/2017"},
				{"New York", "Boston", "28/10/2017", "31/10/2017"}};
	}
	
	@Parameters( { "origin", "dest", "depDate", "retDate" } )
	@Test
	public void searchFlights(String origin, String dest,
			String depDate, String retDate) throws Exception {
		SearchPage.navigateToFlightsTab(driver);
		SearchPage.fillOriginTextBox(driver, origin);
		SearchPage.fillDestinationTextBox(driver, dest);
		SearchPage.fillDepartureDateTextBox(driver, depDate);
		SearchPage.fillReturnDateTextBox(driver, retDate);
	}
	
	@Test(dataProvider="fieldsInputs")
	public void searchFlightsWithMultiData(String origin, String dest,
			String depDate, String retDate) throws Exception {
		SearchPage.navigateToFlightsTab(driver);
		SearchPage.clearAllFields(driver);
		Thread.sleep(3000);
		SearchPage.fillOriginTextBox(driver, origin);
		SearchPage.fillDestinationTextBox(driver, dest);
		SearchPage.fillDepartureDateTextBox(driver, depDate);
		SearchPage.fillReturnDateTextBox(driver, retDate);
		Thread.sleep(3000);
	}

	@AfterClass
	public void afterClass() {
	}

}
