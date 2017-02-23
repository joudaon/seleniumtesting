package tutorialselenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicActions_13 {

	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "http://letskodeit.teachable.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
	}

	@Test
	public void test() {
		driver.get(baseURL);
		driver.findElement(By.xpath(".//div[@id='navbar']//a[@href='/sign_in']")).click();
		System.out.println("Clicked on Login");
		driver.findElement(By.id("user_email")).clear(); //Clears the username textboxSystem.out.println("Clicked on Login");
		System.out.println("Username field of login form cleared");
		driver.findElement(By.id("user_email")).sendKeys("test@email.com"); //Inserts new username in the form
		System.out.println("Username field of login fulfilled");
		driver.findElement(By.id("user_password")).sendKeys("test"); //Inserts new password in the form
		System.out.println("Password field of login fulfilled");
		driver.findElement(By.id("user_email")).clear();
		System.out.println("Clearing username field again");
	}

	
	@After
	public void tearDown() throws Exception {
	}


}
