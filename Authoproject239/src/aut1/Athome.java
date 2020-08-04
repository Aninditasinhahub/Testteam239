package aut1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Athome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver");	
		
	WebDriver driver=new ChromeDriver();	
driver.get("https://www.athome.com");		
		
driver.findElement(By.cssSelector("div.page:nth-child(2) div.header.container div.row div.col-12 div.navbar-header div.pull-right.store-account-container.row div:nth-child(2) div.user.hidden-sm-down.my-account-wrapper.main-nav-ip a:nth-child(1) > span.user-message")).click();		
driver.findElement(By.id("myaccount-sign-in")).sendKeys("Anindita28.sinha@gmail.com");		
driver.findElement(By.name("loginPassword")).sendKeys("12345678");		
driver.findElement(By.className("sign-in btn btn-block btn-primary")).click();		
driver.quit();		
	}

}
