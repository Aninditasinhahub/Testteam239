package aut1;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver");	
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://javascript.info/alert-prompt-confirm ");
		
		//WebElement sa= driver.findElement(By.xpath("//div[@class='content']//div[4]//div[1]//div[1]//div[1]//a[1]"));
		//sa.click();
		
		//Alert salert= driver.switchTo().alert();
		//Thread.sleep(10000);
		//salert.accept();
		
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Create Accou")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//tr[3]//td[3]//input[1]")).sendKeys("Anindita Sinha");
		driver.findElement(By.xpath("//tr[7]//td[3]//input[1]")).sendKeys("anindita28.sinha@rediffmail.com");
		driver.findElement(By.cssSelector("table.f14:nth-child(3) tbody:nth-child(1) tr:nth-child(10) td:nth-child(3) > input:nth-child(1)")).sendKeys("Jayanta1234");
		driver.findElement(By.xpath("//tr[11]//td[3]//input[1]")).sendKeys("Jayanta1234");
		driver.findElement(By.xpath("//div[@id='div_altemail']//input")).sendKeys("jayanta21.sinha@gmail.com");
	 	driver.findElement(By.xpath("//body//div[@id='div_mob']//div//div[1]"));
	 	driver.findElement(By.id("mobno")).sendKeys("5712014487");
	 	WebElement Day=driver.findElement(By.xpath("//tr[22]//td[3]//select[1]"));
	 	Day.click();
	 
	 	//List<WebElement>links=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	 	Select s = new Select(driver.findElement(By.id("//tr[22]//td[3]//select[1]")));
	 	s.selectByIndex(28);;
	 	driver.findElement(By.id("//tr[22]//td[3]//select[1]")).sendKeys(Keys.RETURN);
	 	
	 	driver.findElement(By.xpath("//body//select[2]")).sendKeys("11");
	 	
	 	driver.findElement(By.xpath("//body//select[3]")).sendKeys("1981");
	 	driver.findElement(By.xpath("//tr[24]//td[3]//input[2]")).isSelected();
	 	driver.findElement(By.id("country")).click();
	 	driver.findElement(By.xpath("//input[@class='captcha']")).sendKeys("FCCD");
	 	driver.findElement(By.id("Register")).click();
		
	 	
		
		
		
		
		
		
		
		
		
	}

}
