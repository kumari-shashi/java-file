package com.tyss.oopsProgram.cstroverloading;

public class TextBox {

	public static void main(String[] args) {
		Box b1 = new Box(12,45,67);
		Box b2 = new Box();
		Box b3 = new Box(45);
		double vol;
		System.out.println(vol = b1.volume());
		System.out.println(vol = b2.volume());
		System.out.println(vol = b3.volume());
		

	}

}
