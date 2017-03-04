package tutorialselenium;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//http://docs.oracle.com/javase/tutorial/essential/concurrency/ - Multi-Threading Tutorial
public class TestNG_MultiThreading_34 {

	private WebDriver driver;
    
	private String baseUrl;
	private static final Logger log = LogManager.getLogger(TestNG_GoogleSearch_34.class.getName());

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void beforeMethod() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testMethod() throws Exception {
		String title = "Reserva hoteles, vuelos, viajes y paquetes de vacaciones baratos en Expedia";
		log.info("[START] Thread Id : " + 
                Thread.currentThread().getId() + " is started!");
		driver.get(baseUrl);
		System.out.println("Page Title is " + driver.getTitle());
		Assert.assertEquals(title, driver.getTitle());
		log.info("[END] Thread Id : " +
                Thread.currentThread().getId() + " is ended");
	}

	@AfterMethod
	public void afterMethod() {
	}

}

