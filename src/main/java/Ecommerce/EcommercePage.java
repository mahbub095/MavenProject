package Ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EcommercePage {
	
	WebDriver driver;
	public EcommercePage(WebDriver driver) {
		this.driver =driver;
	}
	@FindBy(linkText="Register or Sign in") WebElement regbtn;
	@FindBy(linkText="Login") WebElement loginbtn;
	@FindBy(how=How.ID, using="username") WebElement username;
	@FindBy(how=How.ID, using="password") WebElement passwordcheck;
	@FindBy(how=How.XPATH, using="//button[text()='Login']") WebElement login;
	@FindBy(linkText="Home") WebElement homebtn;
	@FindBy(linkText="Accessories") WebElement accessories;
	@FindBy(how=How.XPATH, using="//h2[contains(text(), 'Amkov CDC3 7inch TFT Screen 18 CMOS')]") WebElement productbtn;
	@FindBy(how=How.XPATH, using="//button[text()='Add to cart']") WebElement add;
	@FindBy(linkText="View cart") WebElement viewcart;
	@FindBy(linkText="Proceed to checkout") WebElement checkout;
	@FindBy(how=How.XPATH, using="//*[@id='terms']") WebElement terms;
	@FindBy(how=How.XPATH, using="//*[@id='place_order']") WebElement placeorder;
	
	
	
	public void Regbtn() {
		regbtn.click();
	}
	public void Loginbtn() {
		loginbtn.click();
	}
	
	public void setname(String strname1) {
		username.sendKeys(strname1);
		
	}
	public void setpassword(String strpassword) {
		passwordcheck.sendKeys(strpassword);
	
	}
	public void loginbtn2() {
		login.click();
	}
	public void homebtn() {
		homebtn.click();
	}
	public void accessories() {
		accessories.click();
	}
	public void productbtn() {
		productbtn.click();
	}
	public void add() {
		add.click();
	}
	public void viewcart() {
		viewcart.click();
	}
	public void checkout() {
		checkout.click();
	}
	public void terms() {
		terms.click();
	}
	public void placeorder() {
		placeorder.click();
	}

}
