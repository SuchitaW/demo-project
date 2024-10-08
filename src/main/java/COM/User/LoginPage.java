package COM.User;

import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {


	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www2.xss.be/Login");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//button[@label='Accept all']")).click();
		WebElement Uname= driver.findElement(By.xpath("//input[@formcontrolname='username']"));
	Uname.sendKeys("ParasGems");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("Diamondpower/?");
		WebElement btn = driver.findElement(By.xpath("//span[@class='p-button-label']"));
		btn.click();
		Thread.sleep(3000);
		
	    driver.navigate().forward();
	    //"ParasGems","Diamondpower/?"},// https://login.privacy.diamonds/logon/LogonPoint/index.html 
		String url = driver.getCurrentUrl();
		System.out.println(url);                                  //  "https://login.privacy.diamonds/logon/LogonPoint/index.html";
         String expectedurl="https://login6.serverconnections.net/logon/LogonPoint/index.html";	
        		 	
		if(url.equalsIgnoreCase(expectedurl)) {
			System.out.println("Login Pass");
		} else {
			System.out.println("login fail");			
		}
		
		
}  }
