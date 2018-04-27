package com.vasu.java;

public class Vasu 
{
//varibale
	int a=10;
	//method
	public int add(int i,int j)
	{
		
		int k=i+j;
		return k;
	}
	
	public static void main(String[] args)
	{
		Vasu v=new Vasu();
		
		System.out.println(v.add(30, 40));
	}

}
