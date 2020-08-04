package aut1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileuploadPopuo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/jayantasinha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
driver.get("https://html.com/input-type-file/");
driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("Macintosh HD⁩ ▸ ⁨Users⁩ ▸ ⁨jayantasinha⁩ ▸ ⁨Desktop⁩/HTML file");
	}

}
