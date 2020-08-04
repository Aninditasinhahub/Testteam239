package aut1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelements2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "/Users/jayantasinha/Downloads/chromedriver");
		
	WebDriver driver=new ChromeDriver()	;
		
	driver.get("https://www.orbitz.com/");	
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	List<WebElement> links=	driver.findElements(By.tagName("a"));
	
int numberoflinks=	links.size();

System.out.println("numberoflinks");

for(WebElement l : links) {
System.out.println(l.getAttribute("href"));	
}

		
		
	}

}
