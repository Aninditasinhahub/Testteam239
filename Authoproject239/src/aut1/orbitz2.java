package aut1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orbitz2  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","/Users/jayantasinha/Downloads/chromedriver" );
		
	WebDriver driver=new ChromeDriver()	;
		
	driver.get("https://www.orbitz.com");
	driver.manage().window().maximize();	
	driver.manage().timeouts().implicitlyWait(30000,TimeUnit.SECONDS);	
	driver.findElement(By.xpath("//li[contains(@class,'tab')]//span[@class='icon icon-flights']")).click();
	driver.findElement(By.id("flight-type-roundtrip-label-hp-flight"));
	driver.findElement(By.xpath("//div[@class='cols-nested']//div[@class='col gcw-location-field']//label[@class='text icon-before autocomplete-arrow gcw-flights-from']//span[@class='label'][contains(text(),'Flying from')]")).click();
	driver.findElement(By.id("flight-origin-hp-flight")).sendKeys("Washington");
	driver.findElement(By.xpath("/html[1]/body[1]/meso-native-marquee[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/form[1]/div[2]/div[2]/div[1]/div[1]/label[1]/span[1]"));
	driver.findElement(By.id("flight-destination-hp-flight")).sendKeys("Kolkata");
	driver.findElement(By.xpath("/html[1]/body[1]/meso-native-marquee[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/form[1]/fieldset[2]/div[1]/div[2]/div[1]/label[1]/span[1]")).click();
	driver.findElement(By.id("flight-departing-hp-flight")).sendKeys("07/02/2020");
	driver.findElement(By.id("flight-returning-hp-flight")).sendKeys("07/15/2020");
			WebElement adults =  driver.findElement(By.id("flight-adults-hp-flight"));
	adults.sendKeys("4");
	
	WebElement childrens = driver.findElement(By.id("flight-children-hp-flight"));
	childrens.sendKeys("2");
	WebElement childsage1 = driver.findElement(By.id("flight-age-select-1-hp-flight"));
	childsage1.sendKeys("7");
	WebElement childsage2 = driver.findElement(By.id("flight-age-select-2-hp-flight"));
	childsage2.sendKeys("13");
	driver.findElement(By.xpath("//form[@class='gcw-form flights gcw-lessThanNTravelers gcw-childAgesAllProvided gcw-unattendedInfantInLap gcw-allFlightsComplete gcw-allOriginsAreDifferentFromDestinations flexible-shopping-form gcw-dynamic-leg-fields gcw-oneway-packages']//button[contains(@class,'btn-primary btn-action gcw-submit')]")).click();
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
WebElement  hotelbutton=	driver.findElement(By.id("primary-header-hotel"));
	//Dimension of method for height and width  
	Dimension hotelbuttonDim=hotelbutton.getSize();
	System.out.println(hotelbuttonDim.getHeight());
	System.out.println(hotelbuttonDim.getWidth());
	
	Point p= hotelbutton.getLocation();//get location method for height and width
	System.out.println(p.getX());
	System.out.println(p.getY());
	
	
	
	
	
	}
}