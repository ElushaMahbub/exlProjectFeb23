package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	 public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='username']") WebElement USER_NAME_ELEMENT;//HERE name of element goes at end
	@FindBy(how = How.XPATH, using = "//input[@id='password']") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@name='login']") WebElement SIGNIN_ELEMENT;
	
	
	public void insertUserName(String userName) {
		USER_NAME_ELEMENT.sendKeys(userName);
	}
	
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void clickOnSigninButton() {
		SIGNIN_ELEMENT.click();
	}

}
