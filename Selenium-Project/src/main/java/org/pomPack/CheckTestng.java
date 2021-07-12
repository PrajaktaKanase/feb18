package org.pomPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckTestng {
	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
	@Test
	public void test3() {
		System.out.println("Test 3");
	}
	
    @AfterMethod
    public void aftermethod() {
		System.out.println("AfterMethod");
	}
    
    @AfterClass
    public void afterclass() {
		System.out.println("AfterClass");
	}
    
    
    @BeforeClass
    public void beforclass () { 
		System.out.println("BeforeClassd");
	}
    
	@BeforeMethod
	public void beforemethod () {
		System.out.println("BeforeMethod");
	}
	
}
