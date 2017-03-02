package tutorialselenium;

import org.testng.annotations.Test;

import page.classes.SearchPage;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class TestNG_TestCase_26 {

  private WebDriver driver;
  private String baseUrl;
  private static final Logger log = LogManager.getLogger(TestNG_TestCase_26.class.getName());
	
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  baseUrl = "https://www.expedia.com/";
	  
	  // Maximize the browser's window
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
  }
  
  @Test
  public void testMethod() {
	driver.get(baseUrl);
	SearchPage.flightTab(driver).click();
	SearchPage.fillOriginTextBox(driver, "New York");
	log.info("Enter Origin city as New York");
	SearchPage.fillDestinationTextBox(driver, "Chicago");
	SearchPage.fillDepartureDateTextBox(driver, "25/12/2017");
	SearchPage.returnDateTextBox(driver).clear();
	SearchPage.returnDateTextBox(driver).sendKeys("31/12/2017");
	SearchPage.clickOnSearchButton(driver);
  }


  @AfterMethod
  public void afterMethod() {
  }

}
