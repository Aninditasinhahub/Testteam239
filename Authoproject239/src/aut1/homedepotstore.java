package aut1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homedepotstore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver");	
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
List<WebElement>links= driver.findElements(By.tagName("a"));

int numberoflinks =links.size();

System.out.println("numberoflinks");

for(WebElement w:links) {
	System.out.println(w.getAttribute("href"));	
	
}

driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div[1]/div[4]/div/ul/li[1]/a"));
driver.findElement(By.xpath("//a[@class='MainFlyout__link'][contains(text(),'Cleaning')]"));
		
	driver.findElement(By.linkText("Cleaning Tools"));	
		
		
		
		
		
	}

}
