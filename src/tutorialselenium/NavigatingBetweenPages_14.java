package tutorialselenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigatingBetweenPages_14 {

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
	public void test() throws InterruptedException {
		driver.get(baseURL);
		String title = driver.getTitle();
		System.out.println("Current title: " + title);
		
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentURL);
		
		String urlToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		driver.navigate().to(urlToNavigate);
		System.out.println("Navigating to Login");
		currentURL = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentURL);
		
		Thread.sleep(2000);
		
		driver.navigate().back(); //Navigates back
		System.out.println("Navigate back");
		currentURL = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentURL);
		
		Thread.sleep(2000);
		
		driver.navigate().forward(); //Navigates fordward again
		System.out.println("Navigate forward");
		currentURL = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentURL);
		
		Thread.sleep(2000);
		
		driver.navigate().back(); //Navigates back
		System.out.println("Navigate back");
		currentURL = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentURL);
		
		Thread.sleep(2000);
		
		driver.navigate().refresh(); //Refreshes the page
		System.out.println("Navigate refresh current page");
		driver.get(currentURL);
		System.out.println("Navigate refresh current page");
		Thread.sleep(2000);
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
	}

	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}


}