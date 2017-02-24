package usefulmethods;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsElementPresentDemo_05 {

	private WebDriver driver;
	private String baseUrl;
	private GenericMethods_Old_03 gm;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://letskodeit.teachable.com/p/practice/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		gm = new GenericMethods_Old_03(driver);
	}

	@Test
	public void testGetText() {
		driver.get(baseUrl);
		//Existing element
		boolean result1 = gm.isElementPresent("name", "id");
		System.out.println("The element 1 is present? "+result1);
		//Not existing element
		boolean result2 = gm.isElementPresent("name-not-present", "id");
		System.out.println("The element 2 is present? "+result2);
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}