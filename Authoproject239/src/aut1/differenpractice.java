package aut1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class differenpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver") ;
		
	WebDriver driver=new ChromeDriver();	
	driver.get("https://www.cnn.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20 ,TimeUnit.SECONDS);
	String Tittle= driver.getTitle();

	System.out.println(Tittle);
	
	//String pagesource= driver.getPageSource();
	//System.out.println(pagesource);
	
      String url=	driver.getCurrentUrl();
       System.out.println(url);
driver.get("https://www.macys.com");
 WebElement searchfield     =   driver.findElement(By.id("globalSearchInputField"));


Dimension searchfieldDim= searchfield.getSize();//searchfield height and width
System.out.println(searchfieldDim.getHeight());
System.out.println(searchfieldDim.getWidth());	
String fsize =driver.findElement(By.xpath("//div[contains(@class,'')]//div[2]//ul[1]//li[1]//div[1]//div[1]//picture[1]//img[1]")).getCssValue("font-size");
if(fsize.equals("16PX")) {
System.out.println("font-size"+fsize);//font-size
System.out.println("Tc is pass");}
else {
	System.out.println("Tc is fail");
}
driver.close();
	}

}
