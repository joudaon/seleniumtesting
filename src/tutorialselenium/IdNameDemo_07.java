package tutorialselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdNameDemo_07 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		String baseURL = "http://www.google.com";
		driver.manage().window().maximize();  //Maximizes the windows
		driver.get(baseURL);
		driver.findElement(By.id("lst-ib")).sendKeys("letskodeit"); //Finds that element ID and writes 'letskodeit' in the textarea
		driver.findElement(By.name("btnG")).click(); //Locating button by name and clicking it
	}

}
