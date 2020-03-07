package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public static WebDriver driver =null;
	@BeforeSuite
 
	  public void initializeDriver() throws IOException
	    {
		  System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			 driver= new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 driver.get("https://opensource-demo.orangehrmlive.com/");
		     System.out.println("1. Open Chrome & Application");

	    }
	  
	/*
	 * @AfterSuite public void TeardownTest() { TestBase.driver.quit(); }
	 */
}
