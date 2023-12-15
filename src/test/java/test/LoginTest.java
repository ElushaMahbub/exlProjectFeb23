 package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class LoginTest {
	
	WebDriver driver;
	
	ExcelReader exlRead = new ExcelReader("src\\main\\java\\testData\\TF_TestData.xlsx");//we have to give the path of test data file/xlx/config
	String userName = exlRead.getCellData("LoginInfo", "UserName" , 2);
	String password = exlRead.getCellData("LoginInfo", "Password" , 2);
	String dashboardHeaderText = exlRead.getCellData("DashboardInfo", "DashdoardHeader" , 2);
	//String errorMsg = exlRead.getCellData("DashboardInfo ", "Dashboard page not found" , 2);
	@Test
	public void validUsershouldBeAbleToLogin() throws InterruptedException {
		
		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickOnSigninButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage(dashboardHeaderText);
		BrowserFactory.tearDown();
	}
	
	
}
