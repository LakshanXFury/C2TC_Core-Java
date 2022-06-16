package com.cg.exc;


public class MyClass {
	public static void main(String args[])
	{
		int x=10;
		int y=2;
		try
		{
			int z=x/y;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}