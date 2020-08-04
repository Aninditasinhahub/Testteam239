package aut1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orbitz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver"); 

WebDriver driver=new ChromeDriver();

driver.get("https://www.orbitz.com/");
driver.manage().window().maximize();
   driver.findElement(By.id("primary-header-hotel"));
String fsize = driver.findElement(By.id("primary-header-hotel")).getCssValue("font-size");

if(fsize.equals("15px")) {
	System.out.println("Font size"+ fsize);
	System.out.println("TC is pass");
}
else {
System.out.println(" TC is fail");}

driver.navigate().back();
driver.findElement(By.id("primary-header-flight"));
String fsize2= driver.findElement(By.id("primary-header-flight")).getCssValue("font-size");
System.out.println("font-size"+ fsize2);

driver.navigate().back();
driver.findElement(By.id("primary-header-package"));

String fsize3= driver.findElement(By.id("primary-header-package")).getCssValue("font-size");

System.out.println("font-size"+fsize3);

driver.navigate().back();
driver.findElement(By.id("primary-header-car"));

String fsize4= driver.findElement(By.id("primary-header-car")).getCssValue("font-size");
System.out.println("font-size"+fsize4);
driver.navigate().back();
driver.findElement(By.id("primary-header-vacationRental"));
String fsize5=driver.findElement(By.id("primary-header-vacationRental")).getCssValue("font-size");

System.out.println("font-size"+fsize5);










	}

}
