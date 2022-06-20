package com.tns.CollectionFramework;

import java.util.LinkedList;


public class LinkedlistDemo {
	public static void main(String[] args)
	{
		LinkedList <String> names = new LinkedList();
		
		names.add("John");
		names.add("Anish");
		names.add("Vittal");
		names.add("Ameen");
		names.add("Ikram");
		names.addFirst("Nigga");
		names.addLast("Ironman");
		System.out.println("Intial list:" +names);
		names.offer("Anne");
		System.out.println("Final list"+names);
		
	}

}
