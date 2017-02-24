package usefulmethods;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import usefulmethods.GenericMethods_03;

public class GenericMethodsDemo_03 {

	private WebDriver driver;
	private String baseUrl;
	private GenericMethods_03 gm;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://letskodeit.teachable.com/p/practice/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		gm = new GenericMethods_03(driver);
	}

	@Test
	public void testGetText() {
		driver.get(baseUrl);
		WebElement element = gm.getElement("name", "id");
		element.sendKeys("test");
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		//driver.quit();
	}

}
