package tutorialselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo_01 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String baseURL = "http://www.google.com";
		driver.get(baseURL);
		if (driver.getTitle().equals("Google"))
		{
			System.out.println("Title: " + driver.getTitle());
			System.out.println("Success");
		}
		driver.quit();
	}

}
