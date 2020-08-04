package aut1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orbitz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/jayantasinha/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nyandcompany.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.orbitz.com");
	WebElement Hotel=	driver.findElement(By.xpath("//button[@id='tab-hotel-tab-hp']//span[@class='icon icon-hotels']"));//webelement hotel is displayed
	boolean Hotelboolean=	Hotel.isDisplayed();
	System.out.println("Hotel is Displayed");//true
	WebElement searchbutton=driver.findElement(By.xpath("//form[@id='gcw-hotel-form-hp-hotel']//button[contains(@class,'btn-primary btn-action gcw-submit')]"));
	boolean searchbuttonboolean=searchbutton.isDisplayed();
	System.out.println("searchbutton is displayed");//true
WebElement espanol=	driver.findElement(By.xpath("//a[@id='header-language-2058']"));
boolean espanolboolean=espanol.isDisplayed();
System.out.println("espanol is Displayed");//true
Point espanolpoint=	espanol.getLocation();
System.out.println("The x cordinate is:"+espanolpoint.x+ "& y cordinate is:"+espanolpoint.y);
String actualespanolfontsize=espanol.getCssValue("font-size");	
	System.out.println(espanol.getCssValue("font-size"));
	String expectedespanolfontsize=("13px");
	if(actualespanolfontsize.equals(expectedespanolfontsize)) {
		System.out.println("espanolfontsize Tc is pass");
	}
	else {
		System.out.println("espanolfontsize Tc fail");
	}
	}}