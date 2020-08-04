package aut2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class newtest {
	WebDriver driver;
	@Test
	@Parameters ({"env","browser","URL", "email"})
	  public void yahooLoginTest(String env,String browser,String URL,String email) {//This are call environment variable or configaretion variable 
		  if(browser.equals("chrome")) {
		  System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver"); 

		   driver=new ChromeDriver();}
		  else if (browser.equals("Fairfox")){
			  System.setProperty("webdriver.gecko.driver","/Users/jayantasinha/Downloads/geckodriver"); 

			   driver=new FirefoxDriver();  
		  }
		  
	  driver.get(URL);
	  
		  
		  
		  
		  
		  
		  
	  }
}
