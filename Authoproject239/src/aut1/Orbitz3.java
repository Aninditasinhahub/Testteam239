package aut1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orbitz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver"); 

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.orbitz.com/");
String homepagewindowhandle	=	driver.getWindowHandle();
System.out.println(homepagewindowhandle);
		driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
WebElement joinreward=		driver.findElement(By.xpath("//div[@class='rewardsBadge']"));
	joinreward.click();	
	System.out.println(driver.getCurrentUrl());
Set<String>allwindows=	driver.getWindowHandles();
String pagetitle="orbitz";
for(String window:allwindows) {
if(pagetitle.equalsIgnoreCase("orbitz"))	{	
	driver.switchTo().window(window);
	System.out.println(driver.getCurrentUrl());//test case pass
	
	System.out.println(driver.getCurrentUrl());
	driver.switchTo().window(homepagewindowhandle);
	System.out.println(driver.getCurrentUrl());
	}

}
}}