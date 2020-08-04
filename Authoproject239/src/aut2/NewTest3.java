package aut2;

import org.testng.annotations.Test;

public class NewTest3 {

	@Test
	public void WebloginHomeLoan() {
	System.out.println("WebloginHomeLoan");	
	}
@Test (groups= {"Smoke"})
public void MobilelogincarLoan(){
System.out.println(" MobilelogincarLoan");	
}
@Test
public void loginAPIHomeLoan() {
System.out.println("APIHomeLoan");	
}
}