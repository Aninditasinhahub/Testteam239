package aut2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizeTest2 {

	WebDriver driver;
	
	
	
	
	@Test
	@Parameters({"env","browser","URL","email","password"})
	public void facebookRegPageTest(String env,String browser, String URL,String email,String password) {
		if(browser.equals("Chrome")) {
	System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver"); 
	   driver=new ChromeDriver();
	   }
	
		else if(driver.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","/Users/jayantasinha/Downloads/geckodriver"); 
			   driver=new FirefoxDriver();
			   }
			
		driver.get(URL);
		
	}
	
	
	
	
}
