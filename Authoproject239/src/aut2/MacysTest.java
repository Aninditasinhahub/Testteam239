package aut2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class MacysTest {
	WebDriver driver;
  
  @BeforeMethod
  public void setUp() {
	  
	  System.setProperty("webdriver.chrome.driver", "/Users/jayantasinha/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();  //chrome driver launch
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	  driver.get("https://www.macys.com/account/createaccount?cm_sp=my_account-_-sign_in-_-create_account");
  }
  @Test
  public void MacysRegPageTest(String firstname,String lastname,String email,String password,String month,String day) {
	driver.findElement(By.xpath("//input[@id='ca-profile-firstname']")).clear();
	driver.findElement(By.xpath("//input[@id='ca-profile-firstname']")).sendKeys("Anindita"); //firstname
	
	driver.findElement(By.xpath("//input[@id='ca-profile-lastname']")).clear();
	driver.findElement(By.xpath("//input[@id='ca-profile-lastname']")).sendKeys("Sinha");//lastname
	
	driver.findElement(By.xpath("//input[@id='ca-profile-email']")).clear();
	driver.findElement(By.xpath("//input[@id='ca-profile-email']")).sendKeys("Asinha@fcps.edu");//email
	
	driver.findElement(By.xpath("//input[@id='ca-profile-password']")).clear();
	driver.findElement(By.xpath("//input[@id='ca-profile-password']")).sendKeys("Jayanta1");//password
	
	driver.findElement(By.xpath("//select[@id='ca-profile-birth-month']")).clear();
	driver.findElement(By.xpath("//select[@id='ca-profile-birth-month']")).sendKeys("November");//month
	
	driver.findElement(By.xpath("//select[@id='ca-profile-birth-day']")).clear();
	driver.findElement(By.xpath("//select[@id='ca-profile-birth-day']")).sendKeys("28");//day
	
	
	
	
	
  }
  @AfterMethod
  public void tearDown() {
	driver.quit();  
  }

}
