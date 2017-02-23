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
		driver.findElement(By.xpath("//ul[@class='list items-20']//li//a[contains(@title, 'Athletic')]")).click(); //Searches for Athletic and clicks it
		driver.findElement(By.xpath("//hgroup[1]/h2/a")).click(); //Searches the first news and clicks it
	}

}
