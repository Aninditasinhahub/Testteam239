package aut2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizeTest {
	
	WebDriver driver;
	
  @Test
  @Parameters ({"env","browser","URL", "email"})
  public void yahooLoginTest(String env,String browser,String URL,String email) {//This are call environment variable or configaretion variable 
	  if(browser.equals("Chrome")) {
	  System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver"); 

	   driver=new ChromeDriver();}
	  else if (browser.equals("Fairfox")){
		  System.setProperty("webdriver.gecko.driver","/Users/jayantasinha/Downloads/geckodriver"); 

		   driver=new FirefoxDriver();  
	  }
	  //System.out.println(URL);
  driver.get(URL);
 // driver.findElement(By.xpath("//input[@id='login-username']")).click();
	//driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("email"); //enter username 
	// driver.findElement(By.xpath("//input[@id='login-signin']")) .click();//click on the next button 
	  
	  
	  
	  
	  
	  
	  
  }
}
