package Objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Crmloginor {

static WebElement element=null;

public static WebElement email1(WebDriver driver) {
element =driver.findElement(By.xpath("//input[@placeholder='E-mail address']"));

return element;}
public static WebElement password1(WebDriver driver) {
element=driver.findElement(By.xpath("//input[@placeholder='Password']"));
return element;
}
public static WebElement login (WebDriver driver) {
	element=driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
return element;
}
public static WebElement forgotpassword(WebDriver driver) {
	
element= driver.findElement(By.xpath("//body/div[@id='ui']/div[@class='ui middle aligned center aligned grid']/div[@class='column']/div[1]"));	
	
return element;	}
	
	
	
}
