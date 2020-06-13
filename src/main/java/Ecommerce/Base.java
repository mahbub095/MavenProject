package Ecommerce;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Base {
	 
	public static WebDriver driver =null;
	@BeforeSuite
 
	  public void initializeDriver() throws IOException
	    {
		System.setProperty("webdriver.chrome.driver","C:\\c\\chromedriver.exe");
			 driver= new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 driver.get("http://testword.test/");
		     System.out.println("Open Chrome & Application");

	    }

}
