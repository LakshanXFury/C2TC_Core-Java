package com.tns.CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class Sets {
	public static void main ( String[] args)
	{
		Set obj = new HashSet();
		obj.add("Technology");
		obj.add("Practice");
		obj.add("Java");
		obj.add(4.56);
		obj.add(1);
		System.out.println(obj);
	}

}
