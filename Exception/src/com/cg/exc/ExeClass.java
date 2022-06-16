package com.cg.exc;

public class ExeClass {
	public static void main(String args[])
	{
		ExeClass obj = new ExeClass();
		obj.display();
		
	}
	public void display()
	{
		try 
		{
		System.out.println(100/0);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("This is arithmetic exception block");
		}
	}

}