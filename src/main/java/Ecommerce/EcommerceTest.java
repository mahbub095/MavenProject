package Ecommerce;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class EcommerceTest extends Base{
	
	@Test
	public void init() throws Exception
	{
		EcommercePage page = PageFactory.initElements(driver,EcommercePage.class);
		
		page.Regbtn();
		page.Loginbtn();
		page.setname("admin");
		page.setpassword("admin");
		page.loginbtn2();
		page.homebtn();
		page.accessories();
		page.productbtn();
		page.add();
		page.viewcart();
		page.checkout();
		page.terms();
		page.placeorder();
		
		
		
		
	//	loginpage.setEmail("Admin");
		//loginpage.setPassword("admin123");
		//loginpage.clickOnLoginButton();
		
	}


}
