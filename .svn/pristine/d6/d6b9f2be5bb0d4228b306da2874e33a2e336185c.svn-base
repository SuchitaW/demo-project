package Utility;
import java.io.FileInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1
{
    @Test(dataProvider="DataInput")
    public void login(String userName, String pass, String expurl) throws InterruptedException{
        //open browser and Yahoo
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www2.xss.be/Login");
    //    Actions act = new Actions(driver);
        //login
   //     act.moveToElement(driver.findElement(By.xpath("//em[text()='Sign In']"))).perform();
  //      driver.findElement(By.xpath("//span//a[@class='login-svc ylogin login-btn-purple rapid-noclick-resp login-btn-small']")).click();
        driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
        driver.findElement(By.xpath("//span[@class='p-button-label']")).click();
       
        Thread.sleep(2000);
        String acturl = driver.getCurrentUrl();
        try{
            Assert.assertEquals(acturl, expurl);
            driver.close();
        }catch(Exception e){
            driver.close();
        }
       
    }
    @DataProvider(name="DataInput")
    public static Iterator fetchData() throws InvalidFormatException, IOException{
        ArrayList myData = new ArrayList();
      //  String path="C:\\Users\\Akshay\\Downloads";
        FileInputStream fis = new FileInputStream("C:\\Users\\Akshay\\Downloads\\XSS Website User Login - Credentials.xlsx\\"); 
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheet("UserLogins");
        int numOfRows = sh.getLastRowNum();
        String userName, pass, expurl;
        for(int i=0; i<numOfRows; i++){
            userName = sh.getRow(i).getCell(0).getStringCellValue();
            pass = sh.getRow(i).getCell(1).getStringCellValue();
            expurl = sh.getRow(i).getCell(2).getStringCellValue();
            myData.add(new Object[]{userName,pass,expurl});
        }
        return myData.iterator();
    }
}

