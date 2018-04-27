package com.vasu.java;

public class StringComparisionTest {

	public static void main(String[] args)
	{
		/*String data="vasu";
		String data1="vasu123";
		if (data.equals(data1)) 
		{
			System.out.println("Both Strings are equal");
		}else
		{
			System.out.println("Strings are not equal");
		}
*/
		String data="vasu Deva";
		String data1="Deva";
		
		if (data.contains(data1)) 
		{
			System.out.println("pass");
		}else
		{
			System.out.println("Fail");
		}
		
	}

}
