package aut2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class NewTestnewyorklifecom {
  WebDriver driver;
  @BeforeMethod
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver_3"); 
	   driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	driver.get("https://www.newyorklife.com/");
}	  
  

  @Test
  public void f() throws InterruptedException {
	  
	WebElement yearslogo =driver.findElement(By.xpath("//*[@id=\'header\']/div/a/img")); 
	Boolean yearslogoboolean=yearslogo.isDisplayed();
	System.out.println("75yearslogo isDisplayed testcase is passs ");
	
WebElement contactus=	driver.findElement(By.xpath("//*[@id=\'main-nav\']/nav[2]/div[2]/a"));
	
	contactus.click();
	
	WebElement yearslogo1=driver.findElement(By.xpath("//img[@class='brand-logo']"));
	Boolean yearslogo1boolean=yearslogo1.isDisplayed();
	
	System.out.println("75years logo isDisplayed on contactus page  ");
	Thread.sleep(5000);
	Actions action =new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Learn & Compare')]"))).build().perform();
WebElement learnscompare =	driver.findElement(By.xpath("//a[contains(text(),'Learn & Compare')]"));
learnscompare.click();

WebElement COMPAREPRODUCTS =driver.findElement(By.linkText("COMPARE PRODUCTS"));
COMPAREPRODUCTS.click();

WebElement yearslogo2=driver.findElement(By.xpath("//nav[@id='header']"));
Boolean yearslogo2boolean=yearslogo1.isDisplayed();
System.out.println("75years logo isDisplayed on COMPAREPRODUCTS page ");
driver.navigate().back();
System.out.println(driver.getCurrentUrl());




  }
  
  
  
  
  
  
  
  
  
  
  @AfterMethod
  public void closebrowser() {
	 driver.close() ;
  }

}
