package aut1;



import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtubewindowhandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/jayantasinha/Downloads/chromedriver");	
		WebDriver driver =new ChromeDriver();
        driver.get("https://www.youtube.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//driver.findElement(By.xpath("//ytd-topbar-logo-renderer[@id='logo']//div[@id='logo-icon-container']"));
	
 WebElement allrecomendetion =  driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'All recommendations')]"));
		
	}}		
