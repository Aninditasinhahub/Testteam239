package aut1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver");	

WebDriver driver=new ChromeDriver ();
driver.get("https://www.Amazon.com");//Browser hit the url

driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
driver.manage().deleteAllCookies();
String actualTitle=driver.getTitle();
System.out.println(actualTitle );//validate browser hit the title
String ExpectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
if(actualTitle.equals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {	
System.out.println("This test case  is pass "+ actualTitle );//validate browser hit the current url
}else {
	System.out.println("Title test case is fail");
	}


driver.navigate().forward();
driver.navigate().back();
driver.quit();


}
}