package tutorialselenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementState_15 {

	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://www.google.com";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURL);
	}

	@Test
	public void test() {
		WebElement e1 = driver.findElement(By.id("lst-ib"));
		System.out.println("e1 is Enabled: " + e1.isEnabled());
		
		WebElement e2 = driver.findElement(By.id("gs_taif0"));
		System.out.println("e2 is Enabled: " + e2.isEnabled());
		
		WebElement e3 = driver.findElement(By.id("gs_htif0"));
		System.out.println("e3 is Enabled: " + e3.isEnabled());
		
		e1.sendKeys("letskodeit");
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}



}
