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
import org.openqa.selenium.support.ui.Select;

public class Dropdowns_19 {

	private WebDriver driver;
	private String baseUrl1;
	private String baseUrl2;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl1 = "https://www.expedia.es";
		baseUrl2 = "http://html.com/attributes/select-multiple/";
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void testDropdown() {
		driver.get(baseUrl1);
		Select sel1 = new Select(driver.findElement(By.id("package-1-adults")));
		Select sel2 = new Select(driver.findElement(By.id("package-1-children")));
		
		List<WebElement> options = sel1.getOptions();
		int optionsSize = options.size();
		for (int i=0; i<optionsSize; i++){
			int j=i+1;
			String optionName = options.get(i).getText();
			System.out.println("Option " + j +": "+ optionName);
		}
		
		//Selecting By Value
		sel1.selectByValue("4");
		
		//Selecting By Index
		sel2.selectByIndex(4);
	}
	
	@Test
	public void testMultiSelect() throws Exception {
		driver.get(baseUrl2);
		Select sel = new Select(driver.findElement(By.xpath(".//div[@class='render']/select")));
		sel.selectByValue("Chilean");
		Thread.sleep(2000);
		sel.deselectByValue("Chilean");
		Thread.sleep(2000);
		sel.selectByIndex(4);
		Thread.sleep(2000);
		sel.selectByIndex(5);
		Thread.sleep(2000);
		sel.deselectAll();
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}



}
