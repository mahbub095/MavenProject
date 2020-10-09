package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	static {

		System.setProperty("webdriver.chrome.driver","C:\\c\\chromedriver.exe");
		}

	public static WebDriver driver = new ChromeDriver();

	private DriverManager() {

	}

}
