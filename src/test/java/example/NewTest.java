package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	private WebDriver driver;		
	@Test				
	public void testEasy() {	
		BasicConfigurator.configure();
		driver.get("http://demo.guru99.com/test/guru99home/");
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
	}	
	@BeforeTest
	public void beforeTest() {	
	    driver = new FirefoxDriver(); 
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}	

}
