package com.vasu.java;

import java.util.Scanner;

public class IfElseTest
{
	public static void main(String[] args)
	{
		//program to check the given no is Even or Odd number
		//int n=47;
		//reading data from keyboard
		Scanner sc=new Scanner(System.in);
	   int  n=sc.nextInt();
		
		if (n%2==0)
		{
			System.out.println("The given no is Even Number");
		}else
		{
			System.out.println("The given no is Odd Number");
		}

	}

}
