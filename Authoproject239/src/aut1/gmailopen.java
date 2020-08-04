package aut1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailopen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/jayantasinha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	String Title=	driver.getTitle();
		System.out.println(Title);
	String Currenturl=	driver.getCurrentUrl();
		
		System.out.println(Currenturl);
boolean Googlelogo=	driver.findElement(By.xpath("//div[@class='rr0DNb']//*[local-name()='svg']")).isDisplayed();
		
		System.out.println(Googlelogo);//true
		
boolean signin= 	driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).getText().contains("Sign in");
		
		System.out.println("habi jabi\t"+driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).getText());//true
		boolean continuetogmail	=		driver.findElement(By.xpath("//span[contains(text(),'to continue to Gmail')]")).isDisplayed();
				
		System.out.println	(continuetogmail);
		
	driver.findElement(By.id("identifierId")).sendKeys("anindita28.sinha@gmail.com");
boolean nextbutton=	driver.findElement(By.xpath("//span[@class='CwaK9']")).isDisplayed();
	System.out.println(nextbutton);//true
	
WebElement textlink=	driver.findElement(By.xpath("//button[contains(text(),'Forgot email?')]"));
	System.out.println(textlink);
	
	 driver.findElement(By.className("NlWrkb snByac")).click();
	driver.findElement(By.xpath("//div[contains(text(),'For myself')]")).click();
	
	
	
	
	
	}
	

}
