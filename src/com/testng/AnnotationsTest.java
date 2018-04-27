package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest
{
	@Test
	public void testMethod2()
	{
		System.out.println("Test Method2");
	}
@Test
public void testMethod1()
{
	System.out.println("Test Method1");
}
@BeforeTest
public void before()
{
	System.out.println("Before Test");
}
@AfterTest
public void after()
{
	System.out.println("After Test");
}
}
