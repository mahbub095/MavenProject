 package MavenProject.Maven;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resource.base;

public class HomePage extends base{

	/*
	 * @Test public void basePageNavigation() throws IOException { driver
	 * =initializeDriver(); driver.get(
	 * "https://sso.teachable.com/secure/9521/users/sign_in?clean_login=true&reset_purchase_session=1"
	 * );
	 * 
	 * LandingPage l =new LandingPage(driver); l.getLogin().click();
	 * 
	 * LandingPage lp =new LandingPage(driver);
	 * lp.getEmail().sendKeys("admin123@gmail.com");
	 * lp.getPassword().sendKeys("admin123@gmail.com");
	 * //lp.getLogin().sendkeys("admin123@gmail.com"); lp.getLogin().click(); }
	 */
	
	
@Test(dataProvider="getData")
	
	public void basePageNavigation(String Username,String Password,String text) throws IOException
	{

		//one is inheritance

	 driver =initializeDriver(); 
	 driver.get( "https://sso.teachable.com/secure/9521/users/sign_in?clean_login=true&reset_purchase_session=1" );
		LandingPage l=new LandingPage(driver);
		l.getLogin().click(); //driver.findElement(By.css()
		LandingPage lp=new LandingPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);

	//	log.info(text);
		
		lp.getLogin().click();
		
		}


@DataProvider
public Object[][] getData()
{
	// Row stands for how many different data types test should run
	//coloumn stands for how many values per each test
	
	// Array size is 2
	// 0,1
	Object[][] data=new Object[2][3];
	//0th row
	data[0][0]="nonrestricteduser@qw.com";
	data[0][1]="123456";
	data[0][2]="Restrcited User";
	//1st row
	data[1][0]="restricteduser@qw.com";
	data[1][1]="456788";
	data[1][2]= "Non restricted user";
	
	return data;
	
	
	
	
	
	
}
	
}
