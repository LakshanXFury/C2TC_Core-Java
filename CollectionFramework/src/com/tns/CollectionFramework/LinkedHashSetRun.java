package com.tns.CollectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetRun {
	public static void main(String[] args) {
		LinkedHashSet <String> linked = new LinkedHashSet<>();
		linked.add("Rahul");
		linked.add("Fail");
		linked.add("AB+");
		linked.add("Da");
		System.out.println("values are" + linked);
		Object[] a = linked.toArray();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
