package test;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTest  extends TestBase{
	
	@Test
	
	public void init() throws Exception
	{
		
		
		LoginPage loginpage = PageFactory.initElements(driver,LoginPage.class);
		loginpage.setEmail("Admin");
		loginpage.setPassword("admin123");
		loginpage.clickOnLoginButton();
	}

 
	

	 
	

}
