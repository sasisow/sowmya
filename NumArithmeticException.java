package com.devlabs.assignment2;

public class Arithmetic {
	public static void main(String[] args)
	{
		int n1,n2,n3;
		n1=10;
		n2=0;
	try{
		n3=n1/n2;	
		System.out.println("Result is: " + n3);
	}
		
	catch(ArithmeticException ae) 
	{
		ae.printStackTrace();
		ae.toString();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		
	n3=n1+n2;
	System.out.println("Result is "+n3);
	}
}	
