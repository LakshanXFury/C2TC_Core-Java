package com.tns.CollectionFramework;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args)
	{
		TreeSet treeobj = new TreeSet();
		treeobj.add("A");
		treeobj.add("a");
		treeobj.add("B");
		treeobj.add("L");
		treeobj.add(null);
		System.out.println("Tree set elements:"+treeobj);
	}

}
