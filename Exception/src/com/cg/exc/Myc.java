package com.cg.exc;

public class Myc {
	public static void main(String args[])
	{
		System.out.println(Myc.mymeth());
	}
	public static int mymeth()
	{
		try
		{
			return 0;
		}
		finally
		{
			System.out.println("this is finally block");
			System.out.println("Finally block ran even after try block");
		}
	}


}
