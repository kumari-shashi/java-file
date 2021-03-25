package com.tyss.oopsProgram.overloading;

public class Sum {
	public int sum(int x, int y) {
		return (x+y);
		
	}
	protected int  sum(int x, int y, int z) {
		return (x+y+z);
		
	}
	public  double sum (double x, double y, double z) {
		return (x+y+z);
		
	}
	public  float sum (float x, float y, float z) {
		return (x+y+z);
	}
	

}
