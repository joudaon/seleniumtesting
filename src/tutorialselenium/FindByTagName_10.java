package tutorialselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByTagName_10 {

	public static void main(String[] args) {
		//Does not work actually
		WebDriver driver = new FirefoxDriver();
		String baseURL = "https://demostore.x-cart.com/";
		driver.manage().window().maximize();  //Maximizes the windows
		driver.get(baseURL);
		
		driver.findElement(By.tagName("a")).click();

	}

}
