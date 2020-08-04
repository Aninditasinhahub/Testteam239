package aut2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTestwwwnewyorklife2 {
	WebDriver driver;
	  @BeforeMethod
	  public void setUp() {
		  System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver_3"); 
		   driver=new ChromeDriver();
		   System.setProperty("webdriver.Fairfox.driver","/Users/jayantasinha/Downloads/gecodriver");
		   driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get("https://www.newyorklife.com/");
	}	 
	  
	  
	  
	  
	  
	  
	  
	  @Test
	  public void f() {
		WebElement whoweare=driver.findElement(By.xpath("//*[@id=\'mega-nav\']/div[1]/a"));  
		 Boolean  whoweareboolean=whoweare.isDisplayed();
		
		 System.out.println("Who we are is Displayed test case pass");
		 Actions action =new Actions(driver);
		 action.moveToElement(driver.findElement(By.xpath("//*[@id=\'mega-nav\']/div[1]/a"))).build().perform();
		 WebElement whoweare1=driver.findElement(By.xpath("//*[@id=\'mega-nav\']/div[1]/a"));
		 whoweare1.click();
		 System.out.println(driver.getCurrentUrl());
		 WebElement text=driver.findElement(By.xpath("//p[contains(text(),'For 175 years, people have worked with New York Li')]"));
		 Boolean textboolean=text.isDisplayed();
		 System.out.println("text isDisplayed ");
		 
		 
		 
		 WebElement ourstory=driver.findElement(By.linkText("OUR STORY"));
		 Boolean  ourstoryboolean=ourstory.isDisplayed();
		 
		 System.out.println("ourstory is Displayed");
		 
		 
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	  @AfterMethod
	  public void closebrowser() {
		 driver.close() ;
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
