package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationTest 
{
@Test
public void verifyTest()
{
	String empName="VasuDeva";
	String empName1="VasuD";
	//validation
	//Assert.assertEquals(empName, empName1, "Both string are not equal");
	Assert.assertEquals(12, 12);
}
}
