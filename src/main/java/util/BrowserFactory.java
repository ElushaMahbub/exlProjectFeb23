package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserFactory {
	
	static WebDriver driver;
	
	@Test
	public static WebDriver init() {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver120.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
	}
 
	public static void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}

}
