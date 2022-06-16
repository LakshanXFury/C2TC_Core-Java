package com.cg.abstraction;

abstract class Movies{
	abstract void setTitle(String s);
	
}
class MyMovie extends Movies{

	@Override
	void setTitle(String s) {
		// TODO Auto-generated method stub
		System.out.println("The title is : " + s);
		
	}
	
}

public class Movie{
	public static void main(String args[]) {
		Movies MyMovie = new MyMovie();
		MyMovie.setTitle(" AVATAR 2 ");
	}
	

}
