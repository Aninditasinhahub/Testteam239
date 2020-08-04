package aut2;

import org.testng.annotations.Test;

public class NewTest1facebook {
  @Test(priority=7)
  public void f() {
  }
  @Test(groups={"smoke"})
  public void module1() {
	System.out.println("This test case from module1");  
  }
  @Test(priority=1)
  public void login() {
	System.out.println("This test case from login");  
  }
 
  @Test (dependsOnMethods= {"addcomment"})
  public void dilitecomment() {
	System.out.println("This test case from dilitecomment");  
  }
  
  
  @Test(dependsOnMethods= {"login"})
  public void addcomment() {
	System.out.println("This test case from addcomment");  
  }
  
  @Test(priority=2)
  public void addphoto() {
	System.out.println("This test case from addphoto ");  
  }
  

  @Test(priority=5)
  public void sharearticle () {
	System.out.println("This test case from sharearticle ");  
  }
  
  
  
  
  
}
