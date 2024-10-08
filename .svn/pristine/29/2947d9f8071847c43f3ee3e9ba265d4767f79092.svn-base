package COM.User;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeMethod 
	public void browser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();	
			}
		if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();			
		}
		if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		driver.get("https://www.xss.be/");
		driver.manage().window().maximize();			
	} 
	@AfterMethod 
	public void teardown() {
		driver.close();
	}
}
