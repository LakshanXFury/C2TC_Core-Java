package com.tns.CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
	public static void main(String[] args)
	{
		Map<String, String> map1= new HashMap<>();
		map1.put("First", "Prof");
		map1.put("Second", "Berlin");//no insertion order is preserved
		map1.put("Third", "Tokyo");
		map1.put("Fourth", "Rio");
		map1.put("500","Tokyo");//keys should be unique, values can be duplicated
		System.out.println(map1.get("500"));//used to retrieve value,cannot give the value because it returns null
	}

}