package tutorialselenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import page.classes.SearchPageFactory;

public class FrameworkTestCase_25 {
	private WebDriver driver;
	private String baseUrl;
	SearchPageFactory searchPage;

	@Before
	public void beforeClass() {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";
		
		searchPage = new SearchPageFactory(driver);

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void test() throws Exception {
		searchPage.clickFlightsTab();
		searchPage.setOriginCity("New York");
		searchPage.setDestinationCity("San Francisco");
		searchPage.setDepartureDate("28/10/2017");
		searchPage.clearDepartureDate();
		searchPage.setReturnDate("31/10/2017");
	}

	@After
	public void afterClass() {
	}
}