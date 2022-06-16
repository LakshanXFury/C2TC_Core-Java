package com.cg.num;

public class ExEnum {
	enum Day{
		Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
	}
	public static void main(String[] args) {
Day day = Day.Sunday;
switch(day) {
case Sunday:
	System.out.println("moving towarrds Monday");
	break;
case Friday:
	System.out.println("Hurrah!! weekend");
	break;
default:
	System.out.println("other day");
}
	}

}
