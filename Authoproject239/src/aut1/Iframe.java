package aut1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.apache.commons.io.FileUtils;
public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver");	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
driver.get("https://www.google.com");


TakesScreenshot ts= (TakesScreenshot)driver;
// capturing screen shot as output type file
File screenshotSRC= ts.getScreenshotAs(OutputType.FILE);
// Defining path and extension of image
String path="/Users/jayantasinha/Downloads/"+System.currentTimeMillis()+".png";
// copying file from temp folder to desired location
File screenshotDest= new File(path);
try {
	FileUtils.copyFile(screenshotSRC, screenshotDest);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}