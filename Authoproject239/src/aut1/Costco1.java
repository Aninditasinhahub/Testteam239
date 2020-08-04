package aut1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Costco1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "/Users/jayantasinha/Downloads/chromedriver");	
		
	WebDriver driver=new ChromeDriver();	
		
	driver.get("https://www.costco.com/");	
	driver.findElement(By.id("header_sign_in")).click();
	driver.findElement(By.xpath("//input[@name='logonId']")).sendKeys("anindita28.sinha@gmail.com");;
	driver.findElement(By.name("logonPassword")).sendKeys("Motimamon@3");
	driver.findElement(By.xpath("//form[@name='LogonForm']//div[5]")).click();	
	
	
	
	
	
	
	driver.findElement(By .id("myaccount-d"));
		
	driver.findElement(By.xpath("//ol[@class='dropdown dropdown-link-navigation']//input[@class='primary']")).click();
	}

}
