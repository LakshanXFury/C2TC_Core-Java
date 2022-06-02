package com.cg.inheritance;

public class MainModule {
	public static void main(String[]args) {
		Mobile mobileobject = new Mobile("windows","windows","recent",16000.00);
		System.out.println(mobileobject.getModel());
		System.out.println(mobileobject);
		
		Blackberry blackberryobj = new Blackberry("Blackberry","blackberry","keyone",20000.00);
		System.out.println(blackberryobj.getModel());
		System.out.println(blackberryobj);
		
		Andriod andriodobj = new Andriod("Andriod","andriod","dafq",70000.00);
		System.out.println(andriodobj.getModel());
		System.out.println(andriodobj);
		
	}

}
