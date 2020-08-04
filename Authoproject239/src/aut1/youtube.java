package aut1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome driver", "/Users/jayantasinha/Downloads/chromedriver");
WebDriver driver =new ChromeDriver();

driver.get("https://www.youtube.com/");//URL hit
System.out.println(driver.getTitle());// validate if your page title is correct
System.out.println(driver.getCurrentUrl());//validate  if you are landed on correct url
driver.navigate().to("https://cnn.com"); //hit other url
driver.navigate().back();
driver.navigate().forward();
driver.close();//it close current browser only
driver.quit();//it close all the  browser that run by selenium 

	}

}
