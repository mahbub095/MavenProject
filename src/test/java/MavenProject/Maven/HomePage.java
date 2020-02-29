 package MavenProject.Maven;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resource.base;

public class HomePage extends base{

	@Test
	public void basePageNavigation() throws IOException
	{
		driver =initializeDriver();
		driver.get("http://qaclickacademy.com");
		
		LandingPage l =new LandingPage(driver);
		l.getLogin().click();
	}
	
}
