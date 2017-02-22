package tutorialselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdXPATHDemo_06 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		String baseURL = "http://www.google.com";
		driver.manage().window().maximize();  //Maximizes the windows
		driver.get(baseURL);
		driver.findElement(By.id("lst-ib")).sendKeys("letskodeit"); //Finds that element ID and writes 'letskodeit' in the textarea
		driver.findElement(By.xpath(".//*[@id='_fZl']")).click(); // Finds that element Xpath and clicks it
		
	}

}
