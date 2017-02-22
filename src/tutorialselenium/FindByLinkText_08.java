package tutorialselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByLinkText_08 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.manage().window().maximize();  //Maximizes the windows
		driver.get(baseURL);

		driver.findElement(By.linkText("Login")).click();		
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Sign")).click();
	}

}
