package aut2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Objectrepo.Crmloginor;

public class FreeCrmTest {
WebDriver driver;//WebDeiver use gobble, entire the project
	
	
@BeforeMethod	
	public void setUp() {
	System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver_3"); 
	   driver=new ChromeDriver();
 driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	driver.get("https://ui.freecrm.com/");
}	
	
@Test(dataProvider="freecrmData" )	
public void freeCrmLoginPageTest( String username,String password) throws InterruptedException {
//WebElement email1=	driver.findElement(By.xpath("//input[@placeholder='E-mail address']"));
//email1.clear();
//WebElement email2=	driver.findElement(By.xpath("//input[@placeholder='E-mail address']"));
//email2.sendKeys("anindita28.sinha@gmail.com");
Crmloginor.email1(driver).sendKeys(username);	
//WebElement password1 =	driver.findElement(By.xpath("//input[@placeholder='Password']"));
//password1.clear();

//WebElement password2=driver.findElement(By.xpath("//input[@placeholder='Password']"));
//password2.sendKeys("Jayanta1");
Crmloginor.password1(driver).sendKeys(password);	
	//WebElement login=driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
	//login.click();
	Crmloginor.login(driver).click();
	Thread.sleep(5000);
	//Assert.assertTrue(driver.getTitle().contains("dashboard"),"user is not able to login-invalidcredentails");//validate the data
	System.out.println("page Title varified -user is able to login successfully ");
	
	//driver.findElement(By.xpath("//body/div[@id='ui']/div[@class='ui middle aligned center aligned grid']/div[@class='column']/div[1]")).click();
}

	
@AfterMethod	
	public void browserClose() {
	driver.close();
}
@DataProvider(name="freecrmData")
public Object[][]passData() {
Object[][]data=new Object[3][2];
	data[0][0]="anindita1";
	data[0][1]="12345678";
	
	data[1][0]="anindita28.sinha@gmail.com";
	data[1][1]="Jayanta1";
	
	data[2][0]="anindita2";
	data[2][1]="12345678";
	return data ;
}	
	
}
