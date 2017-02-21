package tutorialselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String baseURL = "http://www.google.es";
		driver.get(baseURL);
	}

}
