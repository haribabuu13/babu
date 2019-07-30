package com.pagelibrary.com;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng {
		
@Test(priority=2,dependsOnMethods={"m4"})
public void m1(){
System.out.println("Test m1 is executed");
}
@BeforeMethod
public void m2(){
System.out.println(" Before Method is executed");
}
@BeforeTest
public void m3(){
System.out.println("BeforeTest is executed");
}
@Test(priority=1)
public void m4(){
System.out.println("Test m4 is executed");
}
@AfterMethod
public void m5(){
System.out.println("AfterMethod  is executed");

}
@AfterTest
public void m6(){
System.out.println("AfterTest is executed");
}
}
