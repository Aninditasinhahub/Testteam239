package aut1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indeedpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/jayantasinha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.Indeed.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  //isDisplay() method applicable  for all the elements	
boolean b1=driver.findElement(By.id("label-text-input-what")).isDisplayed();
System.out.println(b1);//true

boolean b2=driver.findElement(By.name("q")).isDisplayed();
System.out.println(b2);//true


 boolean b3 =  driver.findElement(By.id("label-text-input-where")).isDisplayed();
System.out.println(b3);// true

driver.findElement(By.xpath("//span[contains(text(),'Post your resume')]")).click();




	}
}