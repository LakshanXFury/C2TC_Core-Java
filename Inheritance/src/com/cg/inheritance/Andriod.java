package com.cg.inheritance;

public class Andriod extends Mobile{

	public Andriod(String manufacturer, String operating_system, String model, double cost) {
		super(manufacturer, operating_system, model, cost);
		// TODO Auto-generated constructor stub
	}
	public String getModel() {
		return "This is Superclass method: " + this.model;
	}

}
