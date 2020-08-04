package aut2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizeTest1 {

WebDriver driver;	
	
	
@Test	
@Parameters({"env","browser","URL","username","password"})	
public void gmailRegPageTest( String env,String browser,String URL,String username, String password) {
if(browser.equals("Chrome")) {
	System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver_3"); 
	   driver=new ChromeDriver();
}	

else if(driver.equals("Firefox")) {
	System.setProperty("webdriver.gecko.driver","/Users/jayantasinha/Downloads/geckodriver"); 
	   driver=new FirefoxDriver();
	   }
driver.get(URL);
	
}
}