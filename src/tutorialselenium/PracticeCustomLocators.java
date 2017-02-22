package tutorialselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeCustomLocators {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		String baseURL = "http://www.as.com";
		driver.manage().window().maximize();  //Maximizes the windows
		driver.get(baseURL);
		driver.findElement(By.cssSelector("img[alt=\"8º - 35p - Escudo del Athletic\"]")).click();
		
	}

}
