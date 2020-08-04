package aut1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver");	
		WebDriver driver = new ChromeDriver() ;
		driver.get ("http://facebook.com");//URL in the browser
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("terms-link")).click();//facebook terms-links
		System.out.println(driver.getCurrentUrl());
	Set<String>allWindows=	driver.getWindowHandles();
		
	String pagetittle= "Facebook";
		for(String window:allWindows) {		
		if(pagetittle.equals("Facebook")) {
		driver.switchTo().window(window);
		System.out.println(driver.getCurrentUrl());}}
		System.out.println(driver.getCurrentUrl());
		//come back to the Homepage
		driver.switchTo().window("Homepagewindowhandle");
		System.out.println(driver.getCurrentUrl());
		
	}


}