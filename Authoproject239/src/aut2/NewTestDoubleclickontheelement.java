package aut2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewTestDoubleclickontheelement  {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver_3"); 
	  WebDriver driver=new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
	driver.get("https://artoftesting.com/sampleSiteForSelenium");  
	  
	 Actions a=new Actions(driver); 
	  
	WebElement DoubleClickButton= driver.findElement(By.id("dblClkBtn"));
	  
	  a.contextClick(DoubleClickButton).build().perform();
	 
	  DoubleClickButton.click();
	  Alert alert=driver.switchTo().alert();//driver go to alertpage`
	  
	  alert.getText();
	  System.out.println(alert.getText());
	  String text=alert.getText();
	  if(text.equals("Hi! Art Of Testing, Here")) {
		  
	  
	  System.out.println("correct alert message");
	  }
	  else {
		  System.out.println("in correct alert message");
	  }
	  alert.accept();
	  
	  
  }
}
