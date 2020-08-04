package aut1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bjs {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver");
WebDriver driver= new ChromeDriver();

driver .get("https://www.bjs.com/ ");
if (driver.getTitle().equals("BJs.com - BJ's Wholesale Club")){
	System.out.println(" pass");
}
	
	else {
		System.out.println("Test case is fail");
	}
	driver.navigate().to("https://cnn.com")	;
	 String acurl=driver .getCurrentUrl();
	System.out.println("acturl");
	String pageSource=driver.getPageSource();
	
	driver.navigate().forward();
	driver.navigate().back();
}}
