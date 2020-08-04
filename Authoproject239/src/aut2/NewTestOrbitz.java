package aut2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class NewTestOrbitz {
  WebDriver driver;
	
	
  @BeforeMethod
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver_3"); 
	   driver=new ChromeDriver();  
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS );
	  driver.get("https://www.orbitz.com/");
  }

  
  @Test
  public void OrbitzDealsPage() throws InterruptedException {
WebElement dealsbutton=	driver.findElement(By.xpath("//a[@id='primary-header-deals']")); 	  
dealsbutton.click();	  
	boolean hotelbuttonboolean =driver.findElement(By.xpath("//button[@id='tab-hotel']")).isDisplayed();
	  
	  System.out.println("hotelbuttonboolean isDisplayed Test case is True ");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//input[@id='H-destination']")).sendKeys("Florida");
	  driver.findElement(By.xpath("//input[@id='H-fromDate']")).sendKeys("7/30/2020");
	  
	  driver.findElement(By.xpath("//input[@id='H-toDate']")).sendKeys("8/03/2020");
	  
	  Select sel1=new Select(driver.findElement(By.xpath("//select[@id='H-NumRoom']")));
	  sel1.selectByValue("2");
	  Select sel2=new Select(driver.findElement(By.id("H-NumAdult1")));
			  
		sel2.selectByValue("2");	  
		Select sel3=new Select(driver.findElement(By.id("H-NumChild1")));
		sel3.selectByValue("2");
			  
		driver.findElement(By.className("btn-primary btn-action")).click();	  
  }
  
   
  @AfterMethod
  public void browserClose() {
	driver.close() ; 
  }

 /* @DataProvider(name="OrbitzTestData")
  public Object[][] passData() {
     Object[][]data=new Object [7][6];
      data[0][0]="AID1";
      data[0][1]="7/31/2020";
      data[0][2]="8/05/2020";
      data[0][3]="3";
      data[0][4]="3";
      data[0][5]="3";
      
      data[0][0]="AID2";
      data[0][1]="7/20/2020";
      data[0][2]="8/04/2020";
      data[0][3]="5";
      data[0][4]="5";
      data[0][5]="5";
      
      data[0][0]="AID3";
      data[0][1]="7/21/2020";
      data[0][2]="8/06/2020";
      data[0][3]="4";
      data[0][4]="4";
      data[0][5]="4";
      
      data[0][0]="AID";
      data[0][1]="7/30/2020";
      data[0][2]="8/03/2020";
      data[0][3]="2";
      data[0][4]="2";
      data[0][5]="2";
      
      data[0][0]="AID4";
      data[0][1]="7/10/2020";
      data[0][2]="8/14/2020";
      data[0][3]="6";
      data[0][4]="6";
      data[0][5]="6";
      
      data[0][0]="AID5";
      data[0][1]="7/22/2020";
      data[0][2]="8/24/2020";
      data[0][3]="7";
      data[0][4]="7";
      data[0][5]="7";
      
      data[0][0]="AID6";
      data[0][1]="7/29/2020";
      data[0][2]="8/14/2020";
      data[0][3]="8";
      data[0][4]="8";
      data[0][5]="8";
      return data;*/
    };
  
  
