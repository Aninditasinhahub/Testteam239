package aut1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/jayantasinha/Downloads/chromedriver_3");
WebDriver driver=new ChromeDriver();

driver.get("https://www.google.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
System.out.println(driver.findElement(By.id("gb_70")).getCssValue("color"));;




driver.findElement(By.xpath("//a[contains(text(),'Help')]"));
driver.navigate().back();
driver.findElement(By.xpath("//a[contains(text(),'Privacy')]"));
driver.navigate().back();
driver.findElement(By.linkText("Terms")).click();

WebElement gmail=driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));//get location gmail 
Point gmail1=gmail.getLocation();
System.out.println("The x cordinator is"+gmail1.x +"The y cordinator is "+ gmail1.y);

WebElement gmail2=driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));

 Dimension gmaila  =  gmail2.getSize();
System.out.println("The Hight is"+ gmaila.height+"The wide is"+gmaila.width);

driver.close();


	}
}
