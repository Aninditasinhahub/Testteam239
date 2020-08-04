package aut1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Athome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver");	
		
		WebDriver driver=new ChromeDriver();	
	driver.get("https://www.athome.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
boolean b1=	driver.findElement(By.id("departments")).isDisplayed();
	System.out.println(b1);//true
	boolean b2= driver.findElement(By.xpath("//div[@class='search hidden-sm-down']//input[@placeholder='Search']")).isDisplayed();
	System.out.println(b2);//true
	//driver.findElement(By.xpath("//div[@class='search hidden-sm-down']//input[@placeholder='Search']")).sendKeys("rugs");

	driver.findElement(By.xpath("//div[@class='user hidden-sm-down my-account-wrapper main-nav-ip']//span[@class='user-message'][contains(text(),'Insider Perks Log in')]")).click();
	driver.findElement(By.id("login-form-email")).sendKeys("anindita28.sinha@gmail.com");
	driver.findElement(By.id("login-form-password")).sendKeys("Jayanta1");
	driver.findElement(By.xpath("//button[@class='sign-in btn btn-block btn-primary']")).click();
boolean b3=	driver.findElement(By.xpath("//button[@class='sign-in btn btn-block btn-primary']")).isSelected();
System.out.println(b3);//true
	}

}
