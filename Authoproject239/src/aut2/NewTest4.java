package aut2;

import org.testng.annotations.Test;

public class NewTest4 {
  @Test 
  public void f() {
	  System.out.println("This TC pass");
  }
  @Test
  public void f1() {
	System.out.println("This is ");  
  }
  @Test(groups= {"smoke"})
  public void f2() {
	  System.out.println("This is from f2 method");
  }
  @Test
  public void f3() {
	  
  }
}
