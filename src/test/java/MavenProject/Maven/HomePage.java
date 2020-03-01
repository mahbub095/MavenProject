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
		driver.get("https://sso.teachable.com/secure/9521/users/sign_in?clean_login=true&reset_purchase_session=1");
		
		LandingPage l =new LandingPage(driver);
		l.getLogin().click();
		
		LandingPage lp =new LandingPage(driver);
		lp.getEmail().sendKeys("admin123@gmail.com");
		lp.getPassword().sendKeys("admin123@gmail.com");
		//lp.getLogin().sendkeys("admin123@gmail.com");
		lp.getLogin().click();
	}
	
}
