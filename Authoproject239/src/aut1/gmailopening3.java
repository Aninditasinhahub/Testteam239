package aut1;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class gmailopening3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver" );
		
		WebDriver driver=new ChromeDriver()	;
		driver.get("https://accounts.google.com");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
WebElement eng=		driver.findElement(By.xpath("//div[@class='MocG8c B9IrJb LMgvRb KKjvXb']"));	
	eng.click();	
	List< WebElement> links= driver.findElements(By.xpath("//*[@jsname='wQNmvb']"));
System.out.println(links.size());
	for(WebElement  l :links) {
	System.out.println(l.getAttribute("innerText"));
	
	}
	WebElement lan =driver.findElement(By.className("MocG8c B9IrJb LMgvRb"));
	lan.click();
	String actualTitle= driver.getTitle();
	String expectedTitle="Skep jou Google-rekening";
	if(actualTitle.equals(expectedTitle)) {
		System.out.println("TC is pass");
	}
	else {
		System.out.println("TC is fail");
	}
			}
			
		

		
	}

	

	
	


