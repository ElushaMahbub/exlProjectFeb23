package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage extends BasePage{
	
WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//h2[contains(text(), 'Dashboard')]") WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Customers')]") WebElement CUSTOMERS_MENU_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Add Customer')]") WebElement ADDCUSTOMERS_MENU_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a") WebElement LIST_CUSTOMERS_MENU_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/button[2]") WebElement Delete_OK_ELEMENT;
	
	
	
		public  void validateDashboardPage(String expectedText) {
			validateElement(DASHBOARD_HEADER_ELEMENT.getText(), expectedText, "Dashboard page not found !!");
			
	}

	public void clickCustomerButton() throws InterruptedException {
		Thread.sleep(2000);
		CUSTOMERS_MENU_ELEMENT.click();
	}
	
	public void clickAddCustomerButton() {
		ADDCUSTOMERS_MENU_ELEMENT.click();
		
	}

	public void clickListCustomerButton() throws InterruptedException {
		Thread.sleep(2000);
		LIST_CUSTOMERS_MENU_ELEMENT.click();

	}
	
	public void clickDeleteOkButton() throws InterruptedException {
		Thread.sleep(2000);
		Delete_OK_ELEMENT.click();
	}
}
