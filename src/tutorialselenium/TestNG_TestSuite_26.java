package tutorialselenium;

import org.testng.annotations.Test;

import page.classes.SearchPage;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG_TestSuite_26 {

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
  
  @Test
  public void fillBasicInfo() throws Exception {	
	SearchPage.flightTab(driver).click();
	SearchPage.fillOriginTextBox(driver, "New York");
	SearchPage.fillDestinationTextBox(driver, "Chicago");
	SearchPage.fillDepartureDateTextBox(driver, "25/12/2017");
	SearchPage.returnDateTextBox(driver).clear();
	SearchPage.fillReturnDateTextBox(driver, "31/12/2017");
	Thread.sleep(3000);
  }
  
  @Test
  public void fillAdvancedInfo(){
	  SearchPage.clickOnAdvancedLink(driver);
	  SearchPage.clickNonStopCheckBox(driver);
	  SearchPage.selectFlightClass(driver, "first");
  }


  @AfterMethod
  public void afterMethod() {
  }

}
