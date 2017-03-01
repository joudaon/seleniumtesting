package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Search page = home page
public class SearchPage {
	public static WebElement element = null;
	
	/**
	 * Returns the Flights tab 
	 * @param driver
	 * @return
	 */
	public static WebElement flightTab(WebDriver driver) {
		element = driver.findElement(By.id("tab-flight-tab"));
		return element;
	}
	
	/**
	 * Returns the flight origin text box element
	 * @param driver
	 * @return
	 */
	public static WebElement originTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-origin"));
		return element;
	}
	
	public static void fillOriginTextBox(WebDriver driver, String origin) {
		element = originTextBox(driver);
		element.sendKeys(origin);
	}

	/**
	 * Returns the flight destination text box element
	 * @param driver
	 * @return
	 */
	public static WebElement destinationTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-destination"));
		return element;
	}
	
	public static void fillDestinationTextBox(WebDriver driver, String destination) {
		element = driver.findElement(By.id("flight-destination"));
		element.sendKeys(destination);
	}


	/**
	 * Returns the departure date text box element
	 * @param driver
	 * @return
	 */
	public static WebElement departureDateTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-departing"));
		return element;
	}
	
	public static void fillDepartureDateTextBox(WebDriver driver, String departureDate) {
		element = driver.findElement(By.id("flight-departing"));
		element.sendKeys(departureDate);
	}

	/**
	 * Returns the return date text box element
	 * @param driver
	 * @return
	 */
	public static WebElement returnDateTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-returning"));
		return element;
	}
	
	public static void fillReturnDateTextBox(WebDriver driver, String returnDate) {
		element = driver.findElement(By.id("flight-returning"));
		element.sendKeys(returnDate);
	}

	/**
	 * Returns the search button box element
	 * @param driver
	 * @return
	 */
	public static WebElement searchButton(WebDriver driver) {
		element = driver.findElement(By.id("search-button"));
		return element;
	}

	/**
	 * Click on search button
	 * @param driver
	 */
	public static void clickOnSearchButton(WebDriver driver) {
		element = searchButton(driver);
		element.click();
	}
	
	/**
	 * Navigate to flights tab
	 * @param driver
	 */
	public static void navigateToFlightsTab(WebDriver driver) {
		driver.findElement(By.id("header-history")).click();
		element = driver.findElement(By.id("tab-flight-tab"));
		element.click();
	}
}
