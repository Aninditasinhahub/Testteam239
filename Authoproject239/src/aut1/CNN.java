package aut1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CNN {public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver");	
	WebDriver driver = new ChromeDriver();
	driver.get("https://cnn.com");
	
	if(driver.getTitle().equals("CNN - Breaking News, Latest News and Videos"))
			{
		System.out.println("Pass");
			}
	
	else {
		System.out.println("fail");
	}
	String acurl = driver.getCurrentUrl();
	System.out.println("acurl");
		
	String pagesource = driver.getPageSource();
	System.out.println("pagesource");
	
	
	
	driver.navigate().to("http://goole.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
}
}
