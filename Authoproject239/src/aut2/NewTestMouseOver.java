package aut2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Objectrepo.NewTestMouseOverObjectrepository;

public class NewTestMouseOver {
  @Test
  public void f() {
  
  
  
  System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver_3"); 
  WebDriver driver=new ChromeDriver();
driver.get("https://www.overstock.com/");
Actions a=new Actions(driver);
a.moveToElement(NewTestMouseOverObjectrepository.bb(driver)).build().perform();//Bed&Bath element Mouse over action
  
  driver.get("https://artoftesting.com/sampleSiteForSelenium");
  
  WebElement si=driver.findElement(By.id("sourceImage"));   //source image=si
  WebElement tl=driver.findElement(By.xpath("//div[@id='targetDiv']"));//terget=tl mean where to put your source
  a.dragAndDrop(si, tl).perform();
  
  }  
}
