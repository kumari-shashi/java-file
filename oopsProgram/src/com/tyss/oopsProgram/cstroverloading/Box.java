package com.tyss.oopsProgram.cstroverloading;

public class Box {
	double width;
	double height;
	double depth;
	//constructor used when all dimensions are available
	public Box(double width, double height, double depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public Box() {
		width = height = depth = 0;
	}
	public Box(double length) {
		width = height = depth = length;
	}
	public double volume() {
		return width * height * depth;
	}
	
	
	
	

}
