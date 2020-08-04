package aut2;

import org.testng.annotations.Test;

public class InvocationCount {
@Test(invocationCount=10)
public void Sum() {
int a= 5;
int b= 10;
int c=a+b;
System.out.println("The sum is"+c);//This test case run 10 times
}
}
