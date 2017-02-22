package tutorialselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class IEDriverExample_04 {

	public static void main(String[] args) {
		String baseURL = "http://www.google.com";
		WebDriver driver;
		System.setProperty("webdriver.ie.driver", "C:\\Users\\judaondo\\workspace_selenium\\IEDriverServer.exe");
		
		driver = new InternetExplorerDriver();
		
		driver.get(baseURL);
		
	}

}
