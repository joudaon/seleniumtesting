package tutorialselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.IsChecked;

public class WorkingWithElementsList_17 {

	private WebDriver driver;
	private String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
	}

	@Test
	public void test() throws InterruptedException {
		boolean isChecked = false;
		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[contains(@type, 'radio') and contains(@name, 'cars')]"));
		int sizeRadioButtons = radioButtons.size();
		for (int i = 0; i<sizeRadioButtons; i++)
		{
			isChecked = radioButtons.get(i).isSelected();
			if (!isChecked)
			{
				radioButtons.get(i).click();
				Thread.sleep(2000);
			}
		}
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
