package com.Sessions;

import org.testng.annotations.Test;

public class AnnotationsTest {

	/*@Test
	public void test1() {
		System.out.println("This is test1");
	}
	
	@Test(dependsOnMethods="test1")
	public void test2() {
		System.out.println("This is test2");
//		int i=10/0;
	}
	
	@Test(dependsOnMethods="test2")
	public void test3() {
		System.out.println("This is test3");
	}
	
	@Test(dependsOnMethods="test2",invocationCount=3)
	public void test4() {
		System.out.println("This is test4");
	}
	*/
	/*@Test(invocationTimeOut=2)
	public void test5() {
		while(true)
			System.out.println("Hi");
	}*/
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void test5() {
		int i =10/0;
	}

}
