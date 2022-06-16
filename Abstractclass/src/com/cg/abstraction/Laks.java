package com.cg.abstraction;

abstract class Bike{
	abstract void run();
}

class Honda extends Bike{
	void run() {
	System.out.println("It is running safely");
	}
}
	

public class Laks {
	public static void main(String args[]) {
		Honda h = new Honda();
		h.run();
		
		
	}
	
	

}
