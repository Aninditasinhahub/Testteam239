package aut1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orbitzwindowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver"); 

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.orbitz.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement listyourproperty=	driver.findElement(By.xpath("//a[contains(text(),'List your property')]"));
		
	listyourproperty.click();
	Set<String>allWindows=	driver.getWindowHandles();
	
	
			for(String window:allWindows) {		
				driver.switchTo().window(window);
				if(driver.getTitle().contains("Expedia")) {
					
					System.out.println("Expedia");
					
	driver.findElement(By.xpath("//div[@class='header-button btn-secondary aem-GridColumn aem-GridColumn--default--12']//a[@class='header-button__link']")).click();
					
		System.out.println(driver.getCurrentUrl());			
					
					
				}}
	}}
		




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	