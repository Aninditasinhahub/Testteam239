package aut1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NYC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/jayantasinha/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nyandcompany.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		// Ensure that the page title is Women's Clothes & Accessories | Shop at New York & Company
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle="Women's Clothes & Accessories";
		
		if (actualTitle.equals(expectedTitle)) {

			System.out.println("Test case is pass"+actualTitle);//Women's Clothes & Accessories | Shop at New York & Company

		} else {
			System.out.println("Testcase is  Fail");
		}
		System.out.println("Eva Mendes");

		// ENsure that the menu items Eva Mendes are displayed and when clicked direct to the expected page
		//store the evaMandes WebElements
		WebElement evaMendes = driver.findElement(By.xpath("//a[@class='cat-link'][contains(text(),'Eva Mendes')]"));
		boolean evaMendesisDisplayedBoolean = evaMendes.isDisplayed();

		System.out.println(evaMendesisDisplayedBoolean  );
		//get the current eva Mendes page URL
		
		
		String evaMandesactualURL=driver.getCurrentUrl();
		System.out.println("The evaMandes page URL is:"+evaMandesactualURL);
		String expectedtitle= "Eva Mendes Collection";
		if(evaMandesactualURL.equals(expectedtitle)) {
			System.out.println("Eva Mendes Tc pass");//True
		}
		else {
			System.out.println("Eva Mendes Tc fail");//False
		}
		evaMendes.click();	 
		driver.navigate().back();		
	
		// GabrielleUnion are displayed and when clicked direct to the expected page

	
 
	
	

		WebElement GabrielleUnion = driver.findElement(By.xpath("//a[@class='cat-link'][contains(text(),'Gabrielle Union')]"));
		boolean GabrielleUnionisDisplayedBoolean = GabrielleUnion.isDisplayed();

		System.out.println(GabrielleUnionisDisplayedBoolean);
		
		//get the current GabrielleUnion  page URL
		String GabrielleUnionactualTitle=driver.getTitle();
		String GabrielleUnionexpectedTitle="Gabrielle Union Collection at New York & Company";
		if(GabrielleUnionactualTitle.equals(GabrielleUnionexpectedTitle)) {
			System.out.println(" GabrielleUnion Tc pass");//True
		}
		else {
			System.out.println("GabrielleUnion Tc fail");
		}
		GabrielleUnion.click();
		driver.navigate().back();	
		// Brands We Love are displayed and when clicked direct to the expected page


WebElement BrandsWeLove = driver.findElement(By.xpath("//a[contains(text(),'Brands We Love')]"));
		boolean BrandsWeLoveboolean  = BrandsWeLove.isDisplayed();
		System.out.println(BrandsWeLoveboolean); 
	//	BrandsWeLove.click();
		
		//driver.navigate().back();
	
			
		
			
			
		WebElement NewArrival = driver.findElement(By.xpath("//a[@class='cat-link'][contains(text(),'New Arrivals')]"));
		boolean NewArrivalboolean = NewArrival.isDisplayed();
		System.out.println(NewArrivalboolean);
		
		NewArrival.click();
		String NewArrivalactualTitle=driver.getTitle();
		String NewArrivalexpectedTitle="New Arrivals: Women's Must Haves Trending Now";
		if(NewArrivalactualTitle.equals(NewArrivalexpectedTitle)) {
			System.out.println("NewArrival TC pass");
		}
		else {
			System.out.println("NewArrival Tc fail");
		}
		
		driver.navigate().back();
		
		
			
		// Log In link in header is displayed to the left
			
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement login = driver.findElement(By.className("header_nav"));
		boolean loginisDisplayed = login.isDisplayed();
		System.out.println(loginisDisplayed);
		Point loginpoint=login.getLocation();
		System.out.println("the x cordinate is:" +loginpoint.x+"& y cordinate is :" +loginpoint.y);
		// Wish list link in header is displayed in font size 10 px
		
	WebElement wishlist= driver.findElement(By.xpath("//a[@id='myWishList']"));
	boolean wishlistboolean =wishlist.isDisplayed();

	if(wishlist.getCssValue("font-size").equals("10px")){
		System.out.println("font-size Tc is pass");}
	else {
		System.out.println("font-size Tc fail");
	}
	
		
	//Ensure the text "F YOU ARE USING A SCREEN READER AND ARE HAVING PROBLEMS USING THIS WEBSITE, PLEASE CALL 1-800-961-9906 FOR ASSISTANCE." is displayed in the footer

	
WebElement footerlink= driver.findElement(By.xpath("/html[1]/body[1]/footer[1]/div[2]/div[1]/div[3]/div[1]/p[1]"));

 boolean footerlinkboolean=footerlink.isDisplayed();
 
 System.out.println(footerlinkboolean);

driver.quit(); 
 
 
 
 
 
}}