package aut1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orbitzdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/jayantasinha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orbitz.com");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		
		WebElement rooms =driver.findElement(By.xpath("//select[@class='gcw-toggles-fields gcw-change-submit-text gcw-storeable gcw-clone-rooms-fields sf-flex-track-click']"));
rooms.click();

rooms.sendKeys("2");

WebElement adults= driver.findElement(By.id("hotel-1-adults-hp-hotel"));
adults.click();
adults.sendKeys("5");

WebElement childrens=driver.findElement(By.id("hotel-1-children-hp-hotel"));
childrens.click();
childrens.sendKeys("2");

driver.close();
}
}