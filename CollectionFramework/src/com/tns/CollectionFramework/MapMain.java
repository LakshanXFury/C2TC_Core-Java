package com.tns.CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapMain {
	public static void main(String[] args)
	{
		Map<Integer,String> map1= new HashMap<>();//insertion order not preserved
		map1.put(100, "Anish");
		map1.put(45,"Robert");
		map1.put(66, "Lakshan");
		for(Map.Entry m:map1.entrySet())
		{
		System.out.println(m.getKey()+"="+m.getValue());//to iterate through entries
		}
		Iterator<Integer> iterObj = map1.keySet().iterator();
		while(iterObj.hasNext())
		{
			int key=iterObj.next();
			System.out.println(key+ " "+map1.get(key));
		
	}
}
}