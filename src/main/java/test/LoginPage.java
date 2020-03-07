package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage  {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver =driver;
	}
	
	
	@FindBy(how=How.XPATH, using="//*[@id='txtUsername']") WebElement emailTextBox;
	@FindBy(how=How.XPATH, using="//*[@id='txtPassword']") WebElement passwordcheck;
	@FindBy(how=How.XPATH, using="//*[@id='btnLogin']") WebElement signButton;
 
	
	public void setEmail(String  strEmail) {
		emailTextBox.sendKeys(strEmail);
	}
	
	public void setPassword(String  strPass) {
		passwordcheck.sendKeys(strPass);
	}
	
	public void clickOnLoginButton( ) {
		signButton.click();
	}
	
}
