package tutorialselenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarSelection_20 {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://www.expedia.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

    @Test
	public void test1() throws Exception {
		driver.get(baseUrl);
		// Click flights tab
		driver.findElement(By.id("tab-flight-tab")).click();
		// Find departing field
		WebElement departingField = driver.findElement(By.id("flight-departing"));
		// Click departing field
		departingField.click();
		Thread.sleep(3000);
		// Find the date to be selected
		WebElement dateToSelect = driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][position()=1]//button[text()='28']"));
		// Click the date
		dateToSelect.click();
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}