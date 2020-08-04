package aut2;

import org.testng.annotations.Test;

public class NewTest5 {
  @Test (priority=1)
  public void loginfieldcheck() {
	  System.out.println("This is from logincheckfield method");
  }
  
  @Test (priority=3)
  public void logincssvaluecheck() {
	  System.out.println("This is from logincssvaluecheck  method");
  }
  
  @Test (priority=2)
  public void loginvalidation() {
	  System.out.println("This is from loginvalidation  method");
  }
   
  @Test (priority=4)
  public void login() {
	  System.out.println("This is from login  method");
  }
  
  
  
  
  
  
  
  
}
