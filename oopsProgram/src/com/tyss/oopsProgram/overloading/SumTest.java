package com.tyss.oopsProgram.overloading;

public class SumTest {

	public static void main(String[] args) {
		Sum s = new Sum();
		System.out.println( "sum of three int values " +s.sum(12,23,45));
		System.out.println( "sum of  two int  values "+s.sum(12,23));
		System.out.println("sum of double values " +s.sum(23.456, 67.9076, 789.0986));
		System.out.println("sum of float values "+s.sum(23.455, 45.67, 89.09));
		

	}

}
