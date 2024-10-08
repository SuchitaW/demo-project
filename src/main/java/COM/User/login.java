package COM.User;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

    public class login {
    //public String url_login ="https://www.xss.be/Login"; //https://login6.serverconnections.net/logon/LogonPoint/tmindex.html
	public static String url_6 = "https://login6.serverconnections.net/logon/LogonPoint/tmindex.html";
	public String url_p = "https://login.privacy.diamonds/";
			              //    "https://login.privacy.diamonds/logon/LogonPoint/index.html"; 
	                     
	public String url_b = "https://backup.serverconnections.net/logon/LogonPoint/index.html";
	                   //  https://backup.serverconnections.net/logon/LogonPoint/tmindex.html
	public String url_3 = "https://login3.serverconnections.net/logon/LogonPoint/index.html";
	public String url_4 = "https://login4.serverconnections.net/logon/LogonPoint/index.html";
	public String url_5 = "https://login5.serverconnections.net/logon/LogonPoint/index.html";
	
	
    @Test(dataProvider="testdata")
	public void server(String comurl,String loginName, String password ) throws Exception {
    WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
    driver.get("https://www.xss.be");
	//  BaseClass base = new BaseClass();https:
	//  base.browser("chrome");https://www.xss.be
		 
			
	 WebElement cookies = driver.findElement(By.xpath("//button[@class='cc-nb-okagree']"));
	 cookies.click();
	
 	 WebElement login= driver.findElement(By.xpath("//button[@id='login']"));
 	 login.click();     
	 WebElement Uname = driver.findElement(By.xpath("//input[@formcontrolname='username']"));
	 Uname.sendKeys(loginName);	 
	 WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	 pass.sendKeys(password);	 
	 WebElement btn = driver.findElement(By.xpath("//span[@class='p-button-label']"));
	 btn.click();	
	 Thread.sleep(4000);
   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	String actualurl=driver.getCurrentUrl();
	System.out.println(actualurl);
	
	 
      	 
	
if(url_6.equalsIgnoreCase(actualurl) ) {
		   Assert.assertEquals(actualurl, comurl);  
		     }
		else {
			 Assert.assertEquals(actualurl, comurl);   }
if(url_p.equalsIgnoreCase(actualurl)) {
		   Assert.assertEquals(actualurl,comurl); 
		       }		   
	    else {
		   Assert.assertEquals(actualurl,comurl);
	   }
if(url_b.equalsIgnoreCase(actualurl))  {
		 Assert.assertEquals(actualurl,comurl); 
		        } 
        else { 
	       Assert.assertEquals(actualurl,comurl); }
if(url_3.equalsIgnoreCase(actualurl))  {
	   Assert.assertEquals(actualurl,comurl); 
	     } 
   else { 
      Assert.assertEquals(actualurl,comurl); }
	 
if (url_4.equalsIgnoreCase(actualurl))	{       // newly added Code
	Assert.assertEquals(actualurl,comurl);
	     } else {  Assert.assertEquals(actualurl,comurl);   }    
	 
if (url_5.equalsIgnoreCase(actualurl))	{
	Assert.assertEquals(actualurl,comurl);
	    } 
       else {  Assert.assertEquals(actualurl,comurl);   }  	 
         driver.quit();                                                   
	        }     
   
   
	@DataProvider(name= "testdata")  	
	public Object[][] fetchdata () {	
				return new Object[][] {
		
           {url_6,"acdiam","server"},
           {url_6,"Abhi","Mon"},
           {url_6,"bluegems","blue161"},
		   {url_6,"Peggy","vinessa"},  
           {url_6,"Gemasia","Machteld"},
           {url_6,"Tris","Patricia"},
           {url_6,"Paras","brinks759"},	          
           {url_p,"ParasGems","Diamondpower/?"},  		   
           {url_6,"sachdiam","sachiv"},
		   {url_6,"vimla","CHANDAN"},                              
		     
		   {url_p,"soradiam","antwerp"},     	                    
           {url_6,"Twinkle","Diam"},   
	        {url_6,"chirag","0477432189"},    //F  // Pass Changed
	        {url_6,"DCNV","PATRICIA"},
			{url_6,"neil","select"},
		   	{url_6,"ashishdiamond","bhansali1*"},
			{url_6,"Vimesh","Vimesh"},
			{url_6,"Titty","Twister"},			
			{url_6,"diambel","tineparesh"},
			{url_6,"JKorn","Els"},
			
			{url_6,"VIRAL","ARYAN"},
			{url_6,"universal","aashvi2102"},
			{url_6,"SLUM","DOG"},		
			{url_p,"crisdiam","crisdiam123"},   
			{url_p,"EURO","MILLIONS"},   		
			{url_6,"mihir","janbert"},                                         
			{url_6,"INTGROUP","HEMDIA"},		//F
			{url_p,"INTGROUP","DNGROUP"},    //F
			{url_p,"INTGROUP","INTGROUP"},   // F  
			{url_p,"LUMINAS","PRASHANT"},    
			
	    	{url_6,"KOTHARI","IRAHTOK"},  
			{url_6,"HONGKONGOFFICE","BELGIUM"},
			{url_6,"BELGIUMOFFICE","HONGKONG"},
			{url_6,"Blooming","STAR"}, 	      //34		
			{url_p,"CRISDIAM","MARTAN"},		
			{url_6,"GEMSANMOL","HUM77HAI"},
			{url_p,"brussels","@Brussels1"},
			{url_6,"DIAMWILL","DIAMWILL"},
			{url_6,"Saahil","DMCC"},
			{url_6,"Diasqua","India"},       //script ok
			
			{url_6,"raydiam","jamal728"},
			{url_6,"dsdmcc","almas9e$"},
			{url_6,"SGDMCC","Meet2008"},
			{url_6,"download","working"},
			{url_6,"diamondsource","diamsource"},
			{url_6,"sourcediamond","source"},
			{url_6,"vitraag","aryan"},
			{url_6,"dhruvstar","neil"},
			{url_6,"DSM","diaveer"},
			{url_6,"hvdiam","dnppk11"},
			
			{url_6,"arham","51arham"},   
			{url_6,"diambelme","rahulsp"},
			{url_6,"MILONI","JAIGANESH"},
			{url_6,"Komal","Ketan"},
			{url_6,"fire","bird"},
			{url_6,"Dali","Diamond"},		    // 56
			{url_b,"user","diamond"},           // backup
			{url_6,"jigi1234","jiginhs11"},
			{url_6,"Danydiam","Raymonde1"},
			{url_6,"SEBVER","FD69002"},
			
			{url_b,"india","india"},           // backup
			{url_6,"POLLY","CARBON6"},
			{url_6,"Jhanvi","Arham"},
			{url_6,"DIMPLE","JEWELS"},
			{url_6,"DCNV","JULIE"},     //65          			
			{url_4,"oldserver","oldserver"},
			{url_4,"printserver","printserver"},	
			{url_5,"indiatest","indiatest"},	
			{url_6,"apshaps","mailbox699"},	
			{url_6,"Brilliantfacets","kenzo911"}, 
			
			{url_6,"carbon","char6"},				
			{url_6,"Elran","ElranXss"},	
			{url_6,"HKDiam","DiamHK"},	
			{url_6,"jaianco","houda123"},	
			{url_6,"Malay","teeman"},	  //75  
			{url_6,"manit","naivedhya"},
			{url_6,"remote","remote"},
			{url_3,"dianco1","dianco1"},  // Corrected Will pass
			{url_6,"Trillion","Star"},
			{url_6,"Nobuma","Nobuma"},
		
			{url_6,"lieve","mikul"},			
			{url_6,"640201","640201Neel"},			
			{url_6,"NISHANTBV","N1KUNJ"},    //83       		
			{url_b,"server","connect"},
			{url_6,"TANYAS","ABHISHEK@10497"},
			{url_6,"Swintu","Diam"},
			{url_6,"Paras","Gems"},
			{url_6,"PANINT","Paras@83"},
			{url_6,"Dubai","Server"}, 
		    {url_6,"Antwerp","Server"},
			
		    {url_6,"India","Server"},			
			{url_6,"ANS","DIAM"},		
			{url_6,"Helics","Gemb"},	      //F       
			{url_6,"ABASSHER","LUCAS"},
			{url_6,"GPN","MICROGEMS"},
			{url_6,"V6DEMO","HARERAM@1818"},		// Total - 96			             		 							
	      
			};		
	}   
	}
