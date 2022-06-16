package com.cg.exc;

public class except {
	public static void main(String[] args)
	{
		except ob = new except();
		try
		{
			ob.meth1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithrmatic exception thrown by meth1() method caught in main() method");
			
		}
	}
	public void meth1()
	{
		try
		{
			System.out.println(100/0);
		}
		catch(NullPointerException nullExp)
		{
			System.out.println("We have an exception");
		}
		System.out.println("Outside try-catch block");
	}
}