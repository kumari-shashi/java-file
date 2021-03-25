package com.tyss.oopsProgram.overloading;

public class UseDemo {

	public static void main(String[] args) {
		byte a =25;
		Demo.show(a);// show method with byte argument
		
		Demo.show("java");
		Demo.show(2345);
		Demo.show('A');// ASCII value of a because char is not avilable
		//so it is returning the higher datatype than char
		
//		Demo.show(123.456);   //compile time error
	}

}
